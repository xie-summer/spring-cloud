package com.cloud.test;

import com.cloud.model.User;
import com.cloud.support.UserFeignClient;

public class FeignController implements UserFeignClient {
    @Override
    public User findByIdFeign(Long id) {
        return null;
    }
}
