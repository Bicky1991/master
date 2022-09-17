package com.biodata.repository;

import com.biodata.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {

    public Student findByStudentId(int id);
}
