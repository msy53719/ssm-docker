package com.ssm.core.dto;

import java.io.Serializable;
import java.util.List;

public class ResultDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2510746013445666368L;
	private String code;
	private String message;
	private List<?> list;

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
