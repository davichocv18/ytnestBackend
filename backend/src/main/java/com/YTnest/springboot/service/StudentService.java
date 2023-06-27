package com.YTnest.springboot.service;

import java.util.List;

import com.YTnest.springboot.model.Student;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(long id);
    Student updateStudent(Student student, long id);
    void deleteStudent(long id);
}
