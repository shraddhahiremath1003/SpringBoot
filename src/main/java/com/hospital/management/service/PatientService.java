package com.hospital.management.service;

import com.hospital.management.dao.PatientRepo;
import com.hospital.management.entity.Insurance;
import com.hospital.management.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class PatientService {

    private PatientRepo patientRepo;

    @Autowired
    public PatientService(PatientRepo patientRepo){
        this.patientRepo=patientRepo;
    }

    public void saveCascadeType(){
        Insurance i=new Insurance();
        i.setPolicyNumber("POL-900");
        i.setProvider("LIC");
        i.setCreatedAt(LocalDateTime.now());
        i.setValidUntil(LocalDate.now());

        Patient p=new Patient();
        p.setName("shradha");
        p.setEmail("shraddha@g.com");

        //Wthout cascade
        //insuranceRepo.save(i);
        p.setInsurance(i);

        patientRepo.save(p);
    }
    public void deleteCascadeType(Long id){
        patientRepo.deleteById(id);
    }
}
