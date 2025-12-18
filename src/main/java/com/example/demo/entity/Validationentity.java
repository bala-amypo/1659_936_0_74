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
        private Integer age;



        public Validationentity()




}