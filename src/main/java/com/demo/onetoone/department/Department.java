package com.demo.onetoone.department;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="department")
public class Department {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddepartment")
    @Id
    private int iddepartment;
    @Column(name="name")
    private String name;
}
