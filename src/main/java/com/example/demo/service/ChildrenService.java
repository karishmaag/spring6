package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.ChildrenModel;

import com.example.demo.repository.ChildrenRepo;

@Service
public class ChildrenService {
       @Autowired
       ChildrenRepo cc;
       public List<ChildrenModel> saveinfo(List<ChildrenModel> ch)
       {
    	   return cc.saveAll(ch);
       }
       public List<ChildrenModel>sortinfo(String s)
  	 {
  		 return cc.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
  	 }
  	 public  List<ChildrenModel>getbyPage(int pgno,int pgSize)
  	 {
  		 Page<ChildrenModel>p=cc.findAll(PageRequest.of(pgno, pgSize));
  		 return p.getContent();
  	 }
	 public  List<ChildrenModel>getbyPagesorting(int pgno,int pgSize,String s)
	 {
		 Page<ChildrenModel>p=cc.findAll(PageRequest.of(pgno, pgSize,Sort.by(Sort.DEFAULT_DIRECTION,s)));
		 return p.getContent();
	 }
}
