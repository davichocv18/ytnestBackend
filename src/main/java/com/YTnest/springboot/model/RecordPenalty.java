package com.YTnest.springboot.model;

import java.security.Timestamp;

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
    private Timestamp penaltyDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="record_id") 
    private Record record;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "penalty_id")
    private Penalty penalty;
}
