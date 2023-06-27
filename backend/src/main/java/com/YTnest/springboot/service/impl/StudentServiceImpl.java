package com.YTnest.springboot.service.impl;

import com.YTnest.springboot.exception.ResourceNotFoundException;
import com.YTnest.springboot.model.Student;
import com.YTnest.springboot.repository.StudentRepository;
import com.YTnest.springboot.service.StudentService;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }
    
    @Override
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
    
    @Override
    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student", "Id", id));
    }

    @Override
    public Student updateStudent(Student student, long id) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student", "Id", id));
        existingStudent.setStudentCedula(student.getStudentCedula());
        existingStudent.setStudentFirstName(student.getStudentFirstName());
        existingStudent.setStudentMiddleName(student.getStudentMiddleName());
        existingStudent.setStudentLastName(student.getStudentLastName());
        existingStudent.setStudentSecondSurname(student.getStudentSecondSurname());
        existingStudent.setStudentProvince(student.getStudentProvince());
        existingStudent.setStudentSemester(student.getStudentSemester());
        existingStudent.setStudentMail(student.getStudentMail());
        existingStudent.setStudentPhone(student.getStudentPhone());
        existingStudent.setStatus(student.getStatus());
        existingStudent.setStudentGSEC(student.getStudentGSEC());
        existingStudent.setStudentRepresentative(student.isStudentRepresentative());
        
        studentRepository.save(existingStudent);
        return existingStudent;
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student", "Id", id));
        
        studentRepository.deleteById(id);
    }
    
    
}
