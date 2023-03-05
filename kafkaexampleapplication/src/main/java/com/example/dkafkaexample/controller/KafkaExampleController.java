package com.example.dkafkaexample.controller;

import com.example.dkafkaexample.model.*;
import com.example.dkafkaexample.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.kafka.core.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaExampleController {
    @Autowired
    KafkaProducerService kafkaProducer;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "quickstart-events";


    @RequestMapping(value = "/producer",method = RequestMethod.POST)
    public String sendMessage(@RequestBody User user) {
        //kafkaProducer.send("messagesending");
        kafkaTemplate.send(kafkaTopic, "message is sending");
        return "message sent successfully";
    }



    public void send(String s) {
        //LOG.info("Sending User Json Serializer : {}"+ user);
        kafkaTemplate.send(kafkaTopic, s);
    }
}
