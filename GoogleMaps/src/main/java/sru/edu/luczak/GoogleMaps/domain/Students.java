package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.lang.NonNull;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

//This table is designed to hold all of the information for the Students that are going to be linked to PickupPoints
@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NonNull private int studId;
	@NonNull private boolean graduated;
	@NonNull private String firstName;
	@NonNull private String midName;
    @NonNull private String lastName;
    @NonNull private String suffix;
    @NonNull private float grade;
    @NonNull private String address1;
    @Column(columnDefinition = "TEXT")
    @NonNull private String address2;
    @NonNull private String city;
    @NonNull private String state;
    @NonNull private long zipCode;
    @NonNull private String gender; 
    @NonNull private Date birthDate; 
    @NonNull private String phoneNum;
    @NonNull private String cellPhoneNum;    
    @NonNull private String emergencyPhoneNum;
    @NonNull private String parentName;
    @NonNull private String schoolName;
    @NonNull private Date enter;
    @NonNull private boolean isEnter;
    @NonNull private Date Withdrawl;
    @NonNull private boolean isWithdrawl;
    @NonNull private boolean hazardousRoad;
    @NonNull private String travelMode;
    @NonNull private String driverNote;
    @NonNull private String misc;
    @NonNull private String journal;
    @NonNull private String medical;
    @NonNull private boolean isCustody;
    @Column(columnDefinition = "TEXT")
    private String alt1Name;
    @Column(columnDefinition = "TEXT")
    private String alt1Relationship;
    @Column(columnDefinition = "TEXT")
    private String alt1Address1;
    @Column(columnDefinition = "TEXT")
    private String alt1Address2;
    @Column(columnDefinition = "TEXT")
    private String alt1City;
    @Column(columnDefinition = "TEXT")
    private String alt1State;
    @Column(columnDefinition = "TEXT") private String alt1ZipCode;
    @Column(columnDefinition = "TEXT") private String alt1Phone;
    @Column(columnDefinition = "TEXT") private String alt1CellPhone;
    @Column(columnDefinition = "TEXT") private String alt2Name;
    @Column(columnDefinition = "TEXT") private String alt2Relationship;
    @Column(columnDefinition = "TEXT") private String alt2Address1;
    @Column(columnDefinition = "TEXT") private String alt2Address2;
    @Column(columnDefinition = "TEXT") private String alt2City;
    @Column(columnDefinition = "TEXT") private String alt2State;
    @Column(columnDefinition = "TEXT") private String alt2ZipCode;
    @Column(columnDefinition = "TEXT") private String alt2Phone;
    @Column(columnDefinition = "TEXT") private String alt2CellPhone;
    @Column(columnDefinition = "TEXT") private String alt3Name;
    @Column(columnDefinition = "TEXT") private String alt3Relationship;
    @Column(columnDefinition = "TEXT") private String alt3Address1;
    @Column(columnDefinition = "TEXT") private String alt3Address2;
    @Column(columnDefinition = "TEXT") private String alt3City;
    @Column(columnDefinition = "TEXT") private String alt3State;
    @Column(columnDefinition = "TEXT") private String alt3ZipCode;
    @Column(columnDefinition = "TEXT") private String alt3Phone;
    @Column(columnDefinition = "TEXT") private String alt3CellPhone;
    @NonNull private String studentType1;
    @NonNull private String studentType2;
    @NonNull private String studentType3;
    @NonNull private String pickUpLocation;
    @NonNull private int pickUpStopNo;
    @NonNull private String busRoute1;
    @NonNull private LocalTime pickUpTime;
    @NonNull private String deliveryLocation;
    @NonNull private int deliveryStopNo;
    @NonNull private String busRoute2;
    @NonNull private LocalTime deliveryTime;
    @NonNull private String monPickUpLocation;
    @NonNull private String monPickUpStopNo;
    @NonNull private String monBusRoute1;
    @NonNull private LocalTime monPickUpTime;
    @NonNull private String monDeliveryLocation;
    @NonNull private String monDeliveryStopNo;
    @NonNull private String monBusRoute2;
    @NonNull private LocalTime monDeliveryTime;
    @NonNull private String tuePickUpLocation;
    @NonNull private String tuePickUpStopNo;
    @NonNull private String tueBusRoute1;
    @NonNull private LocalTime tuePickUpTime;
    @NonNull private String tueDeliveryLocation;
    @NonNull private String tueDeliveryStopNo;
    @NonNull private String tueBusRoute2;
    @NonNull private LocalTime tueDeliveryTime;
    @NonNull private String wedPickUpLocation;
    @NonNull private String wedPickUpStopNo;
    @NonNull private String wedBusRoute1;
    @NonNull private LocalTime wedPickUpTime;
    @NonNull private String wedDeliveryLocation;
    @NonNull private String wedDeliveryStopNo;
    @NonNull private String wedBusRoute2;
    @NonNull private LocalTime wedDeliveryTime;
    @NonNull private String thuPickUpLocation;
    @NonNull private String thuPickUpStopNo;
    @NonNull private String thuBusRoute1;
    @NonNull private LocalTime thuPickUpTime;
    @NonNull private String thuDeliveryLocation;
    @NonNull private String thuDeliveryStopNo;
    @NonNull private String thuBusRoute2;
    @NonNull private LocalTime thuDeliveryTime;
    @NonNull private String friPickUpLocation;
    @NonNull private String friPickUpStopNo;
    @NonNull private String friBusRoute1;
    @NonNull private LocalTime friPickUpTime;
    @NonNull private String friDeliveryLocation;
    @NonNull private String friDeliveryStopNo;
    @NonNull private String friBusRoute2;
    @NonNull private LocalTime friDeliveryTime;
    @NonNull private float defaultPickOdometer;
    @NonNull private float monPickOdometer;
    @NonNull private float tuePickOdometer;
    @NonNull private float wedPickOdometer;
    @NonNull private float thuPickOdometer;
    @NonNull private float friPickOdometer;
    @NonNull private float defaultDeliverOdometer;
    @NonNull private float monDeliverOdometer;
    @NonNull private float tueDeliverOdometer;
    @NonNull private float wedDeliverOdometer;
    @NonNull private float thuDeliverOdometer;
    @NonNull private float friDeliverOdometer;
    @Column(columnDefinition = "TEXT") private String altSchool1;
    @Column(columnDefinition = "TEXT") private String altSchool1PickUpLocation;
    @Column(columnDefinition = "TEXT") private String altSchool1PickUpStopNo;
    @Column(columnDefinition = "TEXT") private String altSchool1BusRoute1;
    @Column(columnDefinition = "TEXT") private LocalTime altSchool1PickUpTime;
    private float altSchool1PickOdometer;
    private boolean altSchool1PickupIsSchool;
    @Column(columnDefinition = "TEXT") private String altSchool1DeliveryLocation;
    @Column(columnDefinition = "TEXT") private String altSchool1DeliveryStopNo;
    @Column(columnDefinition = "TEXT") private String altSchool1BusRoute2;
    @Column(columnDefinition = "TEXT") private LocalTime altSchool1DeliveryTime;
    @NonNull private float altSchool1DeliverOdometer;
    @NonNull private boolean altSchool1DeliveryIsSchool;
    @NonNull private int pickDeliverTabValue;
    @NonNull private int altAddressTabValue;
    @NonNull private boolean hasRolledOver;
    @NonNull private Date dateOfRollover;
    @NonNull private boolean isActive;


    public void insertData(int id, int studId ) {
 
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public boolean isGraduated() {
		return graduated;
	}


	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMidName() {
		return midName;
	}


	public void setMidName(String midName) {
		this.midName = midName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getSuffix() {
		return suffix;
	}


	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}


	public float getGrade() {
		return grade;
	}


	public void setGrade(float grade) {
		this.grade = grade;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getCellPhoneNum() {
		return cellPhoneNum;
	}


	public void setCellPhoneNum(String cellPhoneNum) {
		this.cellPhoneNum = cellPhoneNum;
	}


	public String getEmergencyPhoneNum() {
		return emergencyPhoneNum;
	}


	public void setEmergencyPhoneNum(String emergencyPhoneNum) {
		this.emergencyPhoneNum = emergencyPhoneNum;
	}


	public String getParentName() {
		return parentName;
	}


	public void setParentName(String parentName) {
		this.parentName = parentName;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public Date getEnter() {
		return enter;
	}


	public void setEnter(Date enter) {
		this.enter = enter;
	}


	public boolean isEnter() {
		return isEnter;
	}


	public void setEnter(boolean isEnter) {
		this.isEnter = isEnter;
	}


	public Date getWithdrawl() {
		return Withdrawl;
	}


	public void setWithdrawl(Date withdrawl) {
		Withdrawl = withdrawl;
	}


	public boolean isWithdrawl() {
		return isWithdrawl;
	}


	public void setWithdrawl(boolean isWithdrawl) {
		this.isWithdrawl = isWithdrawl;
	}


	public boolean isHazardousRoad() {
		return hazardousRoad;
	}


	public void setHazardousRoad(boolean hazardousRoad) {
		this.hazardousRoad = hazardousRoad;
	}


	public String getTravelMode() {
		return travelMode;
	}


	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}


	public String getDriverNote() {
		return driverNote;
	}


	public void setDriverNote(String driverNote) {
		this.driverNote = driverNote;
	}


	public String getMisc() {
		return misc;
	}


	public void setMisc(String misc) {
		this.misc = misc;
	}


	public String getJournal() {
		return journal;
	}


	public void setJournal(String journal) {
		this.journal = journal;
	}


	public String getMedical() {
		return medical;
	}


	public void setMedical(String medical) {
		this.medical = medical;
	}


	public boolean isCustody() {
		return isCustody;
	}


	public void setCustody(boolean isCustody) {
		this.isCustody = isCustody;
	}


	public String getAlt1Name() {
		return alt1Name;
	}


	public void setAlt1Name(String alt1Name) {
		this.alt1Name = alt1Name;
	}


	public String getAlt1Relationship() {
		return alt1Relationship;
	}


	public void setAlt1Relationship(String alt1Relationship) {
		this.alt1Relationship = alt1Relationship;
	}


	public String getAlt1Address1() {
		return alt1Address1;
	}


	public void setAlt1Address1(String alt1Address1) {
		this.alt1Address1 = alt1Address1;
	}


	public String getAlt1Address2() {
		return alt1Address2;
	}


	public void setAlt1Address2(String alt1Address2) {
		this.alt1Address2 = alt1Address2;
	}


	public String getAlt1City() {
		return alt1City;
	}


	public void setAlt1City(String alt1City) {
		this.alt1City = alt1City;
	}


	public String getAlt1State() {
		return alt1State;
	}


	public void setAlt1State(String alt1State) {
		this.alt1State = alt1State;
	}


	public String getAlt1ZipCode() {
		return alt1ZipCode;
	}


	public void setAlt1ZipCode(String alt1ZipCode) {
		this.alt1ZipCode = alt1ZipCode;
	}


	public String getAlt1Phone() {
		return alt1Phone;
	}


	public void setAlt1Phone(String alt1Phone) {
		this.alt1Phone = alt1Phone;
	}


	public String getAlt1CellPhone() {
		return alt1CellPhone;
	}


	public void setAlt1CellPhone(String alt1CellPhone) {
		this.alt1CellPhone = alt1CellPhone;
	}


	public String getAlt2Name() {
		return alt2Name;
	}


	public void setAlt2Name(String alt2Name) {
		this.alt2Name = alt2Name;
	}


	public String getAlt2Relationship() {
		return alt2Relationship;
	}


	public void setAlt2Relationship(String alt2Relationship) {
		this.alt2Relationship = alt2Relationship;
	}


	public String getAlt2Address1() {
		return alt2Address1;
	}


	public void setAlt2Address1(String alt2Address1) {
		this.alt2Address1 = alt2Address1;
	}


	public String getAlt2Address2() {
		return alt2Address2;
	}


	public void setAlt2Address2(String alt2Address2) {
		this.alt2Address2 = alt2Address2;
	}


	public String getAlt2City() {
		return alt2City;
	}


	public void setAlt2City(String alt2City) {
		this.alt2City = alt2City;
	}


	public String getAlt2State() {
		return alt2State;
	}


	public void setAlt2State(String alt2State) {
		this.alt2State = alt2State;
	}


	public String getAlt2ZipCode() {
		return alt2ZipCode;
	}


	public void setAlt2ZipCode(String alt2ZipCode) {
		this.alt2ZipCode = alt2ZipCode;
	}


	public String getAlt2Phone() {
		return alt2Phone;
	}


	public void setAlt2Phone(String alt2Phone) {
		this.alt2Phone = alt2Phone;
	}


	public String getAlt2CellPhone() {
		return alt2CellPhone;
	}


	public void setAlt2CellPhone(String alt2CellPhone) {
		this.alt2CellPhone = alt2CellPhone;
	}


	public String getAlt3Name() {
		return alt3Name;
	}


	public void setAlt3Name(String alt3Name) {
		this.alt3Name = alt3Name;
	}


	public String getAlt3Relationship() {
		return alt3Relationship;
	}


	public void setAlt3Relationship(String alt3Relationship) {
		this.alt3Relationship = alt3Relationship;
	}


	public String getAlt3Address1() {
		return alt3Address1;
	}


	public void setAlt3Address1(String alt3Address1) {
		this.alt3Address1 = alt3Address1;
	}


	public String getAlt3Address2() {
		return alt3Address2;
	}


	public void setAlt3Address2(String alt3Address2) {
		this.alt3Address2 = alt3Address2;
	}


	public String getAlt3City() {
		return alt3City;
	}


	public void setAlt3City(String alt3City) {
		this.alt3City = alt3City;
	}


	public String getAlt3State() {
		return alt3State;
	}


	public void setAlt3State(String alt3State) {
		this.alt3State = alt3State;
	}


	public String getAlt3ZipCode() {
		return alt3ZipCode;
	}


	public void setAlt3ZipCode(String alt3ZipCode) {
		this.alt3ZipCode = alt3ZipCode;
	}


	public String getAlt3Phone() {
		return alt3Phone;
	}


	public void setAlt3Phone(String alt3Phone) {
		this.alt3Phone = alt3Phone;
	}


	public String getAlt3CellPhone() {
		return alt3CellPhone;
	}


	public void setAlt3CellPhone(String alt3CellPhone) {
		this.alt3CellPhone = alt3CellPhone;
	}


	public String getStudentType1() {
		return studentType1;
	}


	public void setStudentType1(String studentType1) {
		this.studentType1 = studentType1;
	}


	public String getStudentType2() {
		return studentType2;
	}


	public void setStudentType2(String studentType2) {
		this.studentType2 = studentType2;
	}


	public String getStudentType3() {
		return studentType3;
	}


	public void setStudentType3(String studentType3) {
		this.studentType3 = studentType3;
	}


	public String getPickUpLocation() {
		return pickUpLocation;
	}


	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}


	public int getPickUpStopNo() {
		return pickUpStopNo;
	}


	public void setPickUpStopNo(int pickUpStopNo) {
		this.pickUpStopNo = pickUpStopNo;
	}


	public String getBusRoute1() {
		return busRoute1;
	}


	public void setBusRoute1(String busRoute1) {
		this.busRoute1 = busRoute1;
	}


	public LocalTime getPickUpTime() {
		return pickUpTime;
	}


	public void setPickUpTime(LocalTime pickUpTime) {
		this.pickUpTime = pickUpTime;
	}


	public String getDeliveryLocation() {
		return deliveryLocation;
	}


	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}


	public int getDeliveryStopNo() {
		return deliveryStopNo;
	}


	public void setDeliveryStopNo(int deliveryStopNo) {
		this.deliveryStopNo = deliveryStopNo;
	}


	public String getBusRoute2() {
		return busRoute2;
	}


	public void setBusRoute2(String busRoute2) {
		this.busRoute2 = busRoute2;
	}


	public LocalTime getDeliveryTime() {
		return deliveryTime;
	}


	public void setDeliveryTime(LocalTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}


	public String getMonPickUpLocation() {
		return monPickUpLocation;
	}


	public void setMonPickUpLocation(String monPickUpLocation) {
		this.monPickUpLocation = monPickUpLocation;
	}


	public String getMonPickUpStopNo() {
		return monPickUpStopNo;
	}


	public void setMonPickUpStopNo(String monPickUpStopNo) {
		this.monPickUpStopNo = monPickUpStopNo;
	}


	public String getMonBusRoute1() {
		return monBusRoute1;
	}


	public void setMonBusRoute1(String monBusRoute1) {
		this.monBusRoute1 = monBusRoute1;
	}


	public LocalTime getMonPickUpTime() {
		return monPickUpTime;
	}


	public void setMonPickUpTime(LocalTime monPickUpTime) {
		this.monPickUpTime = monPickUpTime;
	}


	public String getMonDeliveryLocation() {
		return monDeliveryLocation;
	}


	public void setMonDeliveryLocation(String monDeliveryLocation) {
		this.monDeliveryLocation = monDeliveryLocation;
	}


	public String getMonDeliveryStopNo() {
		return monDeliveryStopNo;
	}


	public void setMonDeliveryStopNo(String monDeliveryStopNo) {
		this.monDeliveryStopNo = monDeliveryStopNo;
	}


	public String getMonBusRoute2() {
		return monBusRoute2;
	}


	public void setMonBusRoute2(String monBusRoute2) {
		this.monBusRoute2 = monBusRoute2;
	}


	public LocalTime getMonDeliveryTime() {
		return monDeliveryTime;
	}


	public void setMonDeliveryTime(LocalTime monDeliveryTime) {
		this.monDeliveryTime = monDeliveryTime;
	}


	public String getTuePickUpLocation() {
		return tuePickUpLocation;
	}


	public void setTuePickUpLocation(String tuePickUpLocation) {
		this.tuePickUpLocation = tuePickUpLocation;
	}


	public String getTuePickUpStopNo() {
		return tuePickUpStopNo;
	}


	public void setTuePickUpStopNo(String tuePickUpStopNo) {
		this.tuePickUpStopNo = tuePickUpStopNo;
	}


	public String getTueBusRoute1() {
		return tueBusRoute1;
	}


	public void setTueBusRoute1(String tueBusRoute1) {
		this.tueBusRoute1 = tueBusRoute1;
	}


	public LocalTime getTuePickUpTime() {
		return tuePickUpTime;
	}


	public void setTuePickUpTime(LocalTime tuePickUpTime) {
		this.tuePickUpTime = tuePickUpTime;
	}


	public String getTueDeliveryLocation() {
		return tueDeliveryLocation;
	}


	public void setTueDeliveryLocation(String tueDeliveryLocation) {
		this.tueDeliveryLocation = tueDeliveryLocation;
	}


	public String getTueDeliveryStopNo() {
		return tueDeliveryStopNo;
	}


	public void setTueDeliveryStopNo(String tueDeliveryStopNo) {
		this.tueDeliveryStopNo = tueDeliveryStopNo;
	}


	public String getTueBusRoute2() {
		return tueBusRoute2;
	}


	public void setTueBusRoute2(String tueBusRoute2) {
		this.tueBusRoute2 = tueBusRoute2;
	}


	public LocalTime getTueDeliveryTime() {
		return tueDeliveryTime;
	}


	public void setTueDeliveryTime(LocalTime tueDeliveryTime) {
		this.tueDeliveryTime = tueDeliveryTime;
	}


	public String getWedPickUpLocation() {
		return wedPickUpLocation;
	}


	public void setWedPickUpLocation(String wedPickUpLocation) {
		this.wedPickUpLocation = wedPickUpLocation;
	}


	public String getWedPickUpStopNo() {
		return wedPickUpStopNo;
	}


	public void setWedPickUpStopNo(String wedPickUpStopNo) {
		this.wedPickUpStopNo = wedPickUpStopNo;
	}


	public String getWedBusRoute1() {
		return wedBusRoute1;
	}


	public void setWedBusRoute1(String wedBusRoute1) {
		this.wedBusRoute1 = wedBusRoute1;
	}


	public LocalTime getWedPickUpTime() {
		return wedPickUpTime;
	}


	public void setWedPickUpTime(LocalTime wedPickUpTime) {
		this.wedPickUpTime = wedPickUpTime;
	}


	public String getWedDeliveryLocation() {
		return wedDeliveryLocation;
	}


	public void setWedDeliveryLocation(String wedDeliveryLocation) {
		this.wedDeliveryLocation = wedDeliveryLocation;
	}


	public String getWedDeliveryStopNo() {
		return wedDeliveryStopNo;
	}


	public void setWedDeliveryStopNo(String wedDeliveryStopNo) {
		this.wedDeliveryStopNo = wedDeliveryStopNo;
	}


	public String getWedBusRoute2() {
		return wedBusRoute2;
	}


	public void setWedBusRoute2(String wedBusRoute2) {
		this.wedBusRoute2 = wedBusRoute2;
	}


	public LocalTime getWedDeliveryTime() {
		return wedDeliveryTime;
	}


	public void setWedDeliveryTime(LocalTime wedDeliveryTime) {
		this.wedDeliveryTime = wedDeliveryTime;
	}


	public String getThuPickUpLocation() {
		return thuPickUpLocation;
	}


	public void setThuPickUpLocation(String thuPickUpLocation) {
		this.thuPickUpLocation = thuPickUpLocation;
	}


	public String getThuPickUpStopNo() {
		return thuPickUpStopNo;
	}


	public void setThuPickUpStopNo(String thuPickUpStopNo) {
		this.thuPickUpStopNo = thuPickUpStopNo;
	}


	public String getThuBusRoute1() {
		return thuBusRoute1;
	}


	public void setThuBusRoute1(String thuBusRoute1) {
		this.thuBusRoute1 = thuBusRoute1;
	}


	public LocalTime getThuPickUpTime() {
		return thuPickUpTime;
	}


	public void setThuPickUpTime(LocalTime thuPickUpTime) {
		this.thuPickUpTime = thuPickUpTime;
	}


	public String getThuDeliveryLocation() {
		return thuDeliveryLocation;
	}


	public void setThuDeliveryLocation(String thuDeliveryLocation) {
		this.thuDeliveryLocation = thuDeliveryLocation;
	}


	public String getThuDeliveryStopNo() {
		return thuDeliveryStopNo;
	}


	public void setThuDeliveryStopNo(String thuDeliveryStopNo) {
		this.thuDeliveryStopNo = thuDeliveryStopNo;
	}


	public String getThuBusRoute2() {
		return thuBusRoute2;
	}


	public void setThuBusRoute2(String thuBusRoute2) {
		this.thuBusRoute2 = thuBusRoute2;
	}


	public LocalTime getThuDeliveryTime() {
		return thuDeliveryTime;
	}


	public void setThuDeliveryTime(LocalTime thuDeliveryTime) {
		this.thuDeliveryTime = thuDeliveryTime;
	}


	public String getFriPickUpLocation() {
		return friPickUpLocation;
	}


	public void setFriPickUpLocation(String friPickUpLocation) {
		this.friPickUpLocation = friPickUpLocation;
	}


	public String getFriPickUpStopNo() {
		return friPickUpStopNo;
	}


	public void setFriPickUpStopNo(String friPickUpStopNo) {
		this.friPickUpStopNo = friPickUpStopNo;
	}


	public String getFriBusRoute1() {
		return friBusRoute1;
	}


	public void setFriBusRoute1(String friBusRoute1) {
		this.friBusRoute1 = friBusRoute1;
	}


	public LocalTime getFriPickUpTime() {
		return friPickUpTime;
	}


	public void setFriPickUpTime(LocalTime friPickUpTime) {
		this.friPickUpTime = friPickUpTime;
	}


	public String getFriDeliveryLocation() {
		return friDeliveryLocation;
	}


	public void setFriDeliveryLocation(String friDeliveryLocation) {
		this.friDeliveryLocation = friDeliveryLocation;
	}


	public String getFriDeliveryStopNo() {
		return friDeliveryStopNo;
	}


	public void setFriDeliveryStopNo(String friDeliveryStopNo) {
		this.friDeliveryStopNo = friDeliveryStopNo;
	}


	public String getFriBusRoute2() {
		return friBusRoute2;
	}


	public void setFriBusRoute2(String friBusRoute2) {
		this.friBusRoute2 = friBusRoute2;
	}


	public LocalTime getFriDeliveryTime() {
		return friDeliveryTime;
	}


	public void setFriDeliveryTime(LocalTime friDeliveryTime) {
		this.friDeliveryTime = friDeliveryTime;
	}


	public float getDefaultPickOdometer() {
		return defaultPickOdometer;
	}


	public void setDefaultPickOdometer(float defaultPickOdometer) {
		this.defaultPickOdometer = defaultPickOdometer;
	}


	public float getMonPickOdometer() {
		return monPickOdometer;
	}


	public void setMonPickOdometer(float monPickOdometer) {
		this.monPickOdometer = monPickOdometer;
	}


	public float getTuePickOdometer() {
		return tuePickOdometer;
	}


	public void setTuePickOdometer(float tuePickOdometer) {
		this.tuePickOdometer = tuePickOdometer;
	}


	public float getWedPickOdometer() {
		return wedPickOdometer;
	}


	public void setWedPickOdometer(float wedPickOdometer) {
		this.wedPickOdometer = wedPickOdometer;
	}


	public float getThuPickOdometer() {
		return thuPickOdometer;
	}


	public void setThuPickOdometer(float thuPickOdometer) {
		this.thuPickOdometer = thuPickOdometer;
	}


	public float getFriPickOdometer() {
		return friPickOdometer;
	}


	public void setFriPickOdometer(float friPickOdometer) {
		this.friPickOdometer = friPickOdometer;
	}


	public float getDefaultDeliverOdometer() {
		return defaultDeliverOdometer;
	}


	public void setDefaultDeliverOdometer(float defaultDeliverOdometer) {
		this.defaultDeliverOdometer = defaultDeliverOdometer;
	}


	public float getMonDeliverOdometer() {
		return monDeliverOdometer;
	}


	public void setMonDeliverOdometer(float monDeliverOdometer) {
		this.monDeliverOdometer = monDeliverOdometer;
	}


	public float getTueDeliverOdometer() {
		return tueDeliverOdometer;
	}


	public void setTueDeliverOdometer(float tueDeliverOdometer) {
		this.tueDeliverOdometer = tueDeliverOdometer;
	}


	public float getWedDeliverOdometer() {
		return wedDeliverOdometer;
	}


	public void setWedDeliverOdometer(float wedDeliverOdometer) {
		this.wedDeliverOdometer = wedDeliverOdometer;
	}


	public float getThuDeliverOdometer() {
		return thuDeliverOdometer;
	}


	public void setThuDeliverOdometer(float thuDeliverOdometer) {
		this.thuDeliverOdometer = thuDeliverOdometer;
	}


	public float getFriDeliverOdometer() {
		return friDeliverOdometer;
	}


	public void setFriDeliverOdometer(float friDeliverOdometer) {
		this.friDeliverOdometer = friDeliverOdometer;
	}


	public String getAltSchool1() {
		return altSchool1;
	}


	public void setAltSchool1(String altSchool1) {
		this.altSchool1 = altSchool1;
	}


	public String getAltSchool1PickUpLocation() {
		return altSchool1PickUpLocation;
	}


	public void setAltSchool1PickUpLocation(String altSchool1PickUpLocation) {
		this.altSchool1PickUpLocation = altSchool1PickUpLocation;
	}


	public String getAltSchool1PickUpStopNo() {
		return altSchool1PickUpStopNo;
	}


	public void setAltSchool1PickUpStopNo(String altSchool1PickUpStopNo) {
		this.altSchool1PickUpStopNo = altSchool1PickUpStopNo;
	}


	public String getAltSchool1BusRoute1() {
		return altSchool1BusRoute1;
	}


	public void setAltSchool1BusRoute1(String altSchool1BusRoute1) {
		this.altSchool1BusRoute1 = altSchool1BusRoute1;
	}


	public LocalTime getAltSchool1PickUpTime() {
		return altSchool1PickUpTime;
	}


	public void setAltSchool1PickUpTime(LocalTime altSchool1PickUpTime) {
		this.altSchool1PickUpTime = altSchool1PickUpTime;
	}


	public float getAltSchool1PickOdometer() {
		return altSchool1PickOdometer;
	}


	public void setAltSchool1PickOdometer(float altSchool1PickOdometer) {
		this.altSchool1PickOdometer = altSchool1PickOdometer;
	}


	public boolean isAltSchool1PickupIsSchool() {
		return altSchool1PickupIsSchool;
	}


	public void setAltSchool1PickupIsSchool(boolean altSchool1PickupIsSchool) {
		this.altSchool1PickupIsSchool = altSchool1PickupIsSchool;
	}


	public String getAltSchool1DeliveryLocation() {
		return altSchool1DeliveryLocation;
	}


	public void setAltSchool1DeliveryLocation(String altSchool1DeliveryLocation) {
		this.altSchool1DeliveryLocation = altSchool1DeliveryLocation;
	}


	public String getAltSchool1DeliveryStopNo() {
		return altSchool1DeliveryStopNo;
	}


	public void setAltSchool1DeliveryStopNo(String altSchool1DeliveryStopNo) {
		this.altSchool1DeliveryStopNo = altSchool1DeliveryStopNo;
	}


	public String getAltSchool1BusRoute2() {
		return altSchool1BusRoute2;
	}


	public void setAltSchool1BusRoute2(String altSchool1BusRoute2) {
		this.altSchool1BusRoute2 = altSchool1BusRoute2;
	}


	public LocalTime getAltSchool1DeliveryTime() {
		return altSchool1DeliveryTime;
	}


	public void setAltSchool1DeliveryTime(LocalTime altSchool1DeliveryTime) {
		this.altSchool1DeliveryTime = altSchool1DeliveryTime;
	}


	public float getAltSchool1DeliverOdometer() {
		return altSchool1DeliverOdometer;
	}


	public void setAltSchool1DeliverOdometer(float altSchool1DeliverOdometer) {
		this.altSchool1DeliverOdometer = altSchool1DeliverOdometer;
	}


	public boolean isAltSchool1DeliveryIsSchool() {
		return altSchool1DeliveryIsSchool;
	}


	public void setAltSchool1DeliveryIsSchool(boolean altSchool1DeliveryIsSchool) {
		this.altSchool1DeliveryIsSchool = altSchool1DeliveryIsSchool;
	}


	public int getPickDeliverTabValue() {
		return pickDeliverTabValue;
	}


	public void setPickDeliverTabValue(int pickDeliverTabValue) {
		this.pickDeliverTabValue = pickDeliverTabValue;
	}


	public int getAltAddressTabValue() {
		return altAddressTabValue;
	}


	public void setAltAddressTabValue(int altAddressTabValue) {
		this.altAddressTabValue = altAddressTabValue;
	}


	public boolean isHasRolledOver() {
		return hasRolledOver;
	}


	public void setHasRolledOver(boolean hasRolledOver) {
		this.hasRolledOver = hasRolledOver;
	}


	public Date getDateOfRollover() {
		return dateOfRollover;
	}


	public void setDateOfRollover(Date dateOfRollover) {
		this.dateOfRollover = dateOfRollover;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
