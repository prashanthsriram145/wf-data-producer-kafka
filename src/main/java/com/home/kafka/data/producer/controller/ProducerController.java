package com.home.kafka.data.producer.controller;

import com.home.kafka.data.producer.model.BakeryRecipe;
import com.home.kafka.data.producer.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/messageSender")
public class ProducerController {

    @Autowired
    private MessageSender messageSender;

    @PostMapping("/bakeryRecipe")
    public ResponseEntity<String> sendBackeryRecipe(@RequestBody BakeryRecipe bakeryRecipe) {
        messageSender.sendMessage(bakeryRecipe);
        return ResponseEntity.ok("SUCCESS");
    }
}
