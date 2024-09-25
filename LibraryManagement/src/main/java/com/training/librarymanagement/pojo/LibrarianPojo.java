package com.training.librarymanagement.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.training.librarymanagement.entity.Student;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

public class LibrarianPojo {
    private int empId;
    private String name;
    private Student student2;

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Student getStudent2() {
        return student2;
    }
}
