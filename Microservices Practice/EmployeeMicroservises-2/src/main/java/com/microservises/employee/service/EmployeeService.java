package com.microservises.employee.service;

import com.microservises.employee.cfg.MyFeignClicent;
import com.microservises.employee.dto.EmployeeDto;
import com.microservises.employee.entity.Address;
import com.microservises.employee.entity.Employee;
import com.microservises.employee.repo.EmployeeRepo;
import com.microservises.employee.res.EmployeeServiceResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
    EmployeeRepo employeeRepo;
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    MyFeignClicent myFeignClicent;

    RestTemplate restTemplate;
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo, RestTemplateBuilder builder) {
        this.employeeRepo = employeeRepo;
        this.restTemplate = builder.build();
    }

    public Employee create(Employee e){
        return employeeRepo.save(e);
    }

    public EmployeeServiceResponse getEmployee(int id){
        Employee emp = employeeRepo.findById(id).orElse(null);
        Address address =myFeignClicent.findAdressByEmployeeId(id);
        EmployeeServiceResponse edto = modelMapper.map(emp, EmployeeServiceResponse.class);
//        edto.setBloodGroup(emp.getBloodGroup());
//        edto.setEmail(emp.getEmail());
//        edto.setName(emp.getName());
//        edto.setId(emp.getId());
        edto.setAddress(address);
        return edto;
    }
}
