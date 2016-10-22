package com.journaldev.beanservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by thangnguyen-imac on 10/22/16.
 */
@Configuration
@ComponentScan({"com.journaldev"})
public class DIConfiguration {

    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}
