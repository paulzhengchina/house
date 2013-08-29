package com.createdevelopment.house.service.type;

import java.util.List;
import java.util.UUID;

import com.createdevelopment.house.dao.type.TypeDao;
import com.createdevelopment.house.entity.Type;
import com.createdevelopment.house.entity.TypeValue;

public class TypeServiceImpl implements TypeService {
    private TypeDao typeDao;

	public TypeDao getTypeDao() {
		return typeDao;
	}

	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}

	@Override
	public List<Type> obtainTypes() {
		// TODO Auto-generated method stub
		return typeDao.obtainTypes();
	}

	@Override
	public void saveNewCreatedType(Type type, String valuesstring) {
		// TODO Auto-generated method stub
		type=typeDao.createType(type);
		if(valuesstring!=null&&valuesstring.length()>0){
			String filteredValues=valuesstring.replaceAll("，", ",");		
			String[] categoryvaluearray=filteredValues.split(",");
			for(int i=0;i<categoryvaluearray.length;i++){
			
				TypeValue value=new TypeValue();
				value.setId(UUID.randomUUID().toString());
				value.setValue(categoryvaluearray[i]);
				value.setType(type);
				typeDao.saveTypeValue(value);
			}
		}
		
	}

	@Override
	public List<TypeValue> obtainTypeValuesByName(String typeName) {
		// TODO Auto-generated method stub
		return typeDao.obtainTypeValuesByName(typeName);
	}
    
    
}
