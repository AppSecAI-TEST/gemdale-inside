package com.inside.member.service;

import com.inside.common.service.BaseService;
import com.inside.member.model.Users;

/**
 * Created by Ethan on 2017/8/9.
 */
public interface UsersService extends BaseService<Users>{

    /**
     * 注册添加 并 添加一条 手机号登陆认证
     * TODO 后续接入第三方登录
     * @param u
     * @return
     */
    void saveByRegister(Users u);
}
