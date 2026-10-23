package com.lastma.dtos.responses;

import lombok.Data;

@Data
public class FindDriverResponse {

    private String id;
    private String fullName;
    private String phoneNumber;
    private String email;

}
