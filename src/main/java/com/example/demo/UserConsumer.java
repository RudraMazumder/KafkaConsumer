package com.example.demo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import io.confluent.developer.User;

@Service
public class UserConsumer {
	
	private static final Logger log = LoggerFactory.getLogger(UserConsumer.class);


	@KafkaListener(topics = "${topic.name}")
	public void consume(ConsumerRecord<String, User> record) {
		log.info("Consumed message {}", record.value());
	}

}
