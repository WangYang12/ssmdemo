package com.wangyang.service;

import com.wangyang.entity.UserInfo;
import com.wangyang.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper mapper;

    public List<UserInfo> getAllUser() {
        return mapper.getAllUser();
    }
}
