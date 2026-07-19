package com.spring.elave.service;

import com.spring.elave.model.User;
import com.spring.elave.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void createUser(User user){
        userRepository.createUser(user);
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
    public void deleteUser(Long id){
        userRepository.deleteUser(id);
    }
    public List<User> searchForName(String name,String email){
        return userRepository.searchForNameAndEmail(name,email);
    }
}
