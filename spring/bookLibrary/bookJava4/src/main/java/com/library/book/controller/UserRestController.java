package com.library.book.controller;

import com.library.book.exception.MyValidationException;
import com.library.book.request.AuthRequest;
import com.library.book.request.RequestUserAddDTO;
import com.library.book.response.AuthResponse;
import com.library.book.service.UserService;
import com.library.book.utils.JwtUtil;
import com.library.book.utils.RefreshTokenUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {
    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final RefreshTokenUtil refreshTokenUtil;

    @PostMapping
    @ResponseStatus(org.springframework.http.HttpStatus.CREATED)
    public void addUser(@RequestBody @Valid RequestUserAddDTO request, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new MyValidationException("Melumat tam deyil","Validaton xeta",bindingResult);
        }
        userService.addUser(request);
    }
    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

            final UserDetails userDetails = userService.loadUserByUsername(authRequest.getUsername());
            final String jwt = jwtUtil.generateToken(userDetails);
            final String refreshToken = refreshTokenUtil.generateRefreshToken(userDetails);

            return ResponseEntity.ok(new AuthResponse(jwt, refreshToken));
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"error\": \"Username or password invalid\"}");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\": \"Something went wrong "+e.getMessage()+"\"}");
        }
    }
}
