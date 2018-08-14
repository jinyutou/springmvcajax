package com.bean;

public class UserInfo {
	private Integer userId;
	private String userName;
	private Integer Age;
	public UserInfo(Integer userId, String userName, Integer age) {
		super();
		this.userId = userId;
		this.userName = userName;
		Age = age;
	}
	public UserInfo() {
		super();
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName
				+ ", Age=" + Age + "]";
	}
	
}
