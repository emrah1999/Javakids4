package com.emrah.ecommerce.service;

import com.emrah.ecommerce.entity.UserEntity;
import com.emrah.ecommerce.repository.UserRepository;
import com.emrah.ecommerce.request.RequestAddUserDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final ModelMapper mapper;

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                List.of()
        );
    }



    public void addUser(RequestAddUserDTO requestDTO) {
        UserEntity user = new UserEntity();
        mapper.map(requestDTO, user);
        String password = requestDTO.getPassword();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String bcrPassword = encoder.encode(password);
        user.setPassword(bcrPassword);
        user.setEnabled(1);

        userRepository.save(user);

    }




}

