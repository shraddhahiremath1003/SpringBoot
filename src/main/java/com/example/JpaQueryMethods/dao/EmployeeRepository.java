package com.example.JpaQueryMethods.dao;

import com.example.JpaQueryMethods.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findByName(String name);
    List<Employee> findByNameOrCity(String name,String city);
    List<Employee> findByAgeBetween(Integer start,Integer end);
    List<Employee> findBySalaryIsNotNull();
    List<Employee> findByNameLike(String pattern);
    List<Employee> findByOrderBySalary();
    List<Employee> findAllByOrderBySalaryDesc();
    List<Employee> findByAgeIn(Collection<Integer> ages);
    List<Employee> findByNameIgnoreCase(String name);
    Long countDistinctCities();
    List<Employee> findByCity(String city);

    @Query("select e from Employee e where e.name like %?1")
    List<Employee> findByNameEndsWith(String str);

    @Query(value = "select * from employee where salary between ?1 AND ?2",nativeQuery = true)
    List<Employee> findBySalaryBetween(Double s,Double e);
}
