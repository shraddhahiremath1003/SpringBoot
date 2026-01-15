package com.example.RestApiDemo.service;

import com.example.RestApiDemo.entity.Emp;

import java.util.List;

public interface EmpService {

    public Emp saveEmp(Emp emp);
    public List<Emp> getAllEmp();
    public Emp getEmpById(int id);
    public void deleteEmp(int id);
    public Emp updateEmp(int id,Emp emp);
}
