package com.example.demo.entity

import java.util.Date;

@Entity
public class Studententity{
       private Integer id;
       private String name;
       private  String email;
       private String password;
       private Date creatAt;

      public void setId(int id){
        this.id=id;
      }
      public int getId(){
        return id;
      }
       public String getName(){
        return name;
      }
       public void setName(String name){
        this.name=name;
      }
      public String getEmail(){
        return email;
      }
       public void setEmail(String email){
        this.email=email;
      }
      public String getPassword(){
        return password;
      }
       public void setPassword(String password){
        this.password=password;
      }
      public Date getCreateAt(){
        return createAt;
      }
       public void setCreateAt(Date createAt){
        this.createAt=CreateAt;
      }
     
        



}