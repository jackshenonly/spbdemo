package com.jackshenonly.websocket;

/**
 * Created by IntelliJ IDEA.
 * Author: jackshenonly
 * Date: 17/8/19
 * Time: 21:09
 */
public class ResponseMessage {
    private String responseMessage;

    public ResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
