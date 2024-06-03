package com.training.adressMicroservice.dto;

public class AddressDto {

    int id;
    String lane_1;
    String state;
    int pincode;

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

    public void setState(String state) {
        this.state = state;
    }

    public void setLane_1(String lane_1) {
        this.lane_1 = lane_1;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
