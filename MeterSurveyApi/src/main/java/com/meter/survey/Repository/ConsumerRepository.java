package com.meter.survey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meter.survey.Entity.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long>{
	

}
