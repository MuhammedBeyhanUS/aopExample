package com.demo.aopExample.controllers;

import com.demo.aopExample.entities.Message;
import com.demo.aopExample.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messageCount")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<Integer> getCharCount(@RequestBody Message message){
        return ResponseEntity.ok(messageService.getCharCount(message.getMessage()));
    }
}
