package com.prog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.entity.Details;


public interface DetRepo extends JpaRepository<Details, Integer> {

}

