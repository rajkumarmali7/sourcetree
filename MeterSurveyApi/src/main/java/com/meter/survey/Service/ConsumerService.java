package com.meter.survey.Service;


import com.meter.survey.Entity.Consumer;
import com.meter.survey.Entity.ConsumerDetails;

public interface ConsumerService {
	
	//fetch Operation
	Consumer findBYConsumer(Long accountNo);
	
	//save operation
	ConsumerDetails saveOperation(ConsumerDetails consumerdetails);

}
