package com.lastma.dtos.responses;

import lombok.Data;

@Data
public class VehicleResponse {

    private String id;
    private String registrationNumber;
    private String make;
    private String model;
    private String colour;
    private String driverId;

}
