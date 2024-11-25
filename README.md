# spring-kafka-avro-poc
# Doctor API Integration with Avro and JSON

This repository demonstrates how to serialize and deserialize `Doctor` objects using Avro and integrate them with an API for testing via Postman.

## Table of Contents
- [Overview](#overview)
- [Avro Schema](#avro-schema)
- [Convert Avro to JSON](#convert-avro-to-json)
- [API Testing with Postman](#api-testing-with-postman)
- [Setup and Usage](#setup-and-usage)
- [Examples](#examples)
- [License](#license)

---

## Overview

The `Doctor` object contains the following fields:
- `id` (int): The unique identifier of the doctor.
- `name` (string): The doctor's name.
- `specialty` (string): The medical specialty of the doctor.
- `yearsOfExperience` (int): The number of years the doctor has been practicing.

This repository includes:
1. An Avro schema definition for the `Doctor` object.
2. Code snippets for serializing and deserializing Avro data.
3. Instructions to use Postman for testing an API with JSON and Avro data.

---

## Avro Schema

The Avro schema for the `Doctor` object is defined as follows:

```json
{
  "type": "record",
  "name": "Doctor",
  "fields": [
    { "name": "id", "type": "int" },
    { "name": "name", "type": "string" },
    { "name": "specialty", "type": "string" },
    { "name": "yearsOfExperience", "type": "int" }
  ]
}
```

Save this schema as `doctor.avsc` in the project directory.

---

## Convert Avro to JSON

### Steps to Serialize `Doctor` Object into JSON:
1. Use the Avro schema to parse the data.
2. Serialize the data into JSON format.

Sample JSON representation of the `Doctor` object:
```json
{
  "id": 123,
  "name": "Dr. Smith",
  "specialty": "Cardiology",
  "yearsOfExperience": 15
}
```

---

## API Testing with Postman

### **JSON Format**
1. In Postman:
   - Select the HTTP method (e.g., POST or PUT).
   - Set the `Content-Type` header to `application/json`.
   - Paste the JSON body:
     ```json
     {
       "id": 123,
       "name": "Dr. Smith",
       "specialty": "Cardiology",
       "yearsOfExperience": 15
     }
     ```
   - Send the request.

### **Avro Format**
If your API expects Avro data:
1. Serialize the object using Avro libraries in your preferred language.
2. Save the encoded Avro data to a binary file.
3. In Postman:
   - Select the HTTP method.
   - Set the `Content-Type` header to `application/octet-stream`.
   - Use the **binary** or **form-data** option in the Body tab to upload the Avro file.

---

## Setup and Usage

### Prerequisites
- [Apache Avro library](https://avro.apache.org/) for your preferred programming language.
- Postman for API testing.

### Steps
1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/doctor-avro-integration.git
   cd doctor-avro-integration
   ```
2. Install required dependencies (e.g., Avro library).
3. Follow the [Avro Schema](#avro-schema) and [API Testing with Postman](#api-testing-with-postman) sections to proceed.

---

