package sru.edu.luczak.GoogleMaps;


import java.io.InputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sru.edu.luczak.GoogleMaps.domain.LocationPoint;
import sru.edu.luczak.GoogleMaps.domain.Students;
import sru.edu.luczak.GoogleMaps.domain.Depots;
import sru.edu.luczak.GoogleMaps.repository.LocationPointRepository;
import sru.edu.luczak.GoogleMaps.repository.StudentRepository;


@SpringBootApplication
public class GoogleMapsApplication implements CommandLineRunner {

		@Autowired LocationPointRepository repo;
		@Autowired StudentRepository studRepo;
		
	    public static void main(String[] args)
	    {
	        SpringApplication.run(GoogleMapsApplication.class, args);
	    }
	 
	    @Override
	    public void run(String... args) throws Exception
	    {
	    	
	    	//Look into the resources folder to find the stored excel sheet.
	    	ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = classloader.getResourceAsStream("LocationPoint9-26-2022.xlsx");
			
			//Open the excel workbook and open the sheet that we need
			XSSFWorkbook workbook = new XSSFWorkbook(is);
		    XSSFSheet sheet = workbook.getSheet("PickupPoint");
		    
		    //assign the number of rows equal to the last Row number so the loop knows where to stop
		    int rows=sheet.getLastRowNum();
		    
		    // loop cycles through the number of rows in the excel workbook and assigns each cell in each column to the
		    // appropriate datatype. pickup.insertData assigns the values to the instance of pickup and that is then
		    // passed to the mySQL.
	    	for(int r=1; r<=rows;r++)
	        {

	    		//Read through 
	    		XSSFRow row=sheet.getRow(r);
		    	int id = (int) row.getCell(0).getNumericCellValue();
		    	String locationPointName = row.getCell(1).getStringCellValue();
		    	String roadName = row.getCell(2).getStringCellValue();
		    	float latitude =  (float) row.getCell(3).getNumericCellValue();
		    	float longitude = (float) row.getCell(4).getNumericCellValue();
		    	float distCost = (float) row.getCell(5).getNumericCellValue();
		    	float timeCost = (float) row.getCell(6).getNumericCellValue();
		    	float cost = (float) row.getCell(7).getNumericCellValue();
		    	boolean mapped = row.getCell(8).getBooleanCellValue();
		    	int routeId = (int) row.getCell(9).getNumericCellValue();
		    	boolean isActive = row.getCell(10).getBooleanCellValue();

	        	LocationPoint location = new LocationPoint();
	        	location.insertData(id, latitude, longitude, locationPointName, roadName, distCost, timeCost, cost, mapped, routeId, isActive);
	        	repo.save(location);
	        }
/*
	    	//Student Information Upload
	    	InputStream studentInfo = classloader.getResourceAsStream("StudentInfo_9-24-2022.xlsx");
	    	XSSFWorkbook studentWorkbook = new XSSFWorkbook(studentInfo);
		    XSSFSheet studentSheet = studentWorkbook.getSheet("Student Info");
		    int studRows=studentSheet.getLastRowNum();
	    	
		    for(int r=1; r<=studRows;r++)
	        {
		    	
	    		//Read through 
	    		XSSFRow row = studentSheet.getRow(r);
	    		int studId = (int) row.getCell(0).getNumericCellValue();
	    		String lastName = row.getCell(1).getStringCellValue();
		    	String firstName = row.getCell(2).getStringCellValue();
		    	String address = row.getCell(3).getStringCellValue();
		    	String city = row.getCell(4).getStringCellValue();
		    	String state = row.getCell(5).getStringCellValue();
		    	long zipCode = (long) row.getCell(6).getNumericCellValue();
		    	Date bDate = row.getCell(7).getDateCellValue();
		    	String phoneNum = row.getCell(8).getStringCellValue();
		    	String cellPhoneNum = row.getCell(9).getStringCellValue();
		    	String emergencyPhoneNum = row.getCell(10).getStringCellValue();
		    	String parentLastName = row.getCell(11).getStringCellValue();
		    	String parentFirstName = row.getCell(12).getStringCellValue();
		    	float grade = (float) row.getCell(13).getNumericCellValue();
		    	String gender = row.getCell(14).getStringCellValue();
		    	String schoolName = row.getCell(15).getStringCellValue();
		    	
		    	Students student = new Students();
	        	student.insertData (studId, firstName, address, bDate, cellPhoneNum, city, emergencyPhoneNum,
	            		gender, grade, lastName, parentFirstName, parentLastName, phoneNum, schoolName, state, zipCode);
	        	studRepo.save(student);
	        }
*/
	    	
/*		    
 *          //Load in information for the depot 
		    InputStream depot = classloader.getResourceAsStream(".xlsx");
	    	XSSFWorkbook depotWorkbook = new XSSFWorkbook(depot);
		    XSSFSheet depotSheet = studentWorkbook.getSheet("");
		    int depotRows=depotSheet.getLastRowNum();
*/
	    	//close workbook to avoid memory and data related issues
	    	workbook.close();
//	    	studentWorkbook.close();
	    }
}		
/*		
		public static void main(String[] args) throws SQLException, IOException {
			SpringApplication.run(GoogleMapsApplication.class, args);
//		PickupPointController excel = new PickupPointController();
//		excel.main(args);
*/		
	