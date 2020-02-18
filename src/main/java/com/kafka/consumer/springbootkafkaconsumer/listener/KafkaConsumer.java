package com.kafka.consumer.springbootkafkaconsumer.listener;

import lombok.extern.slf4j.Slf4j;
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
}
