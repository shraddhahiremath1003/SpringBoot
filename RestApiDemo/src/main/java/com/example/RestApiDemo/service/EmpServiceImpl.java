package com.example.RestApiDemo.service;

import com.example.RestApiDemo.Exception.DuplicateName;
import com.example.RestApiDemo.Exception.StudentNotFound;
import com.example.RestApiDemo.entity.Emp;
import com.example.RestApiDemo.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpRepo empRepo;

    @Override
    public Emp saveEmp(Emp emp) {

        if(empRepo.findByName(emp.getName()).isPresent()){
            throw new DuplicateName("Name with "+emp.getName()+" is already present");
        }else
        return empRepo.save(emp);
    }

    @Override
    public List<Emp> getAllEmp() {
        return empRepo.findAll();
    }

    @Override
    public Emp getEmpById(int id) {
        return empRepo.findById(id).orElseThrow(()-> new StudentNotFound("Student with id "+id+" is not available"));
    }

    @Override
    public void deleteEmp(int id) {
        empRepo.deleteById(id);
    }

    @Override
    public Emp updateEmp(int id, Emp emp) {
        return null;
    }
}
