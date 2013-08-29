package com.createdevelopment.house.service.type;

import java.util.List;

import com.createdevelopment.house.entity.Type;
import com.createdevelopment.house.entity.TypeValue;

public interface TypeService {

	public List<Type> obtainTypes();

	public void saveNewCreatedType(Type type, String valuesstring);

	public List<TypeValue> obtainTypeValuesByName(String typeName);

}
