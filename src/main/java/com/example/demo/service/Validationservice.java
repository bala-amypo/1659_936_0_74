package com.example.demo.service;

import com.example.demo.entity.Validationentity;
// import java.util.List;
// import java.util.Map;

public interface  Validationservice{
       
       Validationentity validData(Validationentity valid); // method declaration and stu is the users giving detail
       
        Validationentity getData(long id);
 
}