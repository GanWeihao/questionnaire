package com.system.questionnaire.util;

public class JsonResult {
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	private String status;
	public JsonResult(String status, String message) {
		this.status = status;
		this.message = message;
	}
	public JsonResult(String status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}
	private String message;
	private Object data;
}
