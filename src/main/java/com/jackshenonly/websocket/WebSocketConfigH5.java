package com.jackshenonly.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.WebSocketConfigurationSupport;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Created by IntelliJ IDEA.
 * Author: jackshenonly
 * Date: 17/8/20
 * Time: 22:40
 */
@Configuration
public class WebSocketConfigH5 extends WebSocketConfigurationSupport{

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
