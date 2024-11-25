package com.example.spring_kafka_avro.controller;

import com.example.spring_kafka_avro.dto.Doctor;
import com.example.spring_kafka_avro.event.DoctorEvent;
import com.example.spring_kafka_avro.service.ActionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @Autowired
    ActionService actionService;

    // Endpoint to accept Doctor details and produce to Kafka
    @PostMapping("/doctors")
    public String producerAvroMessage(@RequestBody Doctor doctor) {

        // Call the producer to send the Doctor details to Kafka (this part needs your
        // Kafka producer logic)

        DoctorEvent doctorEvent = new DoctorEvent(doctor,"DOCTOR_CREATED");

        actionService.process(doctorEvent);

        return "Sent doctor details to consumer: " + doctor;
    }
}
