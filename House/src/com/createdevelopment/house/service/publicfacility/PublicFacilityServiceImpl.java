package com.createdevelopment.house.service.publicfacility;

import com.createdevelopment.house.dao.publicfacility.PublicFacilityDao;

public class PublicFacilityServiceImpl implements PublicFacilityService {
	private PublicFacilityDao publicFacilityDao;

	public PublicFacilityDao getPublicFacilityDao() {
		return publicFacilityDao;
	}

	public void setPublicFacilityDao(PublicFacilityDao publicFacilityDao) {
		this.publicFacilityDao = publicFacilityDao;
	}

}
