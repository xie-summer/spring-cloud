package com.cloud.test;

import com.cloud.model.User;
import com.cloud.support.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private UserFeignClient userFeignClient;
    @GetMapping(value = "/{id}")
    public User findByIdFeign(@PathVariable("id") Long id) {
        return userFeignClient.findByIdFeign(id);
    }
}
