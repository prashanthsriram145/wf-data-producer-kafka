package com.home.kafka.data.producer.service;

import com.home.kafka.data.producer.model.BakeryRecipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {
    @Autowired
    private KafkaTemplate<String, BakeryRecipe> kafkaTemplate;

    public void sendMessage(BakeryRecipe bakeryRecipe) {
        kafkaTemplate.send("backeryRecipes", bakeryRecipe);
    }
}
