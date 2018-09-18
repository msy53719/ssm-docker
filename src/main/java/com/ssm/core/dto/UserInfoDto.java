package com.ssm.core.dto;

import java.io.Serializable;

public class UserInfoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3473513857573601729L;

	private String phone;
	private String name;
	private String email;
	private String sex;
	private String birthday;
	private String IdcardNo;
	private UserLoginDto userLoginDto;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getIdcardNo() {
		return IdcardNo;
	}

	public void setIdcardNo(String idcardNo) {
		IdcardNo = idcardNo;
	}

	public UserLoginDto getUserLoginDto() {
		return userLoginDto;
	}

	public void setUserLoginDto(UserLoginDto userLoginDto) {
		this.userLoginDto = userLoginDto;
	}

}
