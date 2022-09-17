package com.biodata.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {

    @Id
    private int studentId;
    private int studentAge;
    private String studentName;
    private String studentCity;
}
