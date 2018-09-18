package com.ssm.core.dto;

import java.io.Serializable;

public class FoodDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -803421699632696837L;

	private String name;
	private String type;
	private String colour;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
