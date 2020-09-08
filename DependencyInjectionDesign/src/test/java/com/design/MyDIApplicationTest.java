package com.design;

import com.design.injector.EmailServiceInjector;
import com.design.injector.MessageServiceInjector;
import com.design.injector.SMSServiceInjector;
import junit.framework.TestCase;

public class MyDIApplicationTest extends TestCase {

    MessageServiceInjector messageServiceInjector;

    public void testDependencyInjection() {
        messageServiceInjector = new EmailServiceInjector();
        messageServiceInjector.getConsumer().processMessages("Hi Sir","test@abc.com");

        messageServiceInjector = new SMSServiceInjector();
        messageServiceInjector.getConsumer().processMessages("Hi Sir","1234567890");
    }


}