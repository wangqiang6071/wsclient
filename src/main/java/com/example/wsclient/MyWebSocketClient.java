package com.example.wsclient;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import java.net.URI;

/**
 * @author wangqiang
 * @Date: 2022/2/6 12:08
 */
@Slf4j
public class MyWebSocketClient extends WebSocketClient {


    public MyWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake arg0) {
        log.info("------ MyWebSocket onOpen ------{}",arg0);
    }


    @Override
    public void onClose(int arg0, String arg1, boolean arg2) {
        log.info("------ MyWebSocket onClose ---yy---{}--{}--{}",arg0,arg1,arg2);
    }

    @Override
    public void onError(Exception arg0) {
        log.info("------ MyWebSocket onError ------{}",arg0);
    }

    @Override
    public void onMessage(String arg0) {
        log.info("-------- 接收到服务端数据： " + arg0 + "--------");
    }
}
