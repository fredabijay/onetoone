package com.demo.onetoone.employee;

import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer>{
    
}
