package com.createdevelopment.house.service.roomtype;

import java.util.List;

import com.createdevelopment.house.entity.RoomType;

public interface RoomTypeService {

	List<RoomType> obtainAllRoomTypesForHouse(String belongedHouseId);

	void saveRoomType(RoomType roomType);

}
