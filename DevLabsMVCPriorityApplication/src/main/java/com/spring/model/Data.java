package com.spring.model;

public class Data {
	private String message;
	private String dateTime;
	private String username;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	@Override
	public String toString() {
		return "Data [message=" + message + ", dateTime=" + dateTime + "]";
	}

}
