package com.example.spring_kafka_avro.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor_back {
    private Long id;
    private String name;
    private String specialty;
    private int yearsOfExperience;
}
