package com.YTnest.springboot.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "penalty")

public class Penalty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long penalty_id;

    @Column(name = "penalty_name")
    private String penaltyName;
    
    @Column(name = "penalty_description")
    private String penaltyDescription;

    @Column(name = "penalty_cost")
    private int penaltyCost;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "penalty")
    private List<RecordPenalty> recordPenalties = new ArrayList<>();

}
