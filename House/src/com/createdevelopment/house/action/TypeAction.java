package com.createdevelopment.house.action;

import java.util.List;

import com.createdevelopment.house.entity.Type;
import com.createdevelopment.house.service.type.TypeService;

public class TypeAction extends BaseAction {
    private TypeService typeService;
    private List<Type> types;
    private String valuesstring;
    private Type type;
    
	public String showAllTypes(){
		 types=typeService.obtainTypes();
    	 return SUCCESS;
     }
   
	public String showAddTypePage(){
    	return SUCCESS;
    }
	
	public String saveType(){
		typeService.saveNewCreatedType(type,valuesstring);
		return SUCCESS;
	}
    
    /*get and set methods start
     * 
     */
	public TypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	public List<Type> getTypes() {
		return types;
	}

	public void setTypes(List<Type> types) {
		this.types = types;
	}

	public String getValuesstring() {
		return valuesstring;
	}

	public void setValuesstring(String valuesstring) {
		this.valuesstring = valuesstring;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
}
