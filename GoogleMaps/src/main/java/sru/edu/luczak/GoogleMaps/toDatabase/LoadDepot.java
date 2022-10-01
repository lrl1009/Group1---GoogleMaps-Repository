package sru.edu.luczak.GoogleMaps.toDatabase;

import java.io.InputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sru.edu.luczak.GoogleMaps.domain.Depots;
import sru.edu.luczak.GoogleMaps.repository.DepotRepository;



@Component
public class LoadDepot implements CommandLineRunner {
	
	private DepotRepository depotRepo;
	
	public LoadDepot(DepotRepository depotRepo) {
		this.depotRepo = depotRepo;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
	//Look into the resources folder to find the stored excel sheet.
	ClassLoader classloader = Thread.currentThread().getContextClassLoader();
	InputStream is = classloader.getResourceAsStream("Depot_9-27-2022.xlsx");
	
	//Open the excel workbook and open the sheet that we need
	XSSFWorkbook workbook = new XSSFWorkbook(is);
    XSSFSheet sheet = workbook.getSheet("Depot");
    
    //assign the number of rows equal to the last Row number so the loop knows where to stop
    int rows = sheet.getLastRowNum();
    
	for(int r=1; r<=rows;r++)
    {
		XSSFRow row = sheet.getRow(r);
		int id = (int) row.getCell(0).getNumericCellValue();
    	String contractorId = row.getCell(1).getStringCellValue();
    	String name = row.getCell(2).getStringCellValue();
    	int locationId =  (int) row.getCell(3).getNumericCellValue();
    	String address1 = row.getCell(4).getStringCellValue();
    	String address2 = row.getCell(5).getStringCellValue();
    	String city = row.getCell(6).getStringCellValue();
    	String state = row.getCell(7).getStringCellValue();
    	String zip = row.getCell(8).getStringCellValue();
    	String roadNo = row.getCell(9).getStringCellValue();
    	String roadName = row.getCell(10).getStringCellValue();
    	boolean active = row.getCell(11).getBooleanCellValue();

    	Depots depot = new Depots();
    	depot.insertData(id, contractorId, name, locationId, address1, address2, city, state, zip, roadNo, roadName, active);
    	depotRepo.save(depot);
    }
	workbook.close();
}	

}
