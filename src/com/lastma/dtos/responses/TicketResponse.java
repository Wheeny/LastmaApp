package com.lastma.dtos.responses;

import com.lastma.data.models.ViolationType;
import lombok.Data;

import java.util.Date;

@Data
public class TicketResponse {

    private String id;
    private String vehicleId;
    private ViolationType violationType;
    private int violationFee;
    private Date issuedDate;

}
