package com.example.demo.service;

import com.example.demo.entity.Studententity;

public interface  Studentservice{
       
       Studententity postData(Studententity stu); // method declaration and stu is the users giving detail

       List<Studententity>getAllData()                 //method declaration
}