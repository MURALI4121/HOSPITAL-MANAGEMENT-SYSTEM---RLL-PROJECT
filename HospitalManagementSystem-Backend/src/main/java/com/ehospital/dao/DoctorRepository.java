package com.ehospital.dao;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import com.ehospital.entity.Doctor;

public interface DoctorRepository 
extends JpaRepository <Doctor, Integer> {

}