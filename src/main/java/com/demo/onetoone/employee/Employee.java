package com.demo.onetoone.employee;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.demo.onetoone.department.Department;

import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class Employee {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name="idemployee")
    private int idemployee;
    @Column(name="name")
    private String name;
    @JoinColumn(name="fk_iddepartment")
    @OneToOne(cascade = CascadeType.ALL)
    private Department department;
}
