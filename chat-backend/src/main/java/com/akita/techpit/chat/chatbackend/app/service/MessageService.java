package com.akita.techpit.chat.chatbackend.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.akita.techpit.chat.chatbackend.domain.messages.model.Message;
import com.akita.techpit.chat.chatbackend.domain.messages.service.MessageDomainService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MessageService {
  
  private final MessageDomainService messageDomainService;

  public Message post(Message message){
    var username = "guest";
    message.setUsername(username);
    return messageDomainService.post(message);
  }

  public List<Message> find(int channelId, Optional<String> searchWord){
    return messageDomainService.find(channelId, searchWord);
  }
}