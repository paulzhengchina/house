package com.createdevelopment.house.service.picture;

import java.io.File;

import com.createdevelopment.house.entity.Picture;

public interface PictureService {

	Picture updatePicture(Picture persitentPicture, File objectFile, String objectFileName, String realPath);

	Picture savePicture(Picture persitentPicture, File objectFile,String objectFileName, String realPath);

}
