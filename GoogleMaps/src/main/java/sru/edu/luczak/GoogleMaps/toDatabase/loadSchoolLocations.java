package sru.edu.luczak.GoogleMaps.toDatabase;

import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sru.edu.luczak.GoogleMaps.domain.LocationPoint;
import sru.edu.luczak.GoogleMaps.domain.Schools;
import sru.edu.luczak.GoogleMaps.repository.LocationPointRepository;
import sru.edu.luczak.GoogleMaps.repository.SchoolRepository;
/*
@Component
public class loadSchoolLocations implements CommandLineRunner {
	
	private LocationPointRepository repo;
	private SchoolRepository schoolRepo;
	
    public loadSchoolLocations(LocationPointRepository repo, SchoolRepository schoolRepo) {
		this.repo = repo;
		this.schoolRepo = schoolRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		//Look into the resources folder to find the stored excel sheet.
    	ClassLoader classloader1 = Thread.currentThread().getContextClassLoader();
    	ClassLoader classloader2 = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader1.getResourceAsStream("LocationPointTest.xlsx");
		InputStream school = classloader.getResourceAsStream("SchoolsTEST.xlsx");
		
		//Open the excel workbook and open the sheet that we need
		XSSFWorkbook schoolWorkbook = new XSSFWorkbook(school);
	    XSSFSheet schoolSheet = schoolWorkbook.getSheet("Schools");
		
		//Open the excel workbook and open the sheet that we need
		XSSFWorkbook locationWorkbook = new XSSFWorkbook(is);
	    XSSFSheet sheet = locationWorkbook.getSheet("PickupPoint");
	    
	    //assign the number of rows equal to the last Row number so the loop knows where to stop
	    int rows=sheet.getLastRowNum();
	    int schoolRows=schoolSheet.getLastRowNum();
	    for(int x=1; x<=schoolRows;x++) {
	    	
	    	XSSFRow row = schoolSheet.getRow(x);
	    	long id = (long) row.getCell(0).getNumericCellValue();
	    	String schools = row.getCell(1).getStringCellValue();
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
	    }
	    
	    
	    
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

	    	Schools school = new Schools();
	    	school.insertData(routeId, roadName, roadName, roadName, id, routeId, roadName, locationPointName, roadName, r, rows, isActive);
        	LocationPoint location = new LocationPoint();
        	location.insertData(id, latitude, longitude, locationPointName, roadName, distCost, timeCost, cost, mapped, routeId, isActive);
        	repo.save(location);
        }
    	workbook.close();
    	schoolWorkbook.close();
		
	}

}
*/