package com.cloud.web.controller;

import com.cloud.model.User;
import com.cloud.support.UserFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserFeignHystrixClient userFeignHystrixClient;
    @GetMapping(value = "/{id}")
    public User findByIdFeign(@PathVariable("id") Long id) {
        return userFeignHystrixClient.findByIdFeign(id);
    }
}
