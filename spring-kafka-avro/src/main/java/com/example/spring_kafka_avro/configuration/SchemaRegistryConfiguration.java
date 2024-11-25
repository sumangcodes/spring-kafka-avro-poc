package com.example.spring_kafka_avro.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.schema.client.ConfluentSchemaRegistryClient;
import org.springframework.cloud.stream.schema.client.SchemaRegistryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("!stub")
@Configuration
public class SchemaRegistryConfiguration {
    @Bean
    public SchemaRegistryClient schemaRegistryClient(
            @Value("${spring.cloud.stream.schemaRegistryClient.endpoint}") final String endpoint) {
        ConfluentSchemaRegistryClient client = new ConfluentSchemaRegistryClient();
        client.setEndpoint(endpoint);
        return client;
    }
}