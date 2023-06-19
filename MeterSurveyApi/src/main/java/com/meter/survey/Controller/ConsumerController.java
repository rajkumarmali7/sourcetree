package com.meter.survey.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meter.survey.Entity.Consumer;
import com.meter.survey.Entity.ConsumerDetails;
import com.meter.survey.Service.ConsumerService;

@RequestMapping("/survey")
@RestController
public class ConsumerController {
	
	@Autowired
	private ConsumerService consumerservice;
	
	@PostMapping("/savssse")
	public ConsumerDetails saveOperation(@RequestBody ConsumerDetails consumerdetails) {
		return consumerservice.saveOperation(consumerdetails);
		
	}
	
	@GetMapping("consumerfetch/{accountNo}")
	public Consumer findBYConsumers(@PathVariable("accountNo")Long accountNo) {
		
		return consumerservice.findBYConsumer(accountNo);
		
	}
	

}
