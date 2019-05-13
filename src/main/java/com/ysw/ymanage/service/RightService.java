package com.ysw.ymanage.service;


import org.springframework.stereotype.Service;

import java.util.Set;

public interface RightService {
    public Set<String> getRightByUserId(String userId);

}
