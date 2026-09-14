package com.elave3.spring.service;

import com.elave3.spring.entity.UserEntity;
import com.elave3.spring.exception.NotFoundException;
import com.elave3.spring.repository.UserRepository;
import com.elave3.spring.request.UserAddRequestDTO;
import com.elave3.spring.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    @Override
    public void addUser(UserAddRequestDTO request) {
        UserEntity userEntity = new UserEntity();
        modelMapper.map(request, userEntity);
        userRepository.save(userEntity);
    }

    @Override
    public UserResponse getUserById(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new NotFoundException("Bu idde user yoxdu","User not found"));
        UserResponse userResponse = new UserResponse();
        modelMapper.map(userEntity, userResponse);
        return userResponse;
    }
}
