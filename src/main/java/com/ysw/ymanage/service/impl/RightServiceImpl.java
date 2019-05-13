package com.ysw.ymanage.service.impl;

import com.ysw.ymanage.service.RightService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class RightServiceImpl implements RightService {
    @Override
    public Set<String> getRightByUserId(String userId) {
        Set<String> rightSet=new HashSet<String>();
        rightSet.add("add");
        rightSet.add("query");
        return rightSet;
    }
}
