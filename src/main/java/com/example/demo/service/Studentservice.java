package com.example.demo.service;

import com.example.demo.entity.Studententity;
import java.util.List;
// import java.util.Map;

public interface  Studentservice{
       
       Studententity postData(Studententity stu); // method declaration and stu is the users giving detail

       List<Studententity>getAllData();                 //method declaration for rereiving all the data
       
       String delete(int id);

       Studententity getData(int id);
        
        //put
        Studententity updatedata(int id,Studententity entity);
}