package com.createdevelopment.house.dao.type;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

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

}
