package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Studententity;


@RestController
public class Studentcontroller{
         @Autowired  Studentservice ser     //used to call methods and attributes from other files


         @PostMapping("/post")
         public Studententity sendData(@RequestBody StudentEntity stu){
                      return ser.postData(stu);
         }
}