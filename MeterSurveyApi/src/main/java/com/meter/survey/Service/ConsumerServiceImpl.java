package com.meter.survey.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meter.survey.Entity.Consumer;
import com.meter.survey.Entity.ConsumerDetails;
import com.meter.survey.Repository.ConsumerDetailsRepository;
import com.meter.survey.Repository.ConsumerRepository;

@Service
public class ConsumerServiceImpl implements ConsumerService{
	ConsumerDetails findConsumer;
	@Autowired
	private ConsumerDetailsRepository consumerdetailsrepository;
	@Autowired
	private ConsumerRepository consumerRepository;
	
	//read Operation
	
	@Override
	public Consumer findBYConsumer(Long ConsumerAccountNo) {
	    Consumer findConsumer=null;
		try {
		 findConsumer=consumerRepository.findById(ConsumerAccountNo).get();
		}catch(Exception e){
			System.out.println("\n ** Please enter valid Consumer account number **");
		}
		if(findConsumer!=null) {
			System.out.println(findConsumer.toString());
		}
		return findConsumer;
		
		
	}

	//save Operation
	@Override
	public ConsumerDetails saveOperation(ConsumerDetails consumerdetails) {
		// TODO Auto-generated method stub
		return consumerdetailsrepository.save(consumerdetails);
	}

}
