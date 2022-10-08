package sru.edu.luczak.GoogleMaps.toDatabase;

import java.io.InputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sru.edu.luczak.GoogleMaps.domain.LocationPoint;
import sru.edu.luczak.GoogleMaps.domain.PickupDropoff;
import sru.edu.luczak.GoogleMaps.domain.Schools;
import sru.edu.luczak.GoogleMaps.repository.PickupDropoffRepository;
import sru.edu.luczak.GoogleMaps.repository.SchoolRepository;

@Component
public class LoadPickupDropoff implements CommandLineRunner {
	
@Autowired private PickupDropoffRepository pickupDropoffRepo;
@Autowired private SchoolRepository schoolRepo;

	@Override
	public void run(String... args) throws Exception {
		
		
		Schools schoolData = new Schools();
    	schoolData.insertData(345,  "Rowan",  "Elementary",  "Any",  98, 12,  0,  "AM",  6,  0,  "Pm", 
    			 120,  null,  null,  "2342323223", 12345, "Cranberry", "PA", true, "123 Madeup Lane");
    	
    	LocationPoint locationPoint = new LocationPoint();
    	locationPoint.setLatitude((float) 41.1326592264104);
    	locationPoint.setLongitude((float) -77.72191942790654);
    	locationPoint.setLocationPointName("123 Madeup Lane");
    	schoolData.setLocation(locationPoint);
    	schoolRepo.save(schoolData);
    	
    	
		PickupDropoff center = new PickupDropoff();
		LocationPoint pickup = new LocationPoint();
		LocationPoint dropoff = new LocationPoint();
		
		pickup.setLatitude((float) 42.1326592264104);
		pickup.setLongitude((float) -76.72191942790654);
		pickup.setLocationPointName("Center Pickup");
		
		dropoff.setLatitude((float) 41.1326592264104);
		dropoff.setLongitude((float) -77.72191942790654);
		dropoff.setLocationPointName("Center Dropoff");
		
		center.setSchool(schoolData);
		center.setPickupLocation(pickup);
		center.setDropoffLocation(dropoff);

    	pickupDropoffRepo.save(center);
    	
    	
		
	/*
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();

		InputStream pickupDropoff = classloader.getResourceAsStream("PickupDropoff.xlsx");
			
		XSSFWorkbook pickupDropoffWorkbook = new XSSFWorkbook(pickupDropoff);
		XSSFSheet pickupDropoffSheet = pickupDropoffWorkbook.getSheet("Sheet1");
		    
	    int pickupDropoffRows=pickupDropoffSheet.getLastRowNum();
		    
		    
		 for (int i = 1; i<pickupDropoffRows; i++)
		 {
			 
			    XSSFRow pickupDropoffRow = pickupDropoffSheet.getRow(i);
		    	long schoolId = (long) pickupDropoffRow.getCell(0).getNumericCellValue();
		    	long studentId = (long) pickupDropoffRow.getCell(1).getNumericCellValue();
		    	long monPickupLocPointId = (long) pickupDropoffRow.getCell(2).getNumericCellValue();
		    	long monDropoffLocPointId = (long) pickupDropoffRow.getCell(3).getNumericCellValue();
		    	
		    	long tuePickupLocPointId = (long) pickupDropoffRow.getCell(4).getNumericCellValue();
		    	long tueDropoffLocPointId = (long) pickupDropoffRow.getCell(5).getNumericCellValue();
		    	long wedPickupLocPointId = (long) pickupDropoffRow.getCell(6).getNumericCellValue();
		    	int wedDropoffLocPointId = (int) pickupDropoffRow.getCell(7).getNumericCellValue();
		    	long thurPickupLocPointId = (long) pickupDropoffRow.getCell(8).getNumericCellValue();
		    	long thurDropoffLocPointId = (long) pickupDropoffRow.getCell(9).getNumericCellValue();
		    	long friPickupLocPointId = (long) pickupDropoffRow.getCell(10).getNumericCellValue();
		    	long friDropoffLocPointId = (long) pickupDropoffRow.getCell(11).getNumericCellValue();
		    	 */
			 	/*
		    	PickupDropoff pickupDropoffData = new PickupDropoff();
		    	pickupDropoffData.insertData(schoolId, studentId, monPickupLocPointId, monDropoffLocPointId,
		        tuePickupLocPointId,  tueDropoffLocPointId, wedPickupLocPointId, wedDropoffLocPointId,
		        thurPickupLocPointId, thurDropoffLocPointId, friPickupLocPointId, friDropoffLocPointId);
		    	pickupDropoffRepo.save(pickupDropoffData);
		    	
			 
		 }*/
	}    	
}