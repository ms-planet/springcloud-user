package com.imooc.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zxlei
 * @date 2019/8/30 14:46
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Getter
@AllArgsConstructor
public enum RoleEnum {

    BUYER(1,"买家"),

    SELLER(2,"卖家")


    ;


    private Integer code;

    private String message;


}
