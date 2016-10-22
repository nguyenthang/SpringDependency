package com.journaldev.beanservice;

/**
 * Created by thangnguyen-imac on 10/22/16.
 */
public class FaceBookXMLApp {

    private MessageService messageService;


    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public boolean processMessage(String con, String rec){
        return this.messageService.sendMessage(con, rec);
    }

}
