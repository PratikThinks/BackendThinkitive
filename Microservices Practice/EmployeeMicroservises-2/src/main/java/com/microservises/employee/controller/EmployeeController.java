package com.microservises.employee.controller;

import com.microservises.employee.dto.EmployeeDto;
import com.microservises.employee.entity.Employee;
import com.microservises.employee.res.EmployeeServiceResponse;
import com.microservises.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    public final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


        @PostMapping
        public Employee createOne(@RequestBody EmployeeDto edto){
        Employee myemp = new Employee();
        myemp.setBloodGroup(edto.getBloodGroup());
        myemp.setEmail(edto.getEmail());
        myemp.setId(edto.getId());
        myemp.setName(edto.getName());
        return employeeService.create(myemp);
        }

        @GetMapping("/{id}")
        public ResponseEntity<EmployeeServiceResponse> getOne(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployee(id));

        }


}
