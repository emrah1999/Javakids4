package com.library.book.service;

import com.library.book.entity.UserEntity;
import com.library.book.repository.UserRepository;
import com.library.book.request.RequestUserAddDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    public void addUser(RequestUserAddDTO requestUserAddDTO) {
        UserEntity user =new UserEntity();
        modelMapper.map(requestUserAddDTO,user);
        userRepository.save(user);
    }
}
