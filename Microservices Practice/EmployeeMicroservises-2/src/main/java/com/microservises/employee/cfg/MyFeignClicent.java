package com.microservises.employee.cfg;

import com.microservises.employee.entity.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "myfeign",url = "http://localhost:8082", path = "/address/getEmp/")

public interface MyFeignClicent {

    @GetMapping("/{id}")
    Address findAdressByEmployeeId(@PathVariable("id") int id);
}
