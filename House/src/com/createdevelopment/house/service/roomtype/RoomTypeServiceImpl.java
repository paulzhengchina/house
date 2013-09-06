package com.createdevelopment.house.service.roomtype;

import java.util.List;

import com.createdevelopment.house.dao.roomtype.RoomTypeDao;
import com.createdevelopment.house.entity.House;
import com.createdevelopment.house.entity.RoomType;

public class RoomTypeServiceImpl implements RoomTypeService {
	private RoomTypeDao roomTypeDao;

	public RoomTypeDao getRoomTypeDao() {
		return roomTypeDao;
	}

	public void setRoomTypeDao(RoomTypeDao roomTypeDao) {
		this.roomTypeDao = roomTypeDao;
	}

	@Override
	public List<RoomType> obtainAllRoomTypesForHouse(String belongedHouseId) {
		// TODO Auto-generated method stub

		return roomTypeDao.obtainAllRoomTypesForHouse(belongedHouseId);
	}

	@Override
	public void saveRoomType(RoomType roomType) {
		// TODO Auto-generated method stub
		roomTypeDao.saveRoomType(roomType);
	}

}
