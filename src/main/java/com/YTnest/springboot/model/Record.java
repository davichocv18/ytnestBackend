package com.YTnest.springboot.model;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "record")

public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long record_id;

    @Column(name = "record_description")
    private String recordDescription;
    
    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "record", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecordPenalty> recordPenaltys = new ArrayList<>();

    @OneToOne(mappedBy = "record")
    private Student student;
}
