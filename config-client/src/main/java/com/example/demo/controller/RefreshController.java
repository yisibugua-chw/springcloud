package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefreshController {

	@RequestMapping(value = "/refresh", method = RequestMethod.POST)
    public void refresh() {
    	
    }
}
