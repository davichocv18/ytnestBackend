package com.YTnest.springboot.model;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "schemeTable")
    private List<TablesLog> tablesLogs = new ArrayList<>();

}
