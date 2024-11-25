package com.example.spring_kafka_avro.infrastructure;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.example.spring_kafka_avro.event.DoctorEvent;
import com.example.spring_kafka_avro.service.ActionService;


@Slf4j
@Component
@EnableBinding(Channels.class)
public class EventHandler {

    private ActionService actionService;

    public EventHandler(final ActionService actionService) {
        this.actionService = actionService;
    }

    @StreamListener(Channels.EVENTS)
    public void receive(final DoctorEvent event) {
        log.debug("Received event [{}]", event);

        actionService.process(event);
    }
}
