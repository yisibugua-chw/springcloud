package com.example.demo.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

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
	
	@ApiOperation(value = "测试请求头")
	@RequestMapping("/testheader")
	public void testheader() {
		try {
			ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
			HttpServletRequest request = attributes.getRequest();
			System.out.println(request);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	

}
