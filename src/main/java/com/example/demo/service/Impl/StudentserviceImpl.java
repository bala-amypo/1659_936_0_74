package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframwork.stereotype.Service;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;


@Service  
public class StudentservieImpl implements Studentservice{   //splited as 2 layers here

            @Autowired Studentrepo student; 
            //save()
            //findall(),findById(),deleteById(),existById()
            public  Studententity postData(Studententity stu){
               
            }
}