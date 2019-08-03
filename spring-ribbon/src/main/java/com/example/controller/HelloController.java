package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@RequestMapping("/hehe")
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}
	
	@RequestMapping("hhh")
	public void hhh() {
		System.out.println("sss");
	}
}
