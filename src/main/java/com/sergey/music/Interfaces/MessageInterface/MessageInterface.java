package com.sergey.music.Interfaces.MessageInterface;

import com.sergey.music.entity.Message;

import java.util.List;

public interface MessageInterface {
    List<Message> findAll();
    void saveMessage(Message message);
}
