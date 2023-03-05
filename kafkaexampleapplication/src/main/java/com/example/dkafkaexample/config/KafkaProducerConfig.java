package com.example.dkafkaexample.config;

import com.example.dkafkaexample.model.*;
import com.fasterxml.jackson.databind.*;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.kafka.core.*;

import java.util.*;
import java.util.logging.Logger;

@Configuration
public class KafkaProducerConfig {
    private final Logger logger = Logger.getLogger(String.valueOf(KafkaProducerConfig.class));

    @Value("${techgeeknext.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Bean(name = "kaftemp")
    public KafkaTemplate<String, String> userKafkaTemplate() {
        return new KafkaTemplate<>(userProducerFactory());
    }


    @Bean
    public ProducerFactory<String, String> userProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getClass());
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName());
        return new DefaultKafkaProducerFactory<>(configProps);
    }
}
