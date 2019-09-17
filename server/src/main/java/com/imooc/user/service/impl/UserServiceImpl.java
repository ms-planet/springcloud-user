package com.imooc.user.service.impl;

import com.imooc.user.entity.UserInfo;
import com.imooc.user.mapper.UserInfoMapper;
import com.imooc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zxlei
 * @date 2019/8/30 14:34
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    /**
     * 通过openid查询用户信息
     *
     * @param openid
     * @return
     */
    @Override
    public UserInfo findByOpenId(String openid) {
        return userInfoMapper.findByOpenid(openid);
    }
}
