package com.example.JpaQueryMethods.controller;

import com.example.JpaQueryMethods.entity.Employee;
import com.example.JpaQueryMethods.service.EmployeeService;
import com.example.JpaQueryMethods.service.EmployeeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService service;
    public EmployeeController(EmployeeServiceImpl employeeServiceImpl){
        this.service=employeeServiceImpl;
    }

    //Create
    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmp(@RequestBody Employee employee){
        Employee savedEmployee = service.addEmp(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }

    //Update
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmp(@PathVariable("id") Integer id, @RequestBody Employee employee){
        Employee updatedEmployee =service.updateEmp(id,employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    //Get
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmp(@PathVariable("id") Integer id){
        Employee employee = service.getEmp(id);
        return ResponseEntity.ok(employee);
    }

    //GetAll
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmp(){
        return ResponseEntity.ok(service.getAllEmp());
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Void> deleteEmp(@PathVariable("id") Integer id){

//        System.out.println("Deleted");
//        this is expected
        /**
         * employeeService.deleteEmp(id);
         *         return ResponseEntity.noContent().build();
         */
        service.deleteEmp(id);
        return ResponseEntity.noContent().build();
    }
}
