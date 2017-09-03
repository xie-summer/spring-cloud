package com.cloud.mapper;

import com.cloud.core.Mapper;
import com.cloud.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends Mapper<User> {
    @Select("select * from user where id = #{id}")
    public User selectByid(@Param("id") Integer id);
}
