package com.YTnest.springboot.model;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "schemeTable")

public class SchemeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long table_id;

    @Column(name = "table_name")
    private String tableName;
    
    @Column(name = "table_description")
    private String tableDescription;

    @Column(name = "status")
    private String status;


}
