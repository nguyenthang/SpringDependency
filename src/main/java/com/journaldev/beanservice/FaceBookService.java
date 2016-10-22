package com.journaldev.beanservice;

/**
 * Created by thangnguyen-imac on 10/22/16.
 */
public class FaceBookService implements MessageService {

    public boolean sendMessage(String text, String rec) {
        System.out.println("Sent message to " + rec + " with contents " + text);
        return false;
    }
}
