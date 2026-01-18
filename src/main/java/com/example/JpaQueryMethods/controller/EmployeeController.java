package com.example.JpaQueryMethods.controller;

import com.example.JpaQueryMethods.entity.Employee;
import com.example.JpaQueryMethods.service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeServiceImpl service;
    public EmployeeController(EmployeeServiceImpl employeeServiceImpl){
        this.service=employeeServiceImpl;
    }

    //Create
    @PostMapping("/employees")
    public Employee addEmp(@RequestBody Employee employee){
        return service.addEmp(employee);
    }

    //Update
    @PutMapping("/employees/{id}")
    public Employee updateEmp(@PathVariable("id") Integer id, @RequestBody Employee employee){
        return service.updateEmp(id,employee);
    }

    //Get
    @GetMapping("/employees/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return service.getEmp(id);
    }

    //GetAll
    @GetMapping("/employees")
    public List<Employee> getAllEmp(){
        return service.getAllEmp();
    }

    @DeleteMapping("/employees/{id}")
    public Employee deleteEmp(@PathVariable("id") Integer id){

//        System.out.println("Deleted");
        return service.deleteEmp(id);
    }
}
