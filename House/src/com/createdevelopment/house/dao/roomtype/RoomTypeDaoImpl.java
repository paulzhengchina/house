package com.createdevelopment.house.dao.roomtype;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.createdevelopment.house.dao.BaseDaoImpl;
import com.createdevelopment.house.entity.RoomType;

public class RoomTypeDaoImpl extends BaseDaoImpl implements RoomTypeDao {

	@Override
	public List<RoomType> obtainAllRoomTypesForHouse(String belongedHouseId) {
		// TODO Auto-generated method stub
		DetachedCriteria detachedCriteria=DetachedCriteria.forClass(RoomType.class);
		detachedCriteria.add(Restrictions.eq("belongedHouse.id", belongedHouseId ));
		return this.getHibernateTemplate().findByCriteria(detachedCriteria);
	}

	@Override
	public void saveRoomType(RoomType roomType) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(roomType);
	}

}
