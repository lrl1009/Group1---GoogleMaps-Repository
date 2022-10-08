package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;
import javax.persistence.Entity;

@Entity
public class LocationPoint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int location_id;
	@NonNull
	private String locationPointName;
	@NonNull
	private String roadName;
	@NonNull
	private float longitude;
	@NonNull
	private float latitude;
	@NonNull
	private float distCost;
	@NonNull
	private float timeCost;
	@NonNull
	private float cost;
	@NonNull
	private boolean mapped;
	@NonNull
	private int routeId;
	@NonNull
	private boolean isActive;
	
	@OneToOne(mappedBy = "location")
    private Schools school;
	@OneToOne(mappedBy = "pickupLocation")
    private PickupDropoff pickup;
	@OneToOne(mappedBy = "dropoffLocation")
    private PickupDropoff dropoff;

	public void insertData(int location_id, float latitude, float longitude, String locationPointName, String roadName,
			float distCost, float timeCost, float cost, boolean mapped, int routeId, boolean isActive) {
		
		this.location_id = location_id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.locationPointName = locationPointName;
		this.roadName = roadName;
		this.distCost = distCost;
		this.timeCost = timeCost;
		this.cost = cost;
		this.mapped = mapped;
		this.routeId = routeId;
		this.isActive = isActive;
	}

	public int getLocationId() {
		return location_id;
	}

	public void setLocationId(int location_id) {
		this.location_id = location_id;
	}

	public String getLocationPointName() {
		return locationPointName;
	}

	public void setLocationPointName(String locationPointName) {
		this.locationPointName = locationPointName;
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

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public float getDistCost() {
		return distCost;
	}

	public void setDistCost(float distCost) {
		this.distCost = distCost;
	}

	public float getTimeCost() {
		return timeCost;
	}

	public void setTimeCost(float timeCost) {
		this.timeCost = timeCost;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public boolean isMapped() {
		return mapped;
	}

	public void setMapped(boolean mapped) {
		this.mapped = mapped;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}