package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;

@Entity
public class Depots {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int depotId;
	
	@NonNull
	private String contractor;
	@NonNull
	private String name;
	@NonNull
	private int locationId;
	@NonNull
	private String address1;
	@NonNull
	private String address2;
	@NonNull
	private String city;
	@NonNull
	private String state;
	@NonNull
	private String zipCode;
	@NonNull
	private String roadNo;
	@NonNull
	private String roadName;
	@NonNull
	private boolean isActive;
	
	public void insertData(int depotId, String contractor, String name, int locationId, String address1, String address2,
			String city, String state, String zipCode, String roadNo, String roadName, boolean isActive) {
    	
    	this.depotId = depotId;
    	this.contractor = contractor;
    	this.name = name;
    	this.locationId = locationId;
    	this.address1 = address1;
    	this.address2 = address2;
    	this.city = city;
    	this.state = state;
    	this.zipCode = zipCode;
    	this.roadNo = roadNo;
    	this.roadName = roadName;
    	this.isActive = isActive;
 
    }
	
	public int getDepotId() {
		return depotId;
	}
	public void setDepotId(int depotId) {
		this.depotId = depotId;
	}
	public String getContractor() {
		return contractor;
	}
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getRoadNo() {
		return roadNo;
	}
	public void setRoadNo(String roadNo) {
		this.roadNo = roadNo;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
