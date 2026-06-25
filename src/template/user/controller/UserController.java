package com.example.template.user.controller;

import com.example.template.common.response.ApiResponse;
import com.example.template.user.dto.UserCreateRequest;
import com.example.template.user.dto.UserResponse;
import com.example.template.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ApiResponse<UserResponse> create(@RequestBody UserCreateRequest req) {
        return ApiResponse.ok(userService.create(req));
    }

    @GetMapping
    public ApiResponse<List<UserResponse>> getAll() {
        return ApiResponse.ok(userService.findAll());
    }
}