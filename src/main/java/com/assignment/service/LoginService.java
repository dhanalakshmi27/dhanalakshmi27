package com.assignment.service;

import com.assignment.common.APIResponse;
import com.assignment.dto.LoginRequestDTO;
import com.assignment.entity.LoginEntity;
import com.assignment.repo.LoginRepository;
import com.assignment.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
	
	@Autowired
	private JwtUtils jwtUtils;
	 
	public APIResponse login(LoginRequestdto dto){
		LoginEntity entity = new LoginEntity();
		entity.setUserId(dto.getUserId());
		entity.setAccountNo(dto.getAccountNo);
		entity.setPassword(dto.getpassword);
		entity = repo.save(entity);
		
		if(entity == null){
            apiResponse.setData("User login failed");
            return apiResponse;
        }
		
		//generate jwt
		
		String token = jwtUtils.generateJwt(entity);
		
		Map<String,Object> jwtToken = new HashMap<>();
		jwtToken.put("accessToken",token);
		
		apiResponse.setData(jwtToken);
		return apiResponse; 
	}
}
