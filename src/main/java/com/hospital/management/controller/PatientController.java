package com.hospital.management.controller;

import com.hospital.management.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cascade")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService=patientService;
    }
    @GetMapping("/")
    public String cascadeTypes(){
        return "Cascade Types";
    }

    //All
    @GetMapping("/cascadePersist")
    public void cascadeAll(){
        patientService.saveCascadeType();
    }

    @GetMapping("/deleteCascade/{id}")
    public void deleteCascadeType(@PathVariable("id") Long id){
        patientService.deleteCascadeType(id);
    }
}