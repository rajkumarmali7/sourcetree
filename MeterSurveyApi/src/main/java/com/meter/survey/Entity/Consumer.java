package com.meter.survey.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Consumer {
	
	@Id
	@Column(name="Consumer_Account_Number")
	private Long accountNo;
	
	@Column(name="Meter_Serial_Number")
    private String meterSerialNo;
	
	@Column(name="Sim_Ip")
	private String simIp;
	
	@Column(name="Reported_By")
	private String reportedBy;
	
}
