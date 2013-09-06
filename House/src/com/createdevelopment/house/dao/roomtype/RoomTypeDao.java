package com.createdevelopment.house.dao.roomtype;

import java.util.List;

import com.createdevelopment.house.entity.RoomType;

public interface RoomTypeDao {

	List<RoomType> obtainAllRoomTypesForHouse(String belongedHouseId);

	void saveRoomType(RoomType roomType);

}
