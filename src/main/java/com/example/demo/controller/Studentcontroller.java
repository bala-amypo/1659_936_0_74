package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller{
         @Autowired  Studentservice ser     //used to call methods and attributes from other files
}