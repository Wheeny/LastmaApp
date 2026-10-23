package com.lastma.dtos.responses;

import lombok.Data;

@Data
public class RegisterDriverResponse {

    private String id;
    private String fullName;
    private String phoneNumber;
    private String email;

}
