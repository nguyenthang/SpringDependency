package com.journaldev.beanservice;

/**
 * Created by thangnguyen-imac on 10/22/16.
 */
public class EmailService implements MessageService {

    public boolean sendMessage(String text, String rec) {
        System.out.println("Email sent to " + rec + " with messages are " + text);
        return false;
    }


}
