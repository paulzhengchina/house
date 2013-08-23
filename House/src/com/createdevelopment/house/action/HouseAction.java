package com.createdevelopment.house.action;

import java.util.List;

import com.createdevelopment.house.entity.House;
import com.createdevelopment.house.service.house.HouseService;

@SuppressWarnings("serial")
public class HouseAction extends BaseAction {
	List<House> houses;
	HouseService houseService;
	House house;
	
	public String showAllHouses(){
		houses=houseService.getAllHouses();
		return SUCCESS;
	}
	
	public String showAddHouse(){
		return SUCCESS;
	}
		
    public String getHouses(){
    	return SUCCESS;
    }
	public void setHouses(List<House> houses) {
		this.houses = houses;
	}
	public HouseService getHouseService() {
		return houseService;
	}
	public void setHouseService(HouseService houseService) {
		this.houseService = houseService;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
    
}
