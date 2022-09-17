package com.biodata.controller;

import com.biodata.entity.Student;
import com.biodata.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {

    @Autowired
    public StudentService studentService;

    @GetMapping("getDetails")
    public ResponseEntity<?> getAllDetails()
    {
        return ResponseEntity.ok(studentService.getAllDetails());
    }

    @GetMapping("getDetails/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") int id)
    {
       Student student=studentService.getDetailsById(id);
       return ResponseEntity.ok(student);
    }

    @PostMapping("saveStudent")
    public ResponseEntity<?> saveStudent(@RequestBody Student student)
    {
        studentService.addStudentDetail(student);
        return ResponseEntity.ok(student);
    }

    @PutMapping("updateStudent/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") int id,@RequestBody Student student)
    {
        try{
            studentService.updateStudent(id, student);
            return ResponseEntity.ok(student);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
