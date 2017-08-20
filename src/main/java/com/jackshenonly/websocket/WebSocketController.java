package com.jackshenonly.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.ServerEndpoint;

/**
 * Created by IntelliJ IDEA.
 * Author: jackshenonly
 * Date: 17/8/19
 * Time: 21:30
 */
@Controller
public class WebSocketController{

    //view controller with SockJS
    @RequestMapping(value = "/ws")
    public String websocket(){
        return "ws";
    }

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ResponseMessage say(RequestMessage requestMessage){
        System.out.println("name:" + requestMessage.getName());
        return new ResponseMessage("welcome," + requestMessage.getName() +"!");
    }

    //view controller with H5
    @RequestMapping(value = "/wsH5")
    public String websocketByH5(){
        return "wsH5";
    }


}
