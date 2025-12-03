package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received message 1: " + message);
    }

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void listen2(String message) {
        System.out.println("Received message 2: " + message);
    }

    @KafkaListener(topics = "my-topic-new", groupId = "my-group-rider")
    public void listenRiderLocation(RiderLocation location) { System.out.println("Received location: "
            + location.getRiderId() + " : " + location.getLatitude() + " : " + location.getLongitude()); }
}
