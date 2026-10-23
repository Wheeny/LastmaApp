package com.lastma.dtos.requests;

import com.lastma.data.models.ViolationType;
import lombok.Data;

@Data
public class IssueTicketRequest {

    private String vehicleId;
    private ViolationType violationType;

}
