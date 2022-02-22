package com.example.wsclient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.java_websocket.client.WebSocketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author wangqiang
 * @Date: 2022/2/6 12:07
 */
@RestController
@RequestMapping("client")
public class WebSocketController {
    @Autowired
    private WebSocketClient webSocketClient;

    /**
     * @author ：wangqiang
     * @param msg : 发送的消息
     * @date ：2022-02-06 12:08
     */
    @GetMapping("send")
    public String subscribe(@RequestBody JSONObject msg) {
        webSocketClient.send(msg.toString());
        //System.out.println("send"+webSocketClient.getReadyState());
        return "发送消息成功！！！";
    }

    @GetMapping("resend")
    public String resubscribe(@RequestBody nettyChatMsgVO msg) throws InterruptedException, URISyntaxException {
        System.out.println("resend"+webSocketClient.getReadyState());
        if(!webSocketClient.getReadyState().equals("OPEN")){
            webSocketClient = new MyWebSocketClient(new URI("ws://192.168.2.126:1920"));
            webSocketClient.connectBlocking();
        }
        webSocketClient.send(JSON.toJSON(msg).toString());
        return "重新发送消息成功！！！";
    }
}
