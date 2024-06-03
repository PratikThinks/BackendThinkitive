package com.training.adressMicroservice.services;

import com.training.adressMicroservice.dto.AddressDto;
import com.training.adressMicroservice.entity.Address;
import org.springframework.stereotype.Service;

@Service
public interface AdressService {

    public Address create(Address adress);
    public Address getOneAddress(int id);
    public Address getAdressByemp(int id);
}
