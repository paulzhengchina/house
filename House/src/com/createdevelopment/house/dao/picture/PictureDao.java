package com.createdevelopment.house.dao.picture;

import java.util.List;

import com.createdevelopment.house.dao.BaseDao;
import com.createdevelopment.house.entity.Picture;

public interface PictureDao extends BaseDao {

	Picture getPicture(String pictureId);
	
	void deletePicture(Picture picture);

	List<Picture> getPicturesForObject(String ownerId);

	Picture savePicture(Picture picture);


}
