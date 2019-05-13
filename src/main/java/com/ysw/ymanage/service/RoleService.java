package com.ysw.ymanage.service;

import org.springframework.stereotype.Service;

import java.util.Set;
public interface RoleService {
    public Set<String> getRolesByUserId(String uid);
}
