package com.createdevelopment.house.service.house;

import java.util.List;

import com.createdevelopment.house.entity.House;

public interface HouseService {

	List<House> getAllHouses();

	void saveHouse(House house);

}
