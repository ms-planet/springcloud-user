package com.imooc.user.mapper;

import com.imooc.user.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zxlei
 * @date 2019/8/30 14:31
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
public interface UserInfoMapper extends JpaRepository<UserInfo, String> {

    UserInfo findByOpenid(String openid);



}
