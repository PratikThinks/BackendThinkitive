package com.training.adressMicroservice.impl;

import com.training.adressMicroservice.dto.AddressDto;
import com.training.adressMicroservice.entity.Address;
import com.training.adressMicroservice.repo.AddressRepo;
import com.training.adressMicroservice.services.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressServiceImpl implements AdressService {

    private final AddressRepo addressRepo;

    @Autowired
    public AdressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public Address create(Address adress) {
        return addressRepo.save(adress);
    }

    @Override
    public Address getOneAddress(int id) {
        return addressRepo.findById(id).get();
    }

    public Address getAdressByemp(int employeeId){
        return addressRepo.findAdressByEmployeeId(employeeId);
    }
}
