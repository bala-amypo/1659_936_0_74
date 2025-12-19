package com.example.demo.entity;
 import jakarta.persistence.OneToOne;
 import jakarta.persistence.JoinColumn;
public class Studentdetails{
    private Integer id;
     private Integer card_no;
    
    @OneToOne
    @JoinColumn(name = "student_id")
    private Studentetable student;

}