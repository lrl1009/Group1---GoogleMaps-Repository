package sru.edu.luczak.GoogleMaps.domain;

	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import org.springframework.lang.NonNull;
	import java.util.Date;
	import javax.persistence.Entity;

	@Entity
public class SimpleStudents {


	//This table is designed to hold all of the information for the Students that are going to be linked to PickupPoints
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@NonNull private int studId;
		@NonNull private String firstName;
		@NonNull private String midName;
	    @NonNull private String lastName;
	    @NonNull private String suffix;
	    @NonNull private float grade;
	    @NonNull private String address1;
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
	    @NonNull private String studentType;
	    @NonNull private String pickUpLocation;
	    @NonNull private String dropOffLocation;

	    public void insertData(int id, int studId ) {
	 
	    }


	}
