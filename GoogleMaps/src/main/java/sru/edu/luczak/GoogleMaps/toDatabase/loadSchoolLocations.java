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
import sru.edu.luczak.GoogleMaps.domain.Schools;
import sru.edu.luczak.GoogleMaps.repository.LocationPointRepository;
import sru.edu.luczak.GoogleMaps.repository.SchoolRepository;
/*
@Component
public class loadSchoolLocations implements CommandLineRunner {
	
	@Autowired SchoolRepository schoolRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("LoadSchoolsInfo.xlsx");
		
		//Open the excel workbook and open the sheet that we need
		XSSFWorkbook workbook = new XSSFWorkbook(is);
	    XSSFSheet schoolSheet = workbook.getSheet("Schools");
	    
	    int rows=schoolSheet.getLastRowNum();
	    for(int x=1; x<=rows;x++) {
	    	
	    	XSSFRow row = schoolSheet.getRow(x);
	    	int id = (int) row.getCell(0).getNumericCellValue();
	    	String schoolName = row.getCell(1).getStringCellValue();
	    	String type = row.getCell(2).getStringCellValue();
	    	String schoolGrade = row.getCell(3).getStringCellValue();
	    	int studentCount = (int) row.getCell(4).getNumericCellValue();
	    	
	    	int startHour = (int) row.getCell(5).getNumericCellValue();
	    	int startMin = (int) row.getCell(6).getNumericCellValue();
	    	String startAmPm = row.getCell(7).getStringCellValue();
	    	int endHour = (int) row.getCell(8).getNumericCellValue();
	    	int endMin = (int) row.getCell(9).getNumericCellValue();
	    	String endAmPm = row.getCell(10).getStringCellValue();
	    	int schoolDays = (int) row.getCell(11).getNumericCellValue();
	    	Date startDate = row.getCell(12).getDateCellValue();
	    	Date endDate = row.getCell(13).getDateCellValue();
	    	
	    	String address = row.getCell(14).getStringCellValue();
	    	String city = row.getCell(15).getStringCellValue();
	    	String state = row.getCell(16).getStringCellValue();
	    	int zip = (int) row.getCell(17).getNumericCellValue();
	    	String phone = row.getCell(18).getStringCellValue();
//	    	int location_id = (int) row.getCell(19).getNumericCellValue();
	    	boolean isActive = row.getCell(20).getBooleanCellValue();
	    	float latitude = (float) row.getCell(21).getNumericCellValue();
	    	float longitude = (float) row.getCell(22).getNumericCellValue();
	    	
	    	
	    	Schools schoolData = new Schools();
	    	schoolData.insertData( id,  schoolName,  type,  schoolGrade,  studentCount, startHour,  startMin,  startAmPm,  endHour,  endMin,  endAmPm, 
	    			 schoolDays,  startDate,  endDate,  phone, zip, city, state, isActive, address);
	    	
	    	
	    	LocationPoint locationPoint = new LocationPoint();
	    	locationPoint.setLatitude(latitude);
	    	locationPoint.setLongitude(longitude);
	    	locationPoint.setLocationPointName(address);
	    	schoolData.setLocation(locationPoint);
	    	schoolRepo.save(schoolData);
	    }
	    workbook.close();
	}
		
}
*/