package com.example.wsclient;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangqiang
 * @Date: 2022/2/6 13:57
 */
@Data
public class nettyChatMsgVO implements Serializable {

    /** 消息签收状态 */
    private messageTypeEnum msgType;

    /** 消息行为状态 */
    private messageActionEnum msgAction;

    /** 消息id */
    private Integer questionId;

    /**聊天信息类型*/
    private String chatMessageType;

    /**聊天内容*/
    private String content;

    /**发送方ID*/
    private Integer fromUserId;

    /**接收方ID*/
    private Integer toUserId;

    /**消息时间*/
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date dateTime;
}
