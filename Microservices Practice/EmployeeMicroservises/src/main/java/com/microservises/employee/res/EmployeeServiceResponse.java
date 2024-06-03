package com.microservises.employee.res;

import com.microservises.employee.entity.Address;

import java.util.UUID;

public class EmployeeServiceResponse {
    int id;
    String name;
    UUID empuid;
    String email;
    String bloodGroup;
    Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpuid(UUID empuid) {
        this.empuid = empuid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
