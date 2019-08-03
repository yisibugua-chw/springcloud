package com.example.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "config-client")
public interface RefreshService {
	
	@RequestMapping(value = "/refresh", method = RequestMethod.POST)
    public void refresh();

}
