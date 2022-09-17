package com.biodata.service;

import com.biodata.entity.Student;
import com.biodata.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public Iterable<Student> getAllDetails()
    {
        return  studentRepository.findAll();
    }

    public Student getDetailsById(int id)
    {
        Student student = studentRepository.findByStudentId(id);
        return student;
    }

    public Student addStudentDetail(Student student)
    {
        Student save = studentRepository.save(student);
        return save;
    }

    public Student updateStudent(int id,Student student)
    {
        student.setStudentId(id);
        Student save = studentRepository.save(student);
        return save;
    }
}
