package com.cloud.web.controller;

import com.cloud.model.User;
import com.cloud.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonHystrixController {
    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/ribbon/hystrix/{id}")
    public User findById(@PathVariable Long id) {
        return this.ribbonHystrixService.findById(id);
    }
}