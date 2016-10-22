package com.journaldev.beanservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thangnguyen-imac on 10/22/16.
 */
@Component
public class EmailAnnotationApp {

    private MessageService messageService;

    @Autowired
    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public boolean processMessage(String contents, String rec){
        return this.messageService.sendMessage(contents, rec);
    }

}
