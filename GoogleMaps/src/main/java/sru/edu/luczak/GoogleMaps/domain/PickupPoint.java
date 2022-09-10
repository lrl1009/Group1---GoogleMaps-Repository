package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.lang.NonNull;
import javax.persistence.Entity;

@Entity
public class PickupPoint {
//From what I understand the domain is where the table in MySQL is created and the columns are named
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
/*	
	public void insertDatabase() {
		
	}
*/
}

// JPA (Java - based database)
// Hibernate (Works with JPA)
// JDBC (????)
// MySQL (Works with ^)
// javax libraries - Done
// apache POI (Spreadsheets)
// Controller (look into)
