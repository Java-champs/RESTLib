package com.restful.api.service.about;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.restful.api.service.BaseService;

@Service
public class AboutCompositeService extends BaseService<Map<String,String>> {

	@Override
	protected List<Map<String, String>> fetchList(Map<?, ?> content) {
		List<Map<String,String>> aboutDataList = new ArrayList<Map<String,String>>();
		Map<String,String> aboutDataMap = new LinkedHashMap<String, String>();
		aboutDataMap.put("application", "restFul Plugin");
		aboutDataMap.put("version", "1.0");
		aboutDataList.add(aboutDataMap);
		return aboutDataList;
	}

	@Override
	protected Object createDataModel(Object object) {
		return  object;
	}

}
