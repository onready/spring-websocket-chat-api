package com.onready.springwebsocketchatapi.controller;

import com.onready.springwebsocketchatapi.domain.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

  @MessageMapping("/chat")
  @SendTo("/topic/chat")
  Message sendMessage(Message message) {
    return message;
  }

}
