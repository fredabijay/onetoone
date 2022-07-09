package com.demo.onetoone.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.onetoone.department.Department;
import com.demo.onetoone.department.DepartmentService;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;
    @Autowired
    DepartmentService departmentService;

    public Employee create(Employee employee) {
        int id = employee.getDepartment().getIddepartment();
        Department d = departmentService.findByIdDepartment(id);
        employee.setDepartment(d);
        return iEmployeeRepository.save(employee);
    }
}
