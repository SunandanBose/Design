package com.design.injector;

import com.design.MyDIApplication;
import com.design.consumer.Consumer;
import com.design.service.serviceImpl.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector{

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}
