package com.design;

import junit.framework.TestCase;

public class MyApplicationTest extends TestCase {

    private MyApplication myapp = new MyApplication();

    public void testProcessMessages() {
        myapp.processMessages("Hi Sunandan", "test@abc.com");
    }
}