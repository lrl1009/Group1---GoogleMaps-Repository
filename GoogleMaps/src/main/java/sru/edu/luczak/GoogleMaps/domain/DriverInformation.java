package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.lang.NonNull;

import java.util.Date;

import javax.persistence.Entity;


@Entity
public class DriverInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NonNull
	private int contractorId;
	@NonNull
	private String name;
	@NonNull
	private String type;
	@NonNull
	private Date approved;
	@NonNull
	private boolean isMeetAllReq;
	@NonNull
	private String address1;
	@NonNull
	private String address2;
	@NonNull
	private String city;
	@NonNull
	private String state;
	@NonNull
	private long zipCode;
	@NonNull
	private String phoneNumber;
	@NonNull
	private long driverId;
	@NonNull
	private String cellPhone;
	@NonNull
	private Date medClearDate;
	@NonNull
	private Date commDrvLicDate;
	@NonNull
	private Date motorVehRecDate;
	@NonNull
	private Date applicationDate;
	@NonNull
	private Date driverPhotoLicDate;
	@NonNull
	private Date cprFirstAidDate;
	@NonNull
	private Date tbTestDate;
	@NonNull
	private Date i9Date;
	@NonNull
	private Date act151ChildAbuseDate;
	@NonNull
	private Date act114FedCrimeDate;
	@NonNull
	private boolean isProvEmpCheck;
	@NonNull
	private Date act34PaStateDate;
	@NonNull
	private long locationPointId;
	@NonNull
	private boolean isActive;
	private String test;
	
	
	public void insertData(long id, Date act114FedCrimeDate, Date act151ChildAbuseDate, 
			Date act34PaStateDate, String address1, String address2, Date applicationDate, 
			Date approved, String cellPhone, String city, Date commDrvLicDate,
	        int contractorId, Date cprFirstAidDate, long driverId,
	        Date driverPhotoLicDate, Date i9Date, boolean isActive,
	        boolean isMeetAllReq, boolean isProvEmpCheck,
	        long locationPointId, Date medClearDate, Date motorVehRecDate, 
	        String name, String phoneNumber, String state, Date tbTestDate, 
	        String type, long zipCode) {
		
		this.id = id;
		this.act114FedCrimeDate = act114FedCrimeDate;
		this.act151ChildAbuseDate = act151ChildAbuseDate;
		this.act34PaStateDate = act34PaStateDate;
		this.address1 = address1;
		this.address2 = address2;
		this.applicationDate = applicationDate;
		this.approved = approved;
		this.cellPhone = cellPhone;
		this.city = city;
		this.commDrvLicDate = commDrvLicDate;
		this.contractorId = contractorId;
		this.cprFirstAidDate = cprFirstAidDate;
		this.driverId = driverId;
		this.driverPhotoLicDate = driverPhotoLicDate;
		this.i9Date = i9Date;
		this.isActive = isActive;
		this.isMeetAllReq = isMeetAllReq;
		this.isProvEmpCheck = isProvEmpCheck;
		this.locationPointId = locationPointId;
		this.medClearDate = medClearDate;
		this.motorVehRecDate = motorVehRecDate;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.state = state;
		this.tbTestDate = tbTestDate;
		this.type = type;
		this.zipCode = zipCode;
	}
	
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getContractorId() {
		return contractorId;
	}
	public void setContractorId(int contractorId) {
		this.contractorId = contractorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getApproved() {
		return approved;
	}
	public void setApproved(Date approved) {
		this.approved = approved;
	}
	public boolean isMeetAllReq() {
		return isMeetAllReq;
	}
	public void setMeetAllReq(boolean isMeetAllReq) {
		this.isMeetAllReq = isMeetAllReq;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getDriverId() {
		return driverId;
	}
	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public Date getMedClearDate() {
		return medClearDate;
	}
	public void setMedClearDate(Date medClearDate) {
		this.medClearDate = medClearDate;
	}
	public Date getCommDrvLicDate() {
		return commDrvLicDate;
	}
	public void setCommDrvLicDate(Date commDrvLicDate) {
		this.commDrvLicDate = commDrvLicDate;
	}
	public Date getMotorVehRecDate() {
		return motorVehRecDate;
	}
	public void setMotorVehRecDate(Date motorVehRecDate) {
		this.motorVehRecDate = motorVehRecDate;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public Date getDriverPhotoLicDate() {
		return driverPhotoLicDate;
	}
	public void setDriverPhotoLicDate(Date driverPhotoLicDate) {
		this.driverPhotoLicDate = driverPhotoLicDate;
	}
	public Date getCprFirstAidDate() {
		return cprFirstAidDate;
	}
	public void setCprFirstAidDate(Date cprFirstAidDate) {
		this.cprFirstAidDate = cprFirstAidDate;
	}
	public Date getTbTestDate() {
		return tbTestDate;
	}
	public void setTbTestDate(Date tbTestDate) {
		this.tbTestDate = tbTestDate;
	}
	public Date getI9Date() {
		return i9Date;
	}
	public void setI9Date(Date i9Date) {
		this.i9Date = i9Date;
	}
	public Date getAct151ChildAbuseDate() {
		return act151ChildAbuseDate;
	}
	public void setAct151ChildAbuseDate(Date act151ChildAbuseDate) {
		this.act151ChildAbuseDate = act151ChildAbuseDate;
	}
	public Date getAct114FedCrimeDate() {
		return act114FedCrimeDate;
	}
	public void setAct114FedCrimeDate(Date act114FedCrimeDate) {
		this.act114FedCrimeDate = act114FedCrimeDate;
	}
	public boolean isProvEmpCheck() {
		return isProvEmpCheck;
	}
	public void setProvEmpCheck(boolean isProvEmpCheck) {
		this.isProvEmpCheck = isProvEmpCheck;
	}
	public Date getAct34PaStateDate() {
		return act34PaStateDate;
	}
	public void setAct34PaStateDate(Date act34PaStateDate) {
		this.act34PaStateDate = act34PaStateDate;
	}
	public long getLocationPointId() {
		return locationPointId;
	}
	public void setLocationPointId(long locationPointId) {
		this.locationPointId = locationPointId;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}

