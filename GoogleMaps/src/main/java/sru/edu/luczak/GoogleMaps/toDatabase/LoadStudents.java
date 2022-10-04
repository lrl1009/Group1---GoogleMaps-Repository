package sru.edu.luczak.GoogleMaps.toDatabase;

import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.CommandLineRunner;

import sru.edu.luczak.GoogleMaps.domain.Students;
import sru.edu.luczak.GoogleMaps.repository.StudentRepository;

public class LoadStudents implements CommandLineRunner {
	
private StudentRepository repo;

    public LoadStudents(StudentRepository repo) {
		this.repo = repo;
	}

	@Override
	public void run(String... args) throws Exception {
		//Look into the resources folder to find the stored excel sheet.
    	ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("StudentsTEST.xlsx");
		
		//Open the excel workbook and open the sheet that we need
		XSSFWorkbook workbook = new XSSFWorkbook(is);
	    XSSFSheet sheet = workbook.getSheet("Students");
	    
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

        	Students student = new Students();
        	
        	repo.save(student);
        }
    	workbook.close();
		
	}

}
