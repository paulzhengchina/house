package com.createdevelopment.house.entity;

public class Picture {
	private String id;
	private String path;
	private String ownerId;
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Picture(){
		super();
	}
	
	public Picture(String id) {
		super();
		this.id = id;
	}
	

}
