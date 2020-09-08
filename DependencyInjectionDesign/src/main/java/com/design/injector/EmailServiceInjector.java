package com.design.injector;

import com.design.MyDIApplication;
import com.design.consumer.Consumer;
import com.design.service.serviceImpl.EmailServiceImpl;

public class EmailServiceInjector implements  MessageServiceInjector{

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }
}
