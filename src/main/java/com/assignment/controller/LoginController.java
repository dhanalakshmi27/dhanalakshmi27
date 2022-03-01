package com.assignment.controller;

import com.assignment.common.APIResponse;
import com.assignment.dto.LoginRequestDTO;
import com.assignment.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@PostMapping("/login")
	public ResponseEntity<APIResponse> login(@RequestBody LoginRequestDto dto){
		
		APIResponse response = loginService.login(dto);
		
		return ResponseEntity.status(response.getStatus()).body(response);
		
		
	}
}
