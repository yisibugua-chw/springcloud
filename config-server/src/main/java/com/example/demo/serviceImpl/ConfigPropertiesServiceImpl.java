package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ConfigPropertiesMapper;
import com.example.demo.model.ConfigProperties;
import com.example.demo.service.ConfigPropertiesService;

@Service
public class ConfigPropertiesServiceImpl implements ConfigPropertiesService{

	@Autowired
	private ConfigPropertiesMapper configPropertiesMapper;
	
	
	@Override
	public int saveConfigProperties(ConfigProperties configProperties) {
		ConfigProperties configProperties1 = new ConfigProperties(2, "foo", "testchw", "config-client", "dev", "master");
		int updateByPrimaryKey = configPropertiesMapper.updateByPrimaryKey(configProperties1);
		
		return updateByPrimaryKey;
	}

}
