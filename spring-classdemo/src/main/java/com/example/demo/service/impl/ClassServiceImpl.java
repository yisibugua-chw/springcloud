package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ClassMapper;
import com.example.demo.model.Clazz;
import com.example.demo.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService{

	@Autowired
	private ClassMapper classMapper;

	@Override
	public int save(Clazz clazz) {
		return classMapper.save(clazz.getId(), clazz.getClassName(), clazz.getStudentId());
	}
	
	
}
