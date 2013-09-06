package com.createdevelopment.house.action;

import java.io.File;
import java.util.List;

import com.createdevelopment.house.entity.Picture;
import com.createdevelopment.house.service.picture.PictureService;

public class PictureAction extends BaseAction {
	private PictureService pictureService;
	private List<Picture> pictures;
	private String ownerId;
	private Picture picture;
	private File image;
	private String imageFileName;
	private String realPathString;
	
	public String gotomanagepictures(){
		pictures=pictureService.findPicturesForOwner(ownerId);
		return SUCCESS;
	}

	public String savePicture(){
		realPathString=this.getRequest().getRealPath("/");
    	Picture logoPicture=pictureService.savePicture(picture, image, imageFileName, realPathString);
    	return SUCCESS;
	}
	/*
	 * set and get methods start
	 */
	public PictureService getPictureService() {		
		return pictureService;
	}

	public void setPictureService(PictureService pictureService) {
		this.pictureService = pictureService;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
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
	
	

}
