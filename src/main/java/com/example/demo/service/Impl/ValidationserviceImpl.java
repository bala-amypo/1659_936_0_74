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

            // @Override
            // public   List<Validationentity>getAllData(){
            //    return student.findAll();
            // }
            // @Override
            //  public String delete(int id){
            //      student.deleteById(id);  // if add return ,it will give error
            //      return "Deleted Successfully";
            //  }
            // @Override
            // public  Studententity getData(int id){          //return type:Studententity ,gives error -> so add orElse(null)
            //    return student.findById(id).orElse(null);
            // }
            // @Override
            // public  Studententity updatedata(int id,Studententity entity){
            //    if(student.existsById(id)){
            //       entity.setId(id);
            //       return student.save(entity);
            //    }
            //    return null;
            // }

}