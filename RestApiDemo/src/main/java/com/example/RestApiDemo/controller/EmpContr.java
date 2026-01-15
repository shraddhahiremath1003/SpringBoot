package com.example.RestApiDemo.controller;

import com.example.RestApiDemo.entity.Emp;
import com.example.RestApiDemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpContr {

    @Autowired
    private EmpService empService;
    @GetMapping("/")
    public String welcome(){
        return "WelcomeSpringBoot2026";
    }

    @PostMapping("/create")
    public Emp createEmp(@RequestBody  Emp emp){
        return empService.saveEmp(emp);
    }

    @GetMapping("/employee")
    public List<Emp> getAllEmployees(){
        return this.empService.getAllEmp();
    }

    @GetMapping("/employee/{id}")
    public Emp getEmpById(@PathVariable("id") int id){
        return empService.getEmpById(id);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmp(@PathVariable("id") int id){
        empService.deleteEmp(id);
    }
}
