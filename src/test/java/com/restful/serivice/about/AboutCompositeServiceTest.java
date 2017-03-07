package com.restful.serivice.about;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.restful.api.service.about.AboutCompositeService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AboutCompositeServiceTest {
	
	@Autowired 
    private AboutCompositeService aboutService;

	@Test
	public void testList(){
		Map<String, String> params = new HashMap<String, String>();
		
     System.out.println(aboutService.list(params));
     
	}
}
