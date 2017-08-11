package com.inside;

import com.inside.member.model.Users;
import com.inside.member.service.UsersService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Ethan on 2017/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/applicationContext*.xml")
public class Test {

    @Resource
    private UsersService usersService;

    @org.junit.Test
    public void seaceTest(){
        Users u = new Users();
        u.setNickName("EthanXQ2");
        u.setAvatar("/head.jpg");
        u.setPhone("15827025836");
        Short sex = 1;
        u.setSex(sex);
        usersService.saveByRegister(u);
    }
}
