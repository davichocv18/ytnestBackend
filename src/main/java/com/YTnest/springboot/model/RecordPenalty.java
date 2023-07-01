package com.YTnest.springboot.model;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "recordPenalty")

public class RecordPenalty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long record_penalty_id;

    @Column(name = "record_id")
    private int recordId;
    
    @Column(name = "penalty_id")
    private int penaltyId;

    @Column(name = "status")
    private String status;

    @Column(name = "penalty_date")
    private long penaltyDate;

}
