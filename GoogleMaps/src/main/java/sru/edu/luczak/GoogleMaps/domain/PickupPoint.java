package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.lang.NonNull;
import javax.persistence.Entity;

@Entity
public class PickupPoint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NonNull
	private int studentCount;
	@NonNull
	private String pickupPointName;
	@NonNull
	private String roadName;
	@NonNull
	private float longitude;
	@NonNull
	private float latitude;
	
	PickupPoint(){
		
	}
	
	public PickupPoint(int id, float latitude, float longitude, String pickupPointName, String roadName, int studentCount) {
		this.id= id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.pickupPointName = pickupPointName;
		this.roadName = roadName;
		this.studentCount = studentCount;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public String getPickupPointName() {
		return pickupPointName;
	}

	public void setPickupPointName(String pickuppointName) {
		this.pickupPointName = pickuppointName;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	
	public String toString(int id, float latitude, float longitude, String pickupPointName, String roadName, int studentCount) {
		  return id + latitude + longitude + roadName + pickupPointName + studentCount;
	  }
}

// JPA (Java - based database)
// Hibernate (Works with JPA)
// JDBC (????)
// MySQL (Works with ^)
// javax libraries - Done
// apache POI (Spreadsheets)
// Controller (look into)
