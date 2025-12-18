package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PathVariable;
 

import org.springframework.stereotype.Service;
import com.example.demo.repository.Validationrepo;
import com.example.demo.entity.Validationentity;
import com.example.demo.service.Validationservice;
import java.util.List;


@Service  
public class ValidationserviceImpl implements Validationservice{   //splited as 2 layers here

            @Autowired Validationrepo student; 
            //save()-insert,update
            //findall(),findById(),deleteById(),existById()

            @Override
            public  Validationentity postData(Validationentity stu){
               return student.save(stu);
            }

           
}