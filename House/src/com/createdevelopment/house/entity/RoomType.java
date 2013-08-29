package com.createdevelopment.house.entity;

public class RoomType {
	private String id;
	private Picture roomTypeImage;
	private TypeValue category;
	private String description;
	private House belongedHouse;
	private String name;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Picture getRoomTypeImage() {
		return roomTypeImage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRoomTypeImage(Picture roomTypeImage) {
		this.roomTypeImage = roomTypeImage;
	}

	

	public TypeValue getCategory() {
		return category;
	}

	public void setCategory(TypeValue category) {
		this.category = category;
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
