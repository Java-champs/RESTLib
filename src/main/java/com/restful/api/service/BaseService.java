package com.restful.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class BaseService<T> {

	protected abstract List<?> fetchList(Map<?, ?> content);

	protected abstract Object createDataModel(Object object);

	@SuppressWarnings("unchecked")
	public List<T> list(Map<?, ?> content) {

		List<T> decators = new ArrayList<>();

		// TODO need to handle max and offset

		// abstract method for specific API
		List<?> entities = fetchList(content);
		for (Object object : entities) {
			decators.add((T) createDataModel(object));
		}

		return decators;
	}

	public Long count(Map<?, ?> content) {

		return null;
	}

	public T get(String id) {

		return null;
	}

	public T create(Map<?, ?> content) {

		return null;

	}

	public T update(Map<?, ?> content) {

		return null;
	}

}
