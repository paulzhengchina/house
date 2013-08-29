package com.createdevelopment.house.dao.type;

import java.util.List;

import com.createdevelopment.house.entity.Type;
import com.createdevelopment.house.entity.TypeValue;

public interface TypeDao {

	public List<Type> obtainTypes();

	public Type createType(Type type);

	public void saveTypeValue(TypeValue value);

	public List<TypeValue> obtainTypeValuesByName(String typeName);

}
