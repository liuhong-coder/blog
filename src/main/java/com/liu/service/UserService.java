package com.liu.service;

import com.liu.pojo.User;

public interface UserService {
    User checkUser(String username, String password);
}
