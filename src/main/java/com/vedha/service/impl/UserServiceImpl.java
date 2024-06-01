package com.vedha.service.impl;

import com.vedha.dto.Users;
import com.vedha.entity.UserEntity;
import com.vedha.repository.UserRepo;
import com.vedha.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    private final JdbcClient jdbcClient;

    @Override
    public List<UserEntity> getAllUsers() {

        return userRepo.findAll();
    }

    public List<Users> getAllUsersFromJdbc() {

        return jdbcClient.sql("SELECT id as userId, name as userName, email as userEmail, role_name as userRole FROM user_view").query(Users.class).list();
    }
}
