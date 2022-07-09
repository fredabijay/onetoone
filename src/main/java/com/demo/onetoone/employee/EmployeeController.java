package com.demo.onetoone.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(value="/employee")
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        Employee e = employeeService.create(employee);
        if (e == null) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        } else {
            return new ResponseEntity<Employee>(e, HttpStatus.OK);
        }
    }
}
