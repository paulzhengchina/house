package com.createdevelopment.house.action;

import java.io.File;
import java.util.List;

import com.createdevelopment.house.entity.Picture;
import com.createdevelopment.house.entity.RoomType;
import com.createdevelopment.house.entity.TypeValue;
import com.createdevelopment.house.service.picture.PictureService;
import com.createdevelopment.house.service.roomtype.RoomTypeService;
import com.createdevelopment.house.service.type.TypeService;

public class RoomTypeAction extends BaseAction {
	private String belongedHouseId;
	private RoomTypeService roomTypeService;
	private List<RoomType> roomTypes;
	private List<TypeValue> categories;
	private RoomType roomType;
	private TypeService typeService;
	private File image;
    private String imageFileName;
    private PictureService pictureService;
	
	

	public String loadManageRoomType() {
		roomTypes=roomTypeService.obtainAllRoomTypesForHouse(belongedHouseId);
		categories=typeService.obtainTypeValuesByName(this.ROOMCATEGORYTITLE);
		return SUCCESS;
	}
	
	public String saveRoomType(){
		Picture imagePic=pictureService.savePicture(null, image, imageFileName, this.getRequest().getRealPath("/"));
		roomType.setRoomTypeImage(imagePic);
		roomTypeService.saveRoomType(roomType);
		
		return SUCCESS;
	}

	public RoomTypeService getRoomTypeService() {
		return roomTypeService;
	}

	public void setRoomTypeService(RoomTypeService roomTypeService) {
		this.roomTypeService = roomTypeService;
	}

	public String getBelongedHouseId() {
		return belongedHouseId;
	}

	public void setBelongedHouseId(String belongedHouseId) {
		this.belongedHouseId = belongedHouseId;
	}

	public List<RoomType> getRoomTypes() {
		return roomTypes;
	}

	public void setRoomTypes(List<RoomType> roomTypes) {
		this.roomTypes = roomTypes;
	}

	public List<TypeValue> getCategories() {
		return categories;
	}

	public void setCategories(List<TypeValue> categories) {
		this.categories = categories;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public TypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public PictureService getPictureService() {
		return pictureService;
	}

	public void setPictureService(PictureService pictureService) {
		this.pictureService = pictureService;
	}
	
	

}
