package com.ysw.ymanage.service;

import com.ysw.ymanage.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    public User findUserById(String id) ;

}
