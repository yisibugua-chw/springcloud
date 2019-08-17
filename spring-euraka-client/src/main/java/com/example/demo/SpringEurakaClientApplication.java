package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class SpringEurakaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurakaClientApplication.class, args);
	}

	@Value("${server.port}")
	String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "chw") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
    
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
