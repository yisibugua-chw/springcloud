package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Clazz;
import com.example.demo.service.ClassService;

@RestController
@RequestMapping("/class")
public class ClassController {

	@Autowired
	private ClassService classService;
	
	@RequestMapping("/save")
	public String saveOne() {
		Clazz clazz = new Clazz();
		clazz.setId(1);
		clazz.setClassName("math");
		clazz.setStudentId(1);
		int count = classService.save(clazz);
		String re = "";
		return re+ clazz.toString() + "  " + count;
	}
}
