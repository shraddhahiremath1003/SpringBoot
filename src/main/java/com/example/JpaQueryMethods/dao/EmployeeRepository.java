package com.example.JpaQueryMethods.dao;

import com.example.JpaQueryMethods.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
