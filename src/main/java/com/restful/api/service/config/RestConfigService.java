package com.restful.api.service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.api.config.RestConfig;

@Service
public class RestConfigService {

	@Autowired
	private RestConfig restConfig;
	
	RestConfig.Resource getResource(String resourceName){
		return restConfig.getResources().get(resourceName);
	}
	
}
