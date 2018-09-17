package com.ssm.core.dto;

import java.io.Serializable;

public class UserLoginDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4013802029222509240L;
	public int id;
	public String name;
	public String phone;
	public String sex;
	public String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "id:" + this.id + "name:" + this.name + "phone:" + this.phone + "sex:" + this.sex + "email:"
				+ this.email;
	}

}
