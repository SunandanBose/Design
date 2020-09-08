package com.design.service.serviceImpl;

import com.design.service.MessageService;

public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to "+receiver+ " with Message="+message);
    }
}
