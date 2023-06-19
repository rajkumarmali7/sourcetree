package com.meter.survey.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Login")
@Data
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loginid;
//	@NotNull
	private String name;
	//@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
	@Column(nullable = false, unique = true, length = 45)
	private String username;
	@Column(nullable = false, length = 64)
	private String password;
	private String mobileno;
	private boolean status;
	
	
	

}
