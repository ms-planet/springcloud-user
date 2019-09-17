package com.imooc.user.service;

import com.imooc.user.entity.UserInfo;

/**
 * @author zxlei
 * @date 2019/8/30 14:33
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
public interface UserService {

    /**
     * 通过openid查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenId(String openid);
}
