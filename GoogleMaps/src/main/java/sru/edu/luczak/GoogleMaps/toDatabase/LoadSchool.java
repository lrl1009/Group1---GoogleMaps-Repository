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
import sru.edu.luczak.GoogleMaps.repository.SchoolRepository;


@Component
public class LoadSchool implements CommandLineRunner {
	
	@Autowired SchoolRepository schoolRepo;
	@Override
	public void run(String... args) throws Exception {
		
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("SchoolsTEST.xlsx");
		
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
	    	int schoolDays = (int) row.getCell(5).getNumericCellValue();
	    	String address = row.getCell(6).getStringCellValue();
	    	String city = row.getCell(8).getStringCellValue();
	    	String state = row.getCell(9).getStringCellValue();
	    	int zip = (int) row.getCell(10).getNumericCellValue();
	    	int phone = (int) row.getCell(11).getNumericCellValue();
	    	int location_id = (int) row.getCell(12).getNumericCellValue();
	    	boolean isActive = row.getCell(13).getBooleanCellValue();
	    	
	    	Schools schoolData = new Schools();
	    	schoolData.insertData(id, schoolName, type, schoolGrade, studentCount, schoolDays, address, city, state, zip, phone, isActive);
	    	
	    	LocationPoint locationPoint = new LocationPoint();
	    	locationPoint.setLatitude(30);
	    	locationPoint.setLongitude(40);
	    	locationPoint.setLocation_id(location_id);
	    	schoolData.setLocation(locationPoint);
	    	schoolRepo.save(schoolData);
	    }
	}
}