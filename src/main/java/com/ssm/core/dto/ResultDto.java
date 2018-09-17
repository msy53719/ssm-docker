package com.ssm.core.dto;

import java.io.Serializable;
import java.util.Map;

public class ResultDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2510746013445666368L;
	private String code;
	private String message;
	private Map<Object, Object> map;

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

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

}
