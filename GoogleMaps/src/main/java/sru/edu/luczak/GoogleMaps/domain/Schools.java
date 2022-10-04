 package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.springframework.lang.NonNull;

import java.sql.Time;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

@Entity
 public class Schools {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NonNull
	private String schoolName;
	@NonNull
	private String type; 
	@NonNull
	private String schoolGrade; 
	@NonNull
	private int studentCount; 
	@NonNull
	private int schoolDays;
	@NonNull
	private String address;
	@NonNull
	private String city;
	@NonNull
	private String state;
	@NonNull
	private int zip;
	@NonNull
	private int phone;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "location_id")
	private LocationPoint location;
	@NonNull
	private boolean isActive;
	

	public void insertData(int id, String schoolName, String type, String schoolGrade, int studentCount,
			int schoolDays, String address, String city, String state, int zip, int phone,boolean isActive) {
		
		this.id = id; 
		this.schoolName = schoolName; 
		this.type = type; 
		this.schoolGrade = schoolGrade; 
		this.studentCount = studentCount; 
		this.schoolDays = schoolDays;
		this.address = address;
    	this.city = city;
    	this.state = state;
    	this.zip = zip;
    	this.phone = phone;
    	this.isActive = isActive;
	}
	
	public void setLocation(LocationPoint location)
	{
		this.location = location;
	}
	
	public LocationPoint getLocation()
	{
		return location;
	}
		public int getId() {
			return id; 
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSchoolName() {
			return schoolName;
		}
		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getSchoolGrade() {
			return schoolGrade;
		}
		public void setSchoolGrade(String schoolGrade) {
			this.schoolGrade = schoolGrade; 
		}
		public int getStudentCount() {
			return studentCount; 
		}
		public void setstudentCount(int studentCount) {
			this.studentCount = studentCount; 
		}

		public int getSchoolDays() {
			return schoolDays;
		}
		public void setschoolDays(int schoolDays) {
			this.schoolDays= schoolDays;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
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
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
			this.phone = phone;
		}
		public boolean getisActive() {
			return isActive;
		}
		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}
} 