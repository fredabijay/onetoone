package com.demo.onetoone.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    IDepartmentRepository iDepartmentRepository;

    public Department findByIdDepartment(int id) {
        return iDepartmentRepository.findByIddepartment(id);
    }
}
