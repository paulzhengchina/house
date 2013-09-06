package com.createdevelopment.house.action;

import java.util.List;

import com.createdevelopment.house.entity.PublicFacility;
import com.createdevelopment.house.service.publicfacility.PublicFacilityService;

public class PublicFacilityAction extends BaseAction {
    private PublicFacilityService publicFacilityService;
    private List<PublicFacility> publicFacilities;
    
    public String loadManagingPublicFacilities(){
    	return SUCCESS;
    }

	public PublicFacilityService getPublicFacilityService() {
		return publicFacilityService;
	}

	public void setPublicFacilityService(PublicFacilityService publicFacilityService) {
		this.publicFacilityService = publicFacilityService;
	}

	public List<PublicFacility> getPublicFacilities() {
		return publicFacilities;
	}

	public void setPublicFacilities(List<PublicFacility> publicFacilities) {
		this.publicFacilities = publicFacilities;
	}
    
    
}
