package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakrta.validation.constraints.NotNull;
import jakrta.validation.constraints.Size;
import jakrta.validation.constraints.Email;
import jakrta.validation.constraints.Max;
import jakrta.validation.constraints.Positive;



@Entity
public class Validationentity{

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;
        @NotNull
        @Size(min= 2,max = 10, message="must be 2 to 10 character")
        private String name;
        @Email(message="Email is not valid")
        private String email;
        @Size(min= 2,max = 10, message="must be 2 to 10 character")
        @NotNull(message=" Password is mandatory")
        private String password;
        @Max(30)
        @Positive(message="Age  must be positive")
        private int age;
         


          public void setId(long id){
        this.id=id;
      }
      public Long getId(){
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
      public  Integer getAge(){
        return age;
      }
       public void setAge(int age){
        this.age=age;
      }



        public Validationentity(Long id,  @NotNull
        @Size(min= 2,max = 10, message="must be 2 to 10 character") String name,
        @Email(message="Email is not valid") String email,
        @Size(min= 2,max = 10, message="must be 2 to 10 character")
        @NotNull(message=" Password is mandatory") String password,
        @Max(30)
        @Positive(message="Age  must be positive") int age){
            this.id=id;
            this.name=name;
            this.email=email;
            this.password=password;
            this.age=age;
        }
        public Validationentity(){

        }



}