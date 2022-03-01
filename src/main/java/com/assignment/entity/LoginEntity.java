package com.assignment.entity;

@Entity
public class LoginEntity {
	
	@userId
	private String userId;
	
	@accountNo
	private int accountNo;
	
	private String password;
	
	public String getUserId(){
		return userId;
	}
	
	public int getAccountNo(){
		return accountNo;
	
	}
	
	public String getPassword(){
		return password;
	}
	

	public void setId(String userId){
		this.userId = userId;
	}
	
	public void setAccountNo(int accountNo){
		this.accountNo = accountNo;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	
}
