package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakrta.validation.constraints.NotNull;



@Entity
public class Validationentity{

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;
        @NotNull
        @Size(min= 2,max = 10, message="must be 2 to 10 character")
        private String name;
        private String email;
        private String pass;
        private Integer age;




}