package com.library.book.service;

import com.library.book.entity.RoleEntity;
import com.library.book.entity.UserEntity;
import com.library.book.repository.AuthoritiesRepository;
import com.library.book.repository.UserRepository;
import com.library.book.request.RequestUserAddDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final AuthoritiesRepository authoritiesRepository;
    public void addUser(RequestUserAddDTO requestUserAddDTO) {
        UserEntity user =new UserEntity();
        modelMapper.map(requestUserAddDTO,user);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String bcrPassword = encoder.encode(requestUserAddDTO.getPassword());
        user.setPassword(bcrPassword);        user.setEnabled(1);
        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                mapRolesToAuthorities(user.getRoles())
        );
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Set<RoleEntity> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
