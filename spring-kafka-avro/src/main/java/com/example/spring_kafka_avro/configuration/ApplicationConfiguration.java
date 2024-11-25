package com.example.spring_kafka_avro.configuration;

import org.springframework.cloud.stream.schema.avro.AvroSchemaMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;

import com.example.spring_kafka_avro.event.DoctorEvent;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public MessageConverter classificationMessageConverter() {
        AvroSchemaMessageConverter converter = new AvroSchemaMessageConverter();
        //converter.setSchema(DoctorEvent.SCHEMA$);
        return converter;
    }
}