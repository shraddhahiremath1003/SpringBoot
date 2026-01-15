package com.example.RestApiDemo.repository;

import com.example.RestApiDemo.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpRepo extends JpaRepository<Emp,Integer> {


    Optional<Emp> findByName(String name);
}
