package sru.edu.luczak.GoogleMaps.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sru.edu.luczak.GoogleMaps.domain.LocationPoint;
import sru.edu.luczak.GoogleMaps.repository.LocationPointRepository;


@Controller
public class PickupPointController { 	

	//set up a UserRepositoty variable
	private LocationPointRepository locationPointRepository;
	
	//create an UserRepository instance - instantiation (new) is done by Spring
    public PickupPointController(LocationPointRepository locationPointRepository) {
		this.locationPointRepository = locationPointRepository;
	}
 /*    
    @RequestMapping({"/"})
		public String requestData() {
			return "distMatrixIndex";
		}
*/    
    
  //This method calls the select-school HTML file to guide the user through UI
  		@RequestMapping({"/"})
  		public String requestData(Model model) {
  			model.addAttribute("locationpoints", locationPointRepository.findAll());
  			return "googleMaps";
  		}
  		
/*	
	//This method calls the select-school HTML file to guide the user through UI
		@RequestMapping({"/"})
		public String requestData() {
			return "select-school";
		}
*/
   /* 
		@RequestMapping({"", "/distance-matrix"})
		public String showQueries(Model model) {
			model.addAttribute("location", locationPointRepository.findAll());
			return "distMatrixIndex";
		}
		
		@RequestMapping({"/newsearch"})
		public String addAddressesForm(LocationPoint locationPoint) {
	        return "new-distance-query";
	    }
		
		@RequestMapping({"/polyrouting"})
		public String PolyAndRouting(@Validated LocationPoint locationPoint, BindingResult result, Model model) {
			
			return "polygon-and-routing";
		}
*/		
		//This method creates attribute pickuppoints and digs up the repo info
		@RequestMapping({"/pickupPoints"})
		public String showData(Model model) {
			model.addAttribute("pickuppoints", locationPointRepository.findAll());
			return "view-school"; //view-school prints the database data
		}



    //Mapping for the /signup URL - calls the add-user HTML, to add a user
	@RequestMapping({"/createpickup"})
    public String showCreatePickupForm(LocationPoint locationPoint) {
        return "add-pickuppoints";
    }
    
	//Mapping for the /signup URL - to add a user
    @RequestMapping({"/addpickup"})
    public String addPickupPoint(@Validated LocationPoint locationPoint, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-pickuppoints";
        }
        locationPointRepository.save(locationPoint);
        return "redirect:/";
    }
  
  
    //Mapping for the /edit/user URL to edit a user 
    @GetMapping("/editpickup/{id}")
    public String showPickupUpdateForm(@PathVariable("id") int id, Model model) {
    	LocationPoint locationPoint = locationPointRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("pickuppoint", locationPoint);
        return "update-pickuppoint";
    }
    
    //Mapping for the /update/id URL to update a user 
    @PostMapping("/updatepickup/{id}")
    public String updatePickupPoint(@PathVariable("id") int id, @Validated LocationPoint locationPoint, 
      BindingResult result, Model model) {
        if (result.hasErrors()) {
            locationPoint.setRouteId(id);
            return "update-pickuppoint";
        }
            
        locationPointRepository.save(locationPoint);
        return "redirect:/";
    }
    
    //Mapping for the /delete/id URL to delete a user     
    @GetMapping("/deletepickup/{id}")
    public String deletePickupPoint(@PathVariable("id") int id, Model model) {
    	LocationPoint locationPoint = locationPointRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid pickup Id:" + id));
        locationPointRepository.delete(locationPoint);
        return "redirect:/";
    }
    
/*   
    //Test loading all values in on page start.
    @RequestMapping({"/loadLocation"})
    public String loadLocations(@Validated LocationPoint locationPoint, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-pickuppoints";
        }
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("LocationPoint9-26-2022.xlsx");
		
		//Open the excel workbook and open the sheet that we need
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook(is);
			XSSFSheet sheet = workbook.getSheet("PickupPoint");
		    
		    //assign the number of rows equal to the last Row number so the loop knows where to stop
		    int rows=sheet.getLastRowNum();
	    
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

	        	LocationPoint newLocation = new LocationPoint();
	        	newLocation.insertData(id, latitude, longitude, locationPointName, roadName, distCost, timeCost, cost, mapped, routeId, isActive);
	        	locationPointRepository.save(newLocation);
	        }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//        locationPointRepository.save(locationPoint);
        model.addAttribute("locationpoints", locationPointRepository.findAll());
//        return "redirect:/";
        return "view-school";
    }
*/
}
