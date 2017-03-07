package com.restful.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

import com.restful.api.config.RestConfig;
import com.restful.api.service.config.RestConfigService;

@RestController
@EnableAutoConfiguration
public class RestfulApiController {

	@Autowired
	private RestConfigService restConfigService;

	private RestConfig.Resource resource;
	
	

	
}
