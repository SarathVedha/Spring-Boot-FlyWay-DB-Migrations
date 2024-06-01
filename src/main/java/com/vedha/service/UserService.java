package com.vedha.service;

import com.vedha.dto.Users;
import com.vedha.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getAllUsers();

    List<Users> getAllUsersFromJdbc();
}
