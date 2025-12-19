package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Timestamprepo;


@Repository
public interface Timestamprepo extends JpaRepository<Timestamp,Long>{      //parent extends child
     //use in service layer,
         
} 