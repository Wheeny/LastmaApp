package com.lastma.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Vehicle {

    @Id
    private String id;
    private String registrationNumber;
    private String make;
    private String model;
    private String colour;
    private String driverId;

}
