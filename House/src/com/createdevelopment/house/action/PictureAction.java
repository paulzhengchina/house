package com.createdevelopment.house.action;

import com.createdevelopment.house.service.picture.PictureService;

public class PictureAction extends BaseAction {
	private PictureService pictureService;

	public PictureService getPictureService() {
		return pictureService;
	}

	public void setPictureService(PictureService pictureService) {
		this.pictureService = pictureService;
	}

}
