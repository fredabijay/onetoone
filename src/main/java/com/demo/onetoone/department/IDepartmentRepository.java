package com.demo.onetoone.department;

import org.springframework.data.repository.CrudRepository;

public interface IDepartmentRepository extends CrudRepository<Department, Integer>{
    public Department findByIddepartment(int id);
}
