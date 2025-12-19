package com.example.demo.entity;

public class Studentdetails{
    private Integer id;
     private Integer card_no;
    
    @OneToOne
    private Studentetable student;

}