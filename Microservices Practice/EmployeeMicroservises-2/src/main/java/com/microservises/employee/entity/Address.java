package com.microservises.employee.entity;


public class Address {

    int id;
    String lane_1;
    String state;
    int pincode;
    int employee_id;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getId() {
        return id;
    }

    public String getLane_1() {
        return lane_1;
    }

    public String getState() {
        return state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLane_1(String lane_1) {
        this.lane_1 = lane_1;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
