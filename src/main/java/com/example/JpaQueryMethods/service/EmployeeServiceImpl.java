package com.example.JpaQueryMethods.service;

import com.example.JpaQueryMethods.dao.EmployeeRepository;
import com.example.JpaQueryMethods.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }
    @Override
    public Employee addEmp(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Transactional
    @Override
    public Employee updateEmp(Integer id,Employee employee) {
        Employee Curremp=employeeRepository.findById(id).orElseThrow(()->
            new RuntimeException("Id not found "+ id)
        );
        if(Objects.nonNull(employee.getName()))Curremp.setName(employee.getName());
        if(Objects.nonNull(employee.getAge()))Curremp.setAge(employee.getAge());
        if(Objects.nonNull(employee.getCity()))Curremp.setCity(employee.getCity());
        if(Objects.nonNull(employee.getDob()))Curremp.setDob(employee.getDob());
        if(Objects.nonNull(employee.getSalary()))Curremp.setSalary(employee.getSalary());
//        return employeeRepository.save(Curremp);//Dirty checking
        return Curremp;
    }


    @Override
    public Employee getEmp(Integer id) {
        return employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Id not found "+ id));
    }

    @Override
    public List<Employee> getAllEmp() {

        return employeeRepository.findAll();
    }

    @Transactional
    @Override
    public void deleteEmp(Integer id) {
        employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee Not Found "+id));

        employeeRepository.deleteById(id);

    }
}
