package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.lang.NonNull;

import java.util.Date;

import javax.persistence.Entity;

//This table is designed to hold all of the information for the Students that are going to be linked to PickupPoints
@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studId;
	@NonNull

	private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String parentFirstName;
    @NonNull
    private String parentLastName;
    
/*   
    @NonNull
    private String pickupPointName;
    
    @NonNull
    private String dropOffPointName;
*/    
    @NonNull
    private String phoneNum;
    @NonNull
    private String emergencyPhoneNum;
    @NonNull
    private String cellPhoneNum;
    @NonNull
    private String state;
    @NonNull
    private String city;
    @NonNull
    private long zipCode;
    @NonNull
    private String address;
    @NonNull
    private Date bDate;
    @NonNull
    private String gender;
    @NonNull
    private float grade;
    @NonNull
    private String schoolName;
    
    
    
    //method for inserting information directly into mySQL during the main boot up
    /*Excel Order
     * String lastName, String firstName, String address, String city, String state, String zipCode,
    		Date bDate, String phoneNum, String cellPhoneNum, String emergencyPhoneNum, String parentLastName, 
    		String parentFirstName, String grade, String gender,  String schoolName
     */
    public void insertData(int studId, String firstName, String address, Date bDate, String cellPhoneNum, String city, String emergencyPhoneNum,
    		String gender, float grade, String lastName, String parentFirstName, String parentLastName, 
    		String phoneNum, String schoolName, String state, long zipCode) {
    	
    	this.cellPhoneNum = cellPhoneNum;
    	this.city = city;
//    	this.dropOffPoint = dropOffPoint;
    	this.emergencyPhoneNum = emergencyPhoneNum;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.parentFirstName = parentFirstName;
    	this.parentLastName = parentLastName;
    	this.phoneNum = phoneNum;
//    	this.pickupPointName = pickupPointName;
    	this.state = state;
    	this.studId = studId;
    	this.zipCode = zipCode;
    	this.address = address;
    	this.bDate = bDate;
    	this.gender = gender;
    	this.grade = grade;
    	this.schoolName = schoolName;
    }
   
	public int getStudId() {
		return studId;
	}
	
	public void setStudId(int studId) {
		this.studId = studId;
	}
/* 
		public String getPickupPointName() 
	{
		return pickupPointName;
	}
	
	public void setPickupPointName(String pickupPointName) 
	{
		this.pickupPointName = pickupPointName;
	}
	
	public String getDropOffPoint() 
	{
		return dropOffPoint;
	}
	
	public void setDropOffPoint(String dropOffPoint) 
	{
		this.dropOffPoint = dropOffPoint;
	}
	
*/
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	


	public String getParentFirstName() {
		return parentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	public String getParentLastName() {
		return parentLastName;
	}

	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmergencyPhoneNum() {
		return emergencyPhoneNum;
	}

	public void setEmergencyPhoneNum(String emergencyPhoneNum) {
		this.emergencyPhoneNum = emergencyPhoneNum;
	}

	public String getCellPhoneNum() {
		return cellPhoneNum;
	}

	public void setCellPhoneNum(String cellPhoneNum) {
		this.cellPhoneNum = cellPhoneNum;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}



}
