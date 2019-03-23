package com.wangyang.mapper;

import com.wangyang.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper {

    List<UserInfo> getAllUser();
}
