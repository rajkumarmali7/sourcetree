package com.meter.survey.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meter.survey.Entity.Login;
import com.meter.survey.Service.LoginServiceImp;


@RestController
public class LoginController {
	
	@Autowired
	private LoginServiceImp loginServiceImp;
	
	
	@PostMapping("/signUp")
	public Login userSignUp(@RequestBody Login login)
	{
		loginServiceImp.signUp(login);
		return login;
	}
	
	@PostMapping("/login")

	public String login(@RequestParam String Username,
			@RequestParam String password,
			@RequestParam String mobileno){
		String str = loginServiceImp.login111(Username,password,mobileno);
		return str;
	}
	@GetMapping("/featch")
	public List<Login> userfeatch()
	{
		List<Login> UserList = loginServiceImp.featchAllData();
		return UserList;
	}
	
	

}
