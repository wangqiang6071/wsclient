package com.example.wsclient;

import lombok.Getter;

/**
 * @author wangqiang
 * @Date: 2022/1/19 18:24
 */
@Getter
public enum messageTypeEnum {

    /**
     * 消息是否签收
     */
    UNSING(0, "未签收"),
    UNSINGD(1, "已签收");

    @Getter
    private Integer type;
    @Getter
    private String value;

    private messageTypeEnum(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
