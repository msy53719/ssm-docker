package com.ssm.core.dto;

import java.io.Serializable;

public class ResultDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2510746013445666368L;
	private String code;
	private String message;
	private Object data;

	// private List<?> list;
	//
	// public List<?> getList() {
	// return list;
	// }
	//
	// public void setList(List<?> list) {
	// this.list = list;
	// }

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
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
