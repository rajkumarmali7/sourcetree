package com.meter.survey.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meter.survey.Entity.ConsumerDetails;

@Repository
public interface ConsumerDetailsRepository extends CrudRepository<ConsumerDetails, Long> {

	
}
