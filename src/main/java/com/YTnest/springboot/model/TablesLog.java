package com.YTnest.springboot.model;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "tablesLog")

public class TablesLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long log_id;

    @Column(name = "log_date")
    private long logDate;
    
    @Column(name = "log_user")
    private String logUser;

    @Column(name = "log_terminal")
    private String logTerminal;

    @Column(name = "log_observations")
    private String logObservations;

    @Column(name = "log_procedure_name")
    private String logProcedureName;

    @Column(name = "table_id")
    private int tableId;

}
