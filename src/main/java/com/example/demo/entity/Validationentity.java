package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;




@Entity
public class Validationentity{

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;
        @NotNull
        private String name;
        private String email;
        private String pass;
        private Integer age;




}