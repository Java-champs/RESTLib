package com.restful;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.restful.api.config.RestConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RestConfigBeanTest {

	@Autowired
	private RestConfig restConfig;

	@Test
	public void testLoadingOfProperties() {

		System.out.println("restConfig = " + restConfig);

		System.out.println(restConfig.getResources().get("about").getServiceName());
		System.out.println(restConfig.getResources().get("about").getMethods());
		System.out.println(restConfig.getResources().get("about").getRepresentations().get(0).getDecorator());
		System.out.println(restConfig.getResources().get("about").getRepresentations().get(0).getMediaTypes());
		System.out.println(restConfig.getResources().get("about").getRepresentations().get(1).getDecorator());
		System.out.println(restConfig.getResources().get("about").getRepresentations().get(1).getMediaTypes());



	}
}
