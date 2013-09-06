package com.createdevelopment.house.dao.type;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.createdevelopment.house.dao.BaseDaoImpl;
import com.createdevelopment.house.entity.Type;
import com.createdevelopment.house.entity.TypeValue;

public class TypeDaoImpl extends BaseDaoImpl implements TypeDao {

	@Override
	public List<Type> obtainTypes() {
		// TODO Auto-generated method stub
		DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Type.class);
		List<Type> types=this.getHibernateTemplate().findByCriteria(detachedCriteria);
	    return types;
	}

	@Override
	public Type createType(Type type) {
		// TODO Auto-generated method stub
		return (Type) this.saveEntityWithReturnedObjection(type);
	}

	@Override
	public void saveTypeValue(TypeValue value) {
	   this.getHibernateTemplate().save(value);
	}

	@Override
	public List<TypeValue> obtainTypeValuesByName(String typeName) {
		// TODO Auto-generated method stub
		List<TypeValue> typeValues =new ArrayList<TypeValue>();
		DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Type.class);
		detachedCriteria.add(Restrictions.eq("name", typeName));		
		List<Type> types=this.getHibernateTemplate().findByCriteria(detachedCriteria);
		if(types!=null && types.size()>0){
			Set<TypeValue> typeValuesInSet=types.get(0).getValues();
			typeValues.addAll(typeValuesInSet);
		}
		return typeValues;
	}

}
