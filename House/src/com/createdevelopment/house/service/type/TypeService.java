package com.createdevelopment.house.service.type;

import java.util.List;

import com.createdevelopment.house.entity.Type;

public interface TypeService {

	public List<Type> obtainTypes();

	public void saveNewCreatedType(Type type, String valuesstring);

}
