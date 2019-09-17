package com.imooc.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zxlei
 * @date 2019/8/21 17:36
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {

    LOGIN_FAULT(1, "登陆失败"),
    ROLE_ERROR(2, "角色权限有误");

    private int code;

    private String message;


}
