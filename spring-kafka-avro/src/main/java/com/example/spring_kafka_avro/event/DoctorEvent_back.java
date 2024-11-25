package com.example.spring_kafka_avro.event;

import lombok.Data;

import com.example.spring_kafka_avro.dto.Doctor;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DoctorEvent_back {
    private Doctor doctor; // Doctor object associated with the event
    private String eventType; // Type of event (e.g., "Doctor Created", "Doctor Updated")
     // Timestamp for when the event occurred
}
