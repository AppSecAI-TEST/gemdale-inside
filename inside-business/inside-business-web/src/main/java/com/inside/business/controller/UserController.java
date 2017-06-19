package com.inside.business.controller;


import com.inside.business.pojo.User;
import com.inside.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ethan on 2017/4/25.
 */
@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    /**
     *  根据ID查询
     * @param userId
     * @return
     */
    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("userId") Long userId){
        System.out.print(userId);
        User user = userService.queryById(userId);
        return user;
    }


}
