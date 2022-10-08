package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;


@Entity
public class PickupDropoff {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
/*
@NonNull
private int schoolId;
*/
@NonNull
private long studentId;


@NonNull
private long monPickupPointId;
@NonNull
private long monDropOffPointId;


@NonNull
private long tuePickupLocPointId;
@NonNull
private long tueDropoffLocPointId;
@NonNull
private long wedPickupLocPointId;
@NonNull
private int wedDropoffLocPointId;
@NonNull
private long thurPickupLocPointId;
@NonNull
private long thurDropoffLocPointId;
@NonNull
private long friPickupLocPointId;
@NonNull
private long friDropoffLocPointId;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "pickupPointId")
private LocationPoint pickupLocation;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "dropOffPointId")
private LocationPoint dropoffLocation;
/*
@ManyToOne
@JoinColumn(name="schoolId")
private Schools locInfo;
*/

@ManyToOne
@JoinColumn(name="schoolId", referencedColumnName = "school_id")
private Schools school;

public void insertData(int id, int schoolId, long studentId, long monPickupPointId, long monDropOffPointId,
		long tuePickupLocPointId, long tueDropoffLocPointId, long wedPickupLocPointId, int wedDropoffLocPointId,
		long thurPickupLocPointId, long thurDropoffLocPointId, long friPickupLocPointId,
		long friDropoffLocPointId) 
		
	{
//	  this.schoolId = schoolId;
	  this.studentId = studentId;
	  this.monPickupPointId = monPickupPointId;
	  this.monDropOffPointId = monDropOffPointId;
	  this.tuePickupLocPointId = tuePickupLocPointId;
	  this.tueDropoffLocPointId = tueDropoffLocPointId;
	  this.wedPickupLocPointId = wedPickupLocPointId;
	  this.wedDropoffLocPointId = wedDropoffLocPointId;
	  this.thurPickupLocPointId = thurPickupLocPointId;
	  this.thurDropoffLocPointId = thurDropoffLocPointId;
	  this.friPickupLocPointId = friPickupLocPointId;
	  this.friDropoffLocPointId = friDropoffLocPointId;
	}

public void setSchool(Schools school)
{
	this.school = school;
}

public Schools getSchool()
{
	return school;
}

public void setPickupLocation(LocationPoint pickupLocation)
{
	this.pickupLocation = pickupLocation;
}

public LocationPoint getPickupLocation()
{
	return pickupLocation;
}
public void setDropoffLocation(LocationPoint dropoffLocation)
{
	this.dropoffLocation = dropoffLocation;
}

public LocationPoint getDropoffLocation()
{
	return dropoffLocation;
}



/*
public int getSchoolId() {
	return schoolId;
}
public void setSchoolId(int schoolId) {
	this.schoolId = schoolId;
}
*/
public long getStudentId() {
	return studentId;
}
public void setStudentId(long studentId) {
	this.studentId = studentId;
}
public long getMonPickupPointId() {
	return monPickupPointId;
}
public void setMonPickupPointId(long monPickupPointId) {
	this.monPickupPointId = monPickupPointId;
}
public long getMonDropOffPointId() {
	return monDropOffPointId;
}
public void setMonDropOffPointId(long monDropOffPointId) {
	this.monDropOffPointId = monDropOffPointId;
}
public long getTuePickupLocPointId() {
	return tuePickupLocPointId;
}
public void setTuePickupLocPointId(long tuePickupLocPointId) {
	this.tuePickupLocPointId = tuePickupLocPointId;
}
public long getTueDropoffLocPointId() {
	return tueDropoffLocPointId;
}
public void setTueDropoffLocPointId(long tueDropoffLocPointId) {
	this.tueDropoffLocPointId = tueDropoffLocPointId;
}
public long getWedPickupLocPointId() {
	return wedPickupLocPointId;
}
public void setWedPickupLocPointId(long wedPickupLocPointId) {
	this.wedPickupLocPointId = wedPickupLocPointId;
}
public long getWedDropoffLocPointId() {
	return wedDropoffLocPointId;
}
public void setWedDropoffLocPointId(int wedDropoffLocPointId) {
	this.wedDropoffLocPointId = wedDropoffLocPointId;
}
public long getThurPickupLocPointId() {
	return thurPickupLocPointId;
}
public void setThurPickupLocPointId(long thurPickupLocPointId) {
	this.thurPickupLocPointId = thurPickupLocPointId;
}
public long getThurDropoffLocPointId() {
	return thurDropoffLocPointId;
}
public void setThurDropoffLocPointId(long thurDropoffLocPointId) {
	this.thurDropoffLocPointId = thurDropoffLocPointId;
}
public long getFriPickupLocPointId() {
	return friPickupLocPointId;
}
public void setFriPickupLocPointId(long friPickupLocPointId) {
	this.friPickupLocPointId = friPickupLocPointId;
}
public long getFriDropoffLocPointId() {
	return friDropoffLocPointId;
}
public void setFriDropoffLocPointId(long friDropoffLocPointId) {
	this.friDropoffLocPointId = friDropoffLocPointId;
}

}



