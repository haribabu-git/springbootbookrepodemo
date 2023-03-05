package com.example.dkafkaexample.service;


import com.example.dkafkaexample.model.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.kafka.core.*;
import org.springframework.stereotype.*;

import java.util.logging.*;

@Service
public class KafkaProducerService {

    private final Logger LOG = Logger.getLogger(String.valueOf(KafkaProducerService.class));
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "quickstart-events";

    public void send(String s) {
        //LOG.info("Sending User Json Serializer : {}"+ user);
        kafkaTemplate.send(kafkaTopic, s);
    }
}
