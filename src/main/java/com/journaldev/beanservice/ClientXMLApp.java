package com.journaldev.beanservice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by thangnguyen-imac on 10/22/16.
 */
public class ClientXMLApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        FaceBookXMLApp faceBookXMLApp = context.getBean(FaceBookXMLApp.class);

        faceBookXMLApp.processMessage("xml send", "test");
    }
}
