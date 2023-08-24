package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ChildrenModel;
import com.example.demo.service.ChildrenService;


@RestController
public class ChildrenController {
	@Autowired
	ChildrenService cs;
	@PostMapping("save")
    public List<ChildrenModel> add(@RequestBody List<ChildrenModel> ch)
    {
   	 return cs.saveinfo(ch);
    }
	@GetMapping("sort/{name}")
	public List<ChildrenModel>getsortinfo(@PathVariable String name)
	{
		return cs.sortinfo(name);
    }
 @GetMapping("paging/{pageno}/{pagesize}")
public List<ChildrenModel>getpage(@PathVariable int pageno,@PathVariable int pagesize)
{
	 return cs.getbyPage(pageno, pagesize);
}
 @GetMapping("paging/{pageno}/{pagesize}/{names}")
 public List<ChildrenModel> getpagebysorting(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String names)
 {
 	 return cs.getbyPagesorting(pageno, pagesize,names);
 }
}
