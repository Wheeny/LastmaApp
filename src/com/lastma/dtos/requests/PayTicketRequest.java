package com.lastma.dtos.requests;

import lombok.Data;

@Data
public class PayTicketRequest {

    private String ticketId;
    private String paymentReference;
    private double amount;

}
