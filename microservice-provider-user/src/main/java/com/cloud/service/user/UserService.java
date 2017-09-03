package com.cloud.service.user;

import com.cloud.core.IService;
import com.cloud.entity.User;

public interface UserService extends IService<User>{
    User selectByid(int i);
}
