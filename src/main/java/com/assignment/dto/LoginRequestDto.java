package com.assignment.dto;

public class LoginRequestDto {


	    private String userId;
	    private int accountNo;
	    private String password;

	    public String getUserId() {
	        return userId;
	    }

	    public void setUserId(String userId) {
	        this.userId = userId;
	    }

	    public int getAccountNo(){
			return accountNo;
		
		}
	    
	    public void setAccountNo(int accountNo){
			this.accountNo = accountNo;
		}
	    	    
	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
}
