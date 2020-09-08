package com.design;

import com.design.consumer.Consumer;
import com.design.service.MessageService;

public class MyDIApplication implements Consumer {

    private MessageService messageService;

    public MyDIApplication(MessageService svc){
        this.messageService = svc;
    }

    @Override
    public void processMessages(String message, String receiver) {
        messageService.sendMessage(message,receiver);
    }

}
