package com.journaldev.beanservice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by thangnguyen-imac on 10/22/16.
 */
public class ClientAnnotationApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);

        EmailAnnotationApp messageService = context.getBean(EmailAnnotationApp.class);

        messageService.processMessage("Test", "thang");
    }
}
