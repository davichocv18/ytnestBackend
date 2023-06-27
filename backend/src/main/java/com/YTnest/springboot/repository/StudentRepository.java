package com.YTnest.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.YTnest.springboot.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
