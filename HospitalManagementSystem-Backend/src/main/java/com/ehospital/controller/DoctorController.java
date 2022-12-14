package com.ehospital.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ehospital.entity.Doctor;
import com.ehospital.dao.DoctorRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    // get all doctors
    @GetMapping("/doctor")
    public List<Doctor> getAlldoctors(){
        return doctorRepository.findAll();
    }

    // create doctor rest api
    @PostMapping("/doctor")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // get doctor by id rest api
    @GetMapping("/doctor/{id}")
    public Optional<Doctor> findDoctor(@PathVariable int id){
    	return doctorRepository.findById(id);
    }

    // update doctor rest api

    @PutMapping("/doctor/{id}")
    public void editDoctor
    (@PathVariable("id") Integer id, @RequestBody Doctor doctor)
    {
        doctorRepository.save(doctor);
    }

    // delete doctor rest api
    @DeleteMapping("/doctor/{id}")
    public List<Doctor> deleteDoctor(@PathVariable int id){ 
       doctorRepository.deleteById(id);
       return doctorRepository.findAll();
   }


}
