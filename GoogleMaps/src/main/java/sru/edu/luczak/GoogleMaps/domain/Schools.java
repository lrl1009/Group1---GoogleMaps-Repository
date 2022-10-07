 package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.springframework.lang.NonNull;

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
	private int startHour; 
	@NonNull 
	private int startMin; 
	@NonNull 
	private String startAmPm; 
	@NonNull 
	private int endHour; 
	@NonNull
	private int endMin; 
	@NonNull
	private String endAmPm;
	@NonNull
	private Date startDate; 
	@NonNull
	private Date endDate; 
	
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
	private String phone;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "location_id")
	private LocationPoint location;
	@NonNull
	private boolean isActive;
	

	public void insertData(int id, String schoolName, String type, String schoolGrade, int studentCount,
			int startHour, int startMin, String startAmPm, int endHour, int endMin, String endAmPm, 
			int schoolDays, Date startDate, Date endDate, String phone, int zip, String city, String state, boolean isActive, String address) {
		
		this.id = id; 
		this.schoolName = schoolName; 
		this.type = type; 
		this.schoolGrade = schoolGrade; 
		this.studentCount = studentCount; 
		this.startHour = startHour;
		this.startMin = startMin; 
		this.startAmPm = startAmPm; 
		this.endHour = endHour; 
		this.endMin = endMin; 
		this.endAmPm = endAmPm; 
		this.schoolDays = schoolDays;
		this.startDate = startDate; 
		this.endDate = endDate;
		this.phone = phone;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.isActive = isActive;
		this.address = address;
	}
	
	public void insertTestData(int id, String schoolName, String type, String schoolGrade, int studentCount,
			int schoolDays, String address, String phone, int zip, String city, String state, int locationId, boolean isActive) {
		
		this.id = id; 
		this.schoolName = schoolName; 
		this.type = type; 
		this.schoolGrade = schoolGrade; 
		this.studentCount = studentCount; 
		this.schoolDays = schoolDays;
		this.phone = phone;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.isActive = isActive;
		this.address = address;
//		this.location_Id = locationId;
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
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public boolean getisActive() {
			return isActive;
		}
		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}


		public int getStartHour() {
			return startHour;
		}


		public void setStartHour(int startHour) {
			this.startHour = startHour;
		}


		public int getStartMin() {
			return startMin;
		}


		public void setStartMin(int startMin) {
			this.startMin = startMin;
		}


		public String getStartAmPm() {
			return startAmPm;
		}


		public void setStartAmPm(String startAmPm) {
			this.startAmPm = startAmPm;
		}


		public int getEndHour() {
			return endHour;
		}


		public void setEndHour(int endHour) {
			this.endHour = endHour;
		}


		public int getEndMin() {
			return endMin;
		}


		public void setEndMin(int endMin) {
			this.endMin = endMin;
		}


		public String getEndAmPm() {
			return endAmPm;
		}


		public void setEndAmPm(String endAmPm) {
			this.endAmPm = endAmPm;
		}


		public Date getStartDate() {
			return startDate;
		}


		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}


		public Date getEndDate() {
			return endDate;
		}


		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}


		public boolean isActive() {
			return isActive;
		}


		public void setStudentCount(int studentCount) {
			this.studentCount = studentCount;
		}


		public void setSchoolDays(int schoolDays) {
			this.schoolDays = schoolDays;
		}
} 