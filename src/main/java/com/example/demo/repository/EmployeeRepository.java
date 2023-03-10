package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeIdentity;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,EmployeeIdentity> {

}
