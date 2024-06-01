package com.vedha.controller;

import com.vedha.dto.Users;
import com.vedha.entity.UserEntity;
import com.vedha.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/v1/all")
    public ResponseEntity<List<UserEntity>> getAllUsers() {

        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/v1/view")
    public ResponseEntity<List<Users>> getAllUsersView() {

        return ResponseEntity.ok(userService.getAllUsersFromJdbc());
    }
}
