package com.imooc.user.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author zxlei
 * @date 2019/8/30 14:29
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Data
@Entity
public class UserInfo {

    @Id
    private String id;

    private String username;

    private String password;

    private String openid;

    private Integer role;



}
