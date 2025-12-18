package com.example.demo.controller;
// import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import com.example.demo.entity.Validationentity;
import com.example.demo.service.Validationservice;


@RestController
public class Validationcontroller{
         @Autowired  Validationservice service;  //used to call methods and attributes from other files


         @PostMapping("/postV")
         public Validationentity Data(@Valid @RequestBody Validationentity valid){
            return service.validData(valid);
         }
        
}