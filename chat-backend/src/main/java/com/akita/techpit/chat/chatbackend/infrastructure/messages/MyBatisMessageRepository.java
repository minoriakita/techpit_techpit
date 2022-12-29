package com.akita.techpit.chat.chatbackend.infrastructure.messages;

import org.springframework.stereotype.Repository;

import com.akita.techpit.chat.chatbackend.domain.messages.model.Message;
import com.akita.techpit.chat.chatbackend.domain.messages.service.MessageRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MyBatisMessageRepository implements MessageRepository{

  private final MessageMapper messageMapper;

  @Override
  public void insert(Message message) {
    messageMapper.insert(message);
  }
  
}