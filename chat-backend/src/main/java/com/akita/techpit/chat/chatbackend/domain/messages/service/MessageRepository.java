package com.akita.techpit.chat.chatbackend.domain.messages.service;

import com.akita.techpit.chat.chatbackend.domain.messages.model.Message;

public interface MessageRepository {
  void insert(Message message);
}