package com.sergey.music.Interfaces.MessageInterface;

import com.sergey.music.entity.Message;
import com.sergey.music.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageInterfaceImpl implements MessageInterface{

    @Autowired
    MessageRepository messageRepository;

    @Override
    public List<Message> findAll() {
        return (List<Message>) messageRepository.findAll();
    }

    @Override
    public void saveMessage(Message message) {
        messageRepository.save(message);
    }
}
