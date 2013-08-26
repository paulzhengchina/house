package com.createdevelopment.house.dao.house;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.createdevelopment.house.dao.BaseDaoImpl;
import com.createdevelopment.house.entity.House;

public class HouseDaoImpl extends BaseDaoImpl implements HouseDao{

	@Override
	public List<House> getAllHouses() {
		// TODO Auto-generated method stub
		DetachedCriteria detachedCriteria=DetachedCriteria.forClass(House.class);
		List<House> houses=this.getHibernateTemplate().findByCriteria(detachedCriteria);
	    return houses;
	}

	@Override
	public void saveHouse(House house) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(house);
	}

}
