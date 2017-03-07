package com.restful.api.config;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "config")
public class RestConfig {

	private Map<String, RestConfig.Resource> resources = new LinkedHashMap<String, RestConfig.Resource>();

	public Map<String, RestConfig.Resource> getResources() {
		return resources;
	}

	public void setResources(Map<String, RestConfig.Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String serviceName;
		
		private List<String> methods = new ArrayList<String>();

	    private List<RestConfig.Resource.Representation> representations = new ArrayList<RestConfig.Resource.Representation>();
		
		public String getServiceName() {
			return serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public List<String> getMethods() {
			return methods;
		}

		public void setMethods(List<String> methods) {
			this.methods = methods;
		}

		public List<RestConfig.Resource.Representation> getRepresentations() {
			return representations;
		}

		public void setRepresentations(List<RestConfig.Resource.Representation> representations) {
			this.representations = representations;
		}

		public static class Representation {
			
			private List<String> mediaTypes = new ArrayList<String>();
			
			private String decorator;
			

			public List<String> getMediaTypes() {
				return mediaTypes;
			}

			public void setMediaTypes(List<String> mediaTypes) {
				this.mediaTypes = mediaTypes;
			}

			public String getDecorator() {
				return decorator;
			}

			public void setDecorator(String decorator) {
				this.decorator = decorator;
			}

			
		}
		
		
	}
}
