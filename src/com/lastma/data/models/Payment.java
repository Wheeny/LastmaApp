package com.lastma.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Payment {

        @Id
        private String id;
        private String ticketId;
        private String paymentReference;
        private double amount;
        private Date paymentDate;

    }
