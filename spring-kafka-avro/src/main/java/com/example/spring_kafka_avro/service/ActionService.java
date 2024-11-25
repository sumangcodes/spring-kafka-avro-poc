package com.example.spring_kafka_avro.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.example.spring_kafka_avro.event.DoctorEvent;
import com.example.spring_kafka_avro.infrastructure.Channels;



@Slf4j
@Service
public class ActionService {

    private final Channels channels;

    public ActionService(Channels channels) {
        this.channels = channels;
    }

    public void process(DoctorEvent event) {
        log.info("Received {}", event);
        actioned(event);
    }

    public void actioned(final DoctorEvent event) {
        channels.actioned().send(MessageBuilder.withPayload(event).build());
    }
}
