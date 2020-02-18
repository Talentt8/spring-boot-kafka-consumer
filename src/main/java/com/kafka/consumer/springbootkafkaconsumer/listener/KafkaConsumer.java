package com.kafka.consumer.springbootkafkaconsumer.listener;

import com.kafka.consumer.springbootkafkaconsumer.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.errors.SerializationException;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author mzwandile on 2020/02/18
 * @project kafka
 */

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message) {
        log.info("Consumed message: " + message);
    }

    @KafkaListener(topics = "Kafka_Example_Json", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
    public void consumeJson(User user) {
        try {
            log.info("Consumed JSON message: " + user);
        } catch (SerializationException e) {
            log.info("Invalid message received");
        }

    }
}
