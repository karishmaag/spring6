package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ChildrenModel;

public interface ChildrenRepo extends JpaRepository<ChildrenModel, Integer>{

}
