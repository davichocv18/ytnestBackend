/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.YTnest.springboot.model;

import jakarta.persistence.*;

import lombok.Data;
/**
 *
 * @author crisa
 */
@Data
@Entity
@Table(name="student")

public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long student_id;

    @Column(name = "student_ci")
    private String studentCedula;

    @Column(name = "student_first_name")
    private String studentFirstName;
    
    @Column(name = "student_middle_name")
    private String studentMiddleName;
    
    @Column(name = "student_last_name")
    private String studentLastName;

    @Column(name = "student_sencond_surname")
    private String studentSecondSurname;

    @Column(name = "student_province")
    private String studentProvince;

    @Column(name = "student_semester")
    private int studentSemester;

    @Column(name = "student_mail")
    private String studentMail;

    @Column(name = "student_phone")
    private String studentPhone;

    @Column(name = "status")
    private String status;

    @Column(name = "student_gsec")
    private int studentGSEC;

    @Column(name = "student_representative")
    private boolean studentRepresentative;

}
