package com.createdevelopment.house.service.picture;

import java.io.File;
import java.util.Date;
import java.util.List;

import com.createdevelopment.house.dao.picture.PictureDao;
import com.createdevelopment.house.entity.House;
import com.createdevelopment.house.entity.Picture;
import com.createdevelopment.house.util.FileUtil;

public class PictureServiceImpl implements PictureService{
   

	public static final String UPLOAD_DIR="upload";
	private PictureDao pictureDao;
	@Override
	public Picture savePicture(Picture picture, File objectFile, String objectFileName, String realPath) {
		// TODO Auto-generated method stub
		objectFileName=objectFileName.substring(objectFileName.indexOf("."), objectFileName.length());
		if(picture==null)
			picture =new Picture();
		if(objectFile!=null){
			try {
				String filename=new Date().getTime()+objectFileName;
				FileUtil.uploadFile(objectFile, realPath+UPLOAD_DIR,filename);
				String realpath=UPLOAD_DIR + "/" +filename;
				picture.setPath(realpath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  
		}
		 return pictureDao.savePicture(picture);
			
	}

	@Override
	public Picture updatePicture(Picture picture, File objectFile, String objectFileName, String realPath) {
		// TODO Auto-generated method stub
		objectFileName=objectFileName.substring(objectFileName.indexOf("."), objectFileName.length());
		if(objectFile!=null){
			try {
				String filename=new Date().getTime()+objectFileName;
				FileUtil.uploadFile(objectFile, realPath+UPLOAD_DIR,filename);
				String realpath=UPLOAD_DIR + "/" +filename;
				picture.setPath(realpath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
									
		}
		return null;
	//	pictureDao.savePicture(picture);
	}
	
	@Override
	public List<Picture> findPicturesForHouse(House house) {
		// TODO Auto-generated method stub
		return pictureDao.getPicturesForObject(house.getId());
	}

	public PictureDao getPictureDao() {
		return pictureDao;
	}

	public void setPictureDao(PictureDao pictureDao) {
		this.pictureDao = pictureDao;
	}

	
    
}
