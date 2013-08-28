package com.createdevelopment.house.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Type {
	private String id;
	private String name;
	private Set<TypeValue> values = new HashSet<TypeValue>(0);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Set<TypeValue> getValues() {
		return values;
	}

	public void setValues(Set<TypeValue> values) {
		this.values = values;
	}

	
	
}
