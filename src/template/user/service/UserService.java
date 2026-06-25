package com.example.template.user.service;

import com.example.template.user.domain.User;
import com.example.template.user.dto.UserCreateRequest;
import com.example.template.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User create(UserCreateRequest req) {
        return userRepository.save(
                User.builder()
                        .name(req.name())
                        .email(req.email())
                        .build()
        );
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}