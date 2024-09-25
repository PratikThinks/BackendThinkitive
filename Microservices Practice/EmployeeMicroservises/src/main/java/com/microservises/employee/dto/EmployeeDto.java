package com.microservises.employee.dto;

import java.util.UUID;

public class EmployeeDto {
    int id;
    String name;
    UUID empuid;
    String email;
    String bloodGroup;


    public void setId(int id) {
        this.id = id;
    }

    public void setEmpuid(UUID empuid) {
        this.empuid = empuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UUID getEmpuid() {
        return empuid;
    }

    public String getEmail() {
        return email;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }
}
