package com.ysw.ymanage.service.impl;

import com.ysw.ymanage.entity.User;
import com.ysw.ymanage.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(String id) {
        User u=new User();
        u.setId("123456");
        u.setName("张三");
        u.setPassWord("password");
        u.setCreatDate(new Date());
        return u;
    }
}
