package com.inside.member.service.impl;

import com.inside.common.service.impl.BaseServiceImpl;
import com.inside.member.mapper.UserAuthsMapper;
import com.inside.member.model.UserAuths;
import com.inside.member.service.UserAuthsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Ethan on 2017/8/10.
 */
@Service("userAuthsService")
public class UserAuthsServiceImpl extends BaseServiceImpl<UserAuths> implements UserAuthsService{

    @Autowired
    private UserAuthsMapper userAuthsMapper;

}
