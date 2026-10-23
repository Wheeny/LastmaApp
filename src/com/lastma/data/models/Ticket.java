package com.lastma.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Ticket {

    @Id
    private String id;
    private String vehicleId;
    private ViolationType violationType;
    private int violationFee;
    private Date issuedDate;
    private Date dueDate;


}
