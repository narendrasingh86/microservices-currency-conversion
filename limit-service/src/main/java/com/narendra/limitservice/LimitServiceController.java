package com.narendra.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narendra.limitservice.bean.LimitService;

@RestController
public class LimitServiceController {
	
	@Autowired
	private MyConfiguration myConfig;
	
	/*
	 * @Value("${limit-service-minimum}") private String minimum1;
	 * 
	 * @Value("${limit-service-maximum}") private String maximum1;
	 */
	
	@GetMapping("/limits")
	public LimitService getLimitServiceConfig() {
		LimitService limitService =  new LimitService(myConfig.getMinimum(),myConfig.getMaximum());
		return limitService;
	}
}
