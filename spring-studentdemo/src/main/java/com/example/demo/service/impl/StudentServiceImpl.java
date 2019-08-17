package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public int saveOne() {
		int id = 1;
		String name = "heh";
		String grade = "1";
		int age = 9;
		return studentMapper.save(id, name, grade, age);
	}

}
