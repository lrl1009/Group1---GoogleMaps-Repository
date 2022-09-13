package sru.edu.luczak.GoogleMaps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sru.edu.luczak.GoogleMaps.domain.PickupPoint;
import sru.edu.luczak.GoogleMaps.repository.PickupPointRepository;


@SpringBootApplication
public class GoogleMapsApplication implements CommandLineRunner {

		@Autowired PickupPointRepository repo;
		
	    public static void main(String[] args)
	    {
	        SpringApplication.run(GoogleMapsApplication.class, args);
	    }
	 
	    @Override
	    public void run(String... args) throws Exception
	    {
	    	ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = classloader.getResourceAsStream("PickupPointInfo.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(is);
		    XSSFSheet sheet = workbook.getSheet("Sheet1");
		    
		    int rows=sheet.getLastRowNum();
	    	for(int r=1; r<=rows;r++)
	        {
	        	XSSFRow row=sheet.getRow(r);
	        	String id = row.getCell(0).getStringCellValue();
	        	int studentCount = (int) row.getCell(1).getNumericCellValue();
	        	String pickupPointName = row.getCell(2).getStringCellValue();
	        	String roadName = row.getCell(3).getStringCellValue();
	        	long longitude = (long) row.getCell(4).getNumericCellValue();
	        	long latitude = (long) row.getCell(5).getNumericCellValue();
	        	
	        	//System.out.println(studentCount);
	        	PickupPoint pickup = new PickupPoint(id, latitude, longitude, pickupPointName, roadName, studentCount);
	        	repo.save(pickup);
	        	
	        }  
	    }
}		
/*		
		public static void main(String[] args) throws SQLException, IOException {
			SpringApplication.run(GoogleMapsApplication.class, args);
//		PickupPointController excel = new PickupPointController();
//		excel.main(args);
*/		
	