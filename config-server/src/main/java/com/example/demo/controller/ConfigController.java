package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.feign.RefreshService;
import com.example.demo.model.ConfigProperties;
import com.example.demo.service.ConfigPropertiesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/config")
@Api(tags = { "配置接口测试" })
public class ConfigController {
	
	@Autowired
	private ConfigPropertiesService configPropertiesService;
	
	@Autowired
	private RefreshService refreshService;
	
	@ApiOperation(value = "添加配置")
	@RequestMapping("/saveConfigProperties")
	public void saveConfigProperties() {
		try {
//			ConfigProperties configProperties = new ConfigProperties(3, "testchw", "testchw", "config-client", "dev", "master");
			ConfigProperties configProperties = new ConfigProperties(2, "foo", "testchw", "config-client", "dev", "master");
			int count = configPropertiesService.saveConfigProperties(configProperties);
			//刷新配置
			if (count == 1) {
				refreshService.refresh();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	

}
