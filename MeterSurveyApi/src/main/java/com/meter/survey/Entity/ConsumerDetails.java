package com.meter.survey.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pspcl_non_communication_Survey")
public class ConsumerDetails {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="row_id")
	private Long row_id;
	
	@Column(name="Consumer_Account_Number")
	private Long accountNo;
	
	@Column(name="Meter_Serial_Number")
    private String meterSerialNo;
	
	@Column(name="Sim_Ip")
	private String simIp;
	
	@Column(name="Reported_By")
	private String reportedBy;
	
	@Column(name="Meter_Status")
	private String meterstatus;
	
	@Column(name="Comment")
	private String comment;
	
	@Column(name="Image")
	private String imagePath;
	
	@Column(name="updated_on")
	private Date updated_on;
	
	@Column(name="Latitude")
	private String Latitude;
	
	@Column(name="Longitude")
	private String Longitude;
	
	public ConsumerDetails() {
		super();
	}

	public ConsumerDetails(Long row_id,Long accountNo, String meterSerialNo, String simIp, String reportedBy, String meterstatus,
			String comment, String imagePath,Date updated_on,String Latitude,String Longitude ) {
		super();
		this.row_id=row_id;
		this.accountNo = accountNo;
		this.meterSerialNo = meterSerialNo;
		this.simIp = simIp;
		this.reportedBy = reportedBy;
		this.meterstatus = meterstatus;
		this.comment = comment;
		this.imagePath = imagePath;
		this.updated_on=updated_on;
		this.Latitude=Latitude;
		this.Longitude=Longitude;
	}

	public Long getRow_id() {
		return row_id;
	}

	public void setRow_id(Long row_id) {
		this.row_id = row_id;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getMeterSerialNo() {
		return meterSerialNo;
	}

	public void setMeterSerialNo(String meterSerialNo) {
		this.meterSerialNo = meterSerialNo;
	}

	public String getSimIp() {
		return simIp;
	}

	public void setSimIp(String simIp) {
		this.simIp = simIp;
	}

	public String getReportedBy() {
		return reportedBy;
	}

	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}

	public String getMeterstatus() {
		return meterstatus;
	}

	public void setMeterstatus(String meterstatus) {
		this.meterstatus = meterstatus;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	

	public Date getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	@Override
	public String toString() {
		return "ConsumerDetails [row_id=" + row_id + ", accountNo=" + accountNo + ", meterSerialNo=" + meterSerialNo
				+ ", simIp=" + simIp + ", reportedBy=" + reportedBy + ", meterstatus=" + meterstatus + ", comment="
				+ comment + ", imagePath=" + imagePath + ", updated_on=" + updated_on + ", Latitude=" + Latitude
				+ ", Longitude=" + Longitude + "]";
	}

	
	
	
}
