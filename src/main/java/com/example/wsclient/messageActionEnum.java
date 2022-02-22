package com.example.wsclient;

import lombok.Getter;

/**
 * @author wangqiang
 * @Date: 2022/1/19 18:24
 */
@Getter
public enum messageActionEnum {
    /**
     * 第一次(或重连)初始化连接
     */
    CONNECT(1, "第一次(或重连)初始化连接"),
    /**
     * 聊天消息
     */
    CHAT(2, "聊天消息"),

    /**
     * 客户端保持心跳
     */
    KEEPALIVE(3, "客户端保持心跳");

    @Getter
    private Integer type;
    @Getter
    private String value;

    private messageActionEnum(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
