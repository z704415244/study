package com.zh.study.config;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * web socket processor
 * @Author yexun
 * @Date 2018/11/9
 */
@Component
public class MyHandler extends TextWebSocketHandler {

    private static final Logger logger = LoggerFactory.getLogger(MyHandler.class);

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.info("建立连接...");
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        logger.info("收到消息...{}", message.getPayload());
    }

    @Override
    protected void handlePongMessage(WebSocketSession session, PongMessage message) throws Exception {
        logger.info("");
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        logger.info("传输消息出错");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        logger.info("断开连接...");
    }

    @Override
    public boolean supportsPartialMessages() {
        logger.info("是否处理分片消息");
        return super.supportsPartialMessages();
    }
}
