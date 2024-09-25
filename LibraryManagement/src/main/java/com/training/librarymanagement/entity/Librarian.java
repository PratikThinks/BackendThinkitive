package com.training.librarymanagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity
public class Librarian {
    @Id
    private int empId;

    private UUID uuid;
    private String name;

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private Student student2;

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }

    public int getEmpId() {
        return empId;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }



    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }


}
