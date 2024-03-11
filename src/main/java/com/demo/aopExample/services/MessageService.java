package com.demo.aopExample.services;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public int getCharCount(String message){
        return message.length();
    }
}
