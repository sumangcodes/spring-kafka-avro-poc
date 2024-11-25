package com.example.spring_kafka_avro.schema.generator;

import com.example.spring_kafka_avro.event.DoctorEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroFactory;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;
import org.apache.avro.Schema;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AvroPojoSchemaGenerator {

    // Method to generate the Avro schema from a given class
    public static <T> void generateSchema(Class<T> clazz, Writer writer) {
        ObjectMapper mapper = new ObjectMapper(new AvroFactory());
        AvroSchemaGenerator generator = new AvroSchemaGenerator();
        generator.enableLogicalTypes();
        try {
            mapper.acceptJsonFormatVisitor(clazz, generator);
            AvroSchema generatedSchema = generator.getGeneratedSchema();
            Schema avroSchema = generatedSchema.getAvroSchema();
            writer.write(avroSchema.toString(true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // Get the filename from the class name, converted to lowercase
        String fname = DoctorEvent.class.getSimpleName().toLowerCase() + ".avsc";
        // Set the output directory
        Path outputDir = Paths.get("src/main/resources/avro");
        // Create the directory if it doesn't exist
        try {
            if (!Files.exists(outputDir)) {
                Files.createDirectories(outputDir);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to create output directory", e);
        }
        // Define the file path where the schema will be saved
        Path filePath = outputDir.resolve(fname);
        // Write the schema to the file
        try (Writer writer = Files.newBufferedWriter(filePath, StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING)) {
            generateSchema(DoctorEvent.class, writer);
            System.out.println("Schema generated successfully at: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException("Failed to generate schema", e);
        }
    }
}