package com.example.tablecreation.model;

public class ResponseModel {
	
	private Boolean isSuccess;
	private String message;
	
	public ResponseModel(Boolean isSuccess, String message) {
		super();
		this.isSuccess = isSuccess;
		this.message = message;
	}
	
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "ResponseModel [isSuccess=" + isSuccess + ", message=" + message + "]";
	}

}
