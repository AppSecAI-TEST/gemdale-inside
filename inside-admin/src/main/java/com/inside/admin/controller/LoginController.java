package com.inside.admin.controller;

import com.inside.member.model.Users;
import com.inside.member.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ethan on 2017/7/31.
 */

@Controller
public class LoginController {

    @Autowired
    private UsersService usersService;

    @ResponseBody
    @RequestMapping(value = "test/{id}/{type}",method = RequestMethod.GET)
    public String test(@PathVariable("id") Integer id,@PathVariable("type") Integer type){
        System.out.println("id:"+id+",type:"+type);
        return "login"+id+",type:"+type;
    }

    @ResponseBody
    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable("id") Integer id){
       Users u= usersService.queryById((long)id);
        return u.getNickName();
    }
}
