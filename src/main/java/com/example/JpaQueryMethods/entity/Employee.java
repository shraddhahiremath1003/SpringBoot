package com.example.JpaQueryMethods.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@NamedQuery(name = "Employee.findByName",query = "select e from Employee e where e.name = ?1")
@NamedNativeQuery(name="Employee.findByCity",query = "select * from employee where city=?1",resultClass = Employee.class)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private LocalDate dob;
    private Double salary;
    private Integer age;
    private String city;
}
