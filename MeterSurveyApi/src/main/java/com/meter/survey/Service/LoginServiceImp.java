package com.meter.survey.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meter.survey.Entity.Login;
import com.meter.survey.Repository.LoginRepository;



@Service
public class LoginServiceImp {

	@Autowired
	private LoginRepository loginRepository;

	public void signUp(Login login) {

		loginRepository.save(login);

	}

	// public String login(Login login) {

	// Login login2 =
	// this.loginRepository.findByUsername(login.getUsername(),login.getPassword(),login.getMobileno(),login.isStatus());
//		Login login2 = this.loginRepository.findByUsernameAndPassword(login.getUsername(),login.getPassword());
//		//Login login3 = this.loginRepository.findByMobileNo(login.getMobileno());	
//
//		if (login2 == null) {
//			return "User login faild";
//		} else {
//			return "User login successful";
//		}
//
//	}

	public String login111(String username, String password, String mobileno) {
		Login login = loginRepository.findByUsernameAndPasswordmobile(username, password, mobileno);
		// Login login1 = loginRepository.findByUsername(username);
		if (login == null) {
			return "User login faild ";
		} else if (login.isStatus() != true) {
			return "please meet to the administrator "+login.isStatus();
		} else {
			return "User login successful " + login.isStatus();
		}

	}

	public List<Login> featchAllData() {
		List<Login> registeredList = new ArrayList<Login>();
		loginRepository.findAll().forEach(li -> registeredList.add(li));
		return registeredList;
	}

}
