package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
 

import org.springframework.stereotype.Service;
import com.example.demo.repository.Studentrepo;
import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;
import java.util.List;


@Service  
public class StudentserviceImpl implements Studentservice{   //splited as 2 layers here

            @Autowired Studentrepo student; 
            //save()-insert,update
            //findall(),findById(),deleteById(),existById()

            @Override
            public  Studententity postData(Studententity stu){
               return student.save(stu);
            }

            @Override
            public   List<Studententity>getAllData(){
               return student.findAll();
            }
}