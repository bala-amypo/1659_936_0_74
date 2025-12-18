package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.entity.Validationentity;
import com.example.demo.service.Validationservice;


@RestController
public class Validationcontroller{
         @Autowired  Validationservice ser;  //used to call methods and attributes from other files


         @PostMapping("/post")
         public Validationentity sendData(@RequestBody Validationentity stu){
            return ser.postData(stu);
         }
         @GetMapping("/get")
         public List<Validationentity> getval(){
            return ser.getAllData();
        }

        @DeleteMapping("/del/{id}")
        public String deletedata(@PathVariable int id){
          return ser.delete(id);
}
       @GetMapping("/find/{id}")
       public   Studententity getDataval(@PathVariable int id){
        return ser.getData(id);
       }
       @PutMapping("/put/{id}")
       public Studententity updateval(@PathVariable int id,@RequestBody Studententity entity){
        return ser.updatedata(id,entity);
       }
}