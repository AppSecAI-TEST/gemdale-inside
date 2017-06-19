package com.inside.business.service;

import com.inside.business.mapper.UserMapper;
import com.inside.business.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User>{

    @Autowired
    private UserMapper userMapper;

}
