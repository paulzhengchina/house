package com.createdevelopment.house.service.house;

import java.util.List;

import com.createdevelopment.house.dao.house.HouseDao;
import com.createdevelopment.house.entity.House;

public class HouseServiceImpl implements HouseService {
    private HouseDao houseDao;
	@Override
	public List<House> getAllHouses() {
		// TODO Auto-generated method stub
		return houseDao.getAllHouses();
	}
	public HouseDao getHouseDao() {
		return houseDao;
	}
	public void setHouseDao(HouseDao houseDao) {
		this.houseDao = houseDao;
	}
	
	

}
