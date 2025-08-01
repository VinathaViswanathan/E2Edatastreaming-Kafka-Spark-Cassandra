package com.system.springbootkafkasparkcassandra01.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.springbootkafkasparkcassandra01.cassandra.MessageEntity;
import com.system.springbootkafkasparkcassandra01.cassandra.MessageRepository;


@Service
public class CassandraService {

    @Autowired
    private MessageRepository messageRepository;

    public void saveMessage(String message) {
        MessageEntity entity = new MessageEntity();
        entity.setId(UUID.randomUUID());
        entity.setMessage(message);
        messageRepository.save(entity);
    }
}
