package com.itsartyomka.springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// Class for Working with the User
@Service // <-- Means that the class is noted as a bean Spring object.
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User getById(Long id) {
        if (userRepository.findById(id).isPresent()){
            return userRepository.findById(id).get();
        }
        return null;
    }
}
