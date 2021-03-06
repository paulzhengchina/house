package com.createdevelopment.house.entity;

public class Room {
	private Picture roomImage;
	private TypeValue roomType;
	private String description;
	private House belongedHouse;

	public Picture getRoomImage() {
		return roomImage;
	}

	public void setRoomImage(Picture roomImage) {
		this.roomImage = roomImage;
	}

	public TypeValue getRoomType() {
		return roomType;
	}

	public void setRoomType(TypeValue roomType) {
		this.roomType = roomType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public House getBelongedHouse() {
		return belongedHouse;
	}

	public void setBelongedHouse(House belongedHouse) {
		this.belongedHouse = belongedHouse;
	}

}
