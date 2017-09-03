package com.cloud.service.user;

import com.cloud.core.IService;
import com.cloud.model.User;

public interface UserService extends IService<User>{
    User selectByid(int i);
}
