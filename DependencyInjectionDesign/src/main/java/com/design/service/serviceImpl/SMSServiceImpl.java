package com.design.service.serviceImpl;

import com.design.service.MessageService;

public class SMSServiceImpl implements MessageService {

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("SMS sent to "+receiver+ " with Message="+message);
    }
}
