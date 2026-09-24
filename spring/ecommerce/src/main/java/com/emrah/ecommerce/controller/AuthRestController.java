package com.emrah.ecommerce.controller;

import com.emrah.ecommerce.exception.MyProjectException;
import com.emrah.ecommerce.exception.ValidateProjectException;
import com.emrah.ecommerce.request.AuthRequest;
import com.emrah.ecommerce.request.RequestAddUserDTO;
import com.emrah.ecommerce.response.AuthResponse;
import com.emrah.ecommerce.service.UserDetailsServiceImpl;
import com.emrah.ecommerce.utils.JwtUtil;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthRestController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;


    @PostMapping("/register")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@Valid @RequestBody RequestAddUserDTO requestDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ValidateProjectException("Məlumatların tamlığı pozulub", "Validation Error", bindingResult);
        }
        userDetailsService.addUser(requestDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

            final UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getUsername());
            final String jwt = jwtUtil.generateToken(userDetails);

            return ResponseEntity.ok(new AuthResponse(jwt));
        } catch (BadCredentialsException e) {
            throw new MyProjectException("Yanlış istifadəçi adı və ya şifrə", "Authentication Failed");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\": \"Something went wrong\"}");
        }
    }


}
