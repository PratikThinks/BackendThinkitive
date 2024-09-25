package com.training.adressMicroservice.controller;

import com.training.adressMicroservice.dto.AddressDto;
import com.training.adressMicroservice.entity.Address;
import com.training.adressMicroservice.impl.AdressServiceImpl;
import com.training.adressMicroservice.services.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AdressService adressService;

    @PostMapping
    ResponseEntity<Address> create(@RequestBody AddressDto addressDto){
        Address address = new Address();
        address.setId(addressDto.getId());
        address.setPincode(addressDto.getPincode());
        address.setState(addressDto.getState());
        address.setLane_1(addressDto.getLane_1());
        return ResponseEntity.status(HttpStatus.CREATED).body(adressService.create(address));

    }

    @GetMapping("/{id}")
    ResponseEntity<Address> getOne(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(adressService.getOneAddress(id));
    }

    @GetMapping("/getEmp/{employeeId}")
    public Address getMoreAdressInfo(@PathVariable("employeeId") int employeeId){
        return adressService.getAdressByemp(employeeId);
//        return employeeId;
    }


}
