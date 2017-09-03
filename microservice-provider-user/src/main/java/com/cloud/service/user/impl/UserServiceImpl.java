package com.cloud.service.user.impl;

import com.cloud.core.AbstractService;
import com.cloud.mapper.UserMapper;
import com.cloud.model.User;
import com.cloud.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractService<User> implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectByid(int i) {
        return userMapper.selectByid(i);
    }
}
