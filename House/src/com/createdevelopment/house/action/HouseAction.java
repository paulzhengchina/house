package com.createdevelopment.house.action;

import java.io.File;
import java.util.List;

import com.createdevelopment.house.entity.House;
import com.createdevelopment.house.entity.Picture;
import com.createdevelopment.house.service.house.HouseService;
import com.createdevelopment.house.service.picture.PictureService;

@SuppressWarnings("serial")
public class HouseAction extends BaseAction {
	List<House> houses;
	HouseService houseService;
	PictureService pictureService;
	House house;
    private File logo;
    private String logoContentType;
	private String logoFileName;
    private File over_view;
    private String over_viewContentType;
	private String over_viewFileName;
	private String realPathString;
	private String testString;
	
	public String showAllHouses(){
		houses=houseService.getAllHouses();
		return SUCCESS;
	}
	
	public String showAddHouse(){
		return SUCCESS;
	}
		
    public String obtainHouses(){
    	return SUCCESS;
    }
    
    public String saveHouse(){
    	realPathString=this.getRequest().getRealPath("/");
    	Picture logoPicture=pictureService.savePicture(null, logo, logoFileName, realPathString);
    	Picture over_viewPicture=pictureService.savePicture(null, over_view, over_viewFileName, realPathString);
    	house.setLogo(logoPicture);
    	house.setOver_view(over_viewPicture);
    	houseService.saveHouse(house);
    	return SUCCESS;
    }
    
    /*
     * set and get methods start from here
     */
	public void setHouses(List<House> houses) {
		this.houses = houses;
	}
	
	public List<House> getHouses(){
		return houses;
	}
	public HouseService getHouseService() {
		return houseService;
	}
	public void setHouseService(HouseService houseService) {
		this.houseService = houseService;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public File getLogo() {
		return logo;
	}

	public void setLogo(File logo) {
		this.logo = logo;
	}


	public String getLogoContentType() {
		return logoContentType;
	}

	public void setLogoContentType(String logoContentType) {
		this.logoContentType = logoContentType;
	}

	public String getLogoFileName() {
		return logoFileName;
	}

	public void setLogoFileName(String logoFileName) {
		this.logoFileName = logoFileName;
	}

	public File getOver_view() {
		return over_view;
	}

	public void setOver_view(File over_view) {
		this.over_view = over_view;
	}

	public PictureService getPictureService() {
		return pictureService;
	}

	public void setPictureService(PictureService pictureService) {
		this.pictureService = pictureService;
	}

	public String getOver_viewContentType() {
		return over_viewContentType;
	}

	public void setOver_viewContentType(String over_viewContentType) {
		this.over_viewContentType = over_viewContentType;
	}

	public String getover_viewFileName() {
		return over_viewFileName;
	}

	public void setover_viewFileName(String lover_viewFileName) {
		this.over_viewFileName = lover_viewFileName;
	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}
	
    
}
