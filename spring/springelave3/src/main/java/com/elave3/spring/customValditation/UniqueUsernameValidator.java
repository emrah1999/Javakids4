package com.elave3.spring.customValditation;

import com.elave3.spring.entity.UserEntity;
import com.elave3.spring.repository.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UniqueUsernameValidator implements ConstraintValidator<UsernameUniqueValidation,String> {
    private final UserRepository userRepository;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (username == null) {
            return true;
        }
        Optional<UserEntity> user=userRepository.findByUsername(username);
        if(user.isPresent()){
            return false;
        }
        return true;
    }
}
