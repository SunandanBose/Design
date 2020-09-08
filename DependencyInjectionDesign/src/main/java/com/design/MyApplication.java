package com.design;

import com.design.consumer.Consumer;
import com.design.service.EmailService;

public class MyApplication implements Consumer {

    private EmailService email;

    public void processMessages(String msg, String rec){
        this.email.sendEmail(msg, rec);
    }
}
