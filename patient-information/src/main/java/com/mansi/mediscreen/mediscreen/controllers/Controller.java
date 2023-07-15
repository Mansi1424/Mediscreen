package com.mansi.mediscreen.mediscreen.controllers;

import com.mansi.mediscreen.mediscreen.entity.PatientEntity;
import com.mansi.mediscreen.mediscreen.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    PatientRepo patientRepo;

    @Autowired
    public Controller(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    @GetMapping("/patients")
    public String getPatientsByName(@RequestParam String name) {

        PatientEntity patient = patientRepo.findByName(name);

        return patient.toString();
    }
}
