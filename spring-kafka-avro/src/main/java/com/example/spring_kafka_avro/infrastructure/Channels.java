package com.example.spring_kafka_avro.infrastructure;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Channels {
    String EVENTS = "incomingEvents";
    String ACTIONED = "actionedEvents";

    @Input(Channels.EVENTS)
    SubscribableChannel events();

    @Output(Channels.ACTIONED)
    MessageChannel actioned();
}
