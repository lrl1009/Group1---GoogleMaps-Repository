package sru.edu.luczak.GoogleMaps.controller;

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
	
	//This method calls the select-school HTML file to guide the user through UI
		@RequestMapping({"/"})
		public String requestData() {
			return "select-school";
		}
		
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

}
