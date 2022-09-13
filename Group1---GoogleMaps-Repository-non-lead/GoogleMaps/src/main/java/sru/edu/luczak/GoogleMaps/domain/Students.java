package sru.edu.luczak.GoogleMaps.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.lang.NonNull;
import javax.persistence.Entity;

@Entity
public class Students {
//This table is designed to hold all of the information for the Students that are going to be linked to PickupPoints
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@NonNull
	private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String pickupPointName;
    @NonNull
    private String dropOffPoint;
    
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

}
