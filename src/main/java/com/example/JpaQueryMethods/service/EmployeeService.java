package com.example.JpaQueryMethods.service;

import com.example.JpaQueryMethods.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public Employee addEmp(Employee employee);
    public Employee updateEmp(Integer id,Employee employee);
    public Employee getEmp(Integer id);
    public List<Employee> getAllEmp();
    public Employee deleteEmp(Integer id);
}
