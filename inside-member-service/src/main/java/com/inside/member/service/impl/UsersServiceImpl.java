package com.inside.member.service.impl;

import com.inside.common.service.impl.BaseServiceImpl;
import com.inside.member.mapper.UsersMapper;
import com.inside.member.model.UserAuths;
import com.inside.member.model.Users;
import com.inside.member.service.UserAuthsService;
import com.inside.member.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Ethan on 2017/8/9.
 */
@Service("usersService")
public class UsersServiceImpl extends BaseServiceImpl<Users> implements UsersService{

    @Resource
    private UsersMapper usersMapper;


    @Autowired
    private UserAuthsService userAuthsService;

    @Override
    public void saveByRegister(Users u) {
        //1.添加用户
        save(u);
        //2.添加手机号授权登录
        UserAuths ua  = new UserAuths();
        ua.setUserId(u.getId());
        ua.setIdentityType("phone");
        ua.setIdentifier(u.getPhone());
        ua.setCredential("123456");
        userAuthsService.save(ua);
    }
}
