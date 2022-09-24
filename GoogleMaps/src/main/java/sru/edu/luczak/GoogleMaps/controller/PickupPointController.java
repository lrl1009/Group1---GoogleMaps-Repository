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
	private LocationPointRepository pickupPointRepository;
	
	//create an UserRepository instance - instantiation (new) is done by Spring
    public PickupPointController(LocationPointRepository pickupPointRepository) {
		this.pickupPointRepository = pickupPointRepository;
	}
	
	//This method calls the select-school HTML file to guide the user through UI
		@RequestMapping({"/"})
		public String requestData() {
			return "select-school";
		}
		
		//This method creates attribute pickuppoints and digs up the repo info
		@RequestMapping({"/pickupPoints"})
		public String showData(Model model) {
			model.addAttribute("pickuppoints", pickupPointRepository.findAll());
			return "view-school"; //view-school prints the database data
		}
/*		
		//Mapping for the /signup URL - calls the add-user HTML, to add a user
		@PostMapping(path="/createpickup") // Map ONLY POST Requests
		  public @ResponseBody String showPickupForm (@RequestParam int id, @RequestParam float latitude, 
				  @RequestParam float longitude, @RequestParam String pickupPointName, 
				  @RequestParam String roadName, @RequestParam int studentCount) {
		    // @ResponseBody means the returned String is the response, not a view name
		    // @RequestParam means it is a parameter from the GET or POST request

			//PickupPoint pickupPoint = new PickupPoint();
		    //User n = new User(12, "Dave");
		    //n.setName(name);
		    //n.setEmail(email);
		    //pickupPointRepository.save(pickupPoint);
		    return "add-pickuppoints";
		  }
	    
		//Mapping for the /signup URL - to add a user
	    @RequestMapping({"/addpickup"})
	    public String addPickupPoint(@Validated PickupPoint pickupPoint, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            return "add-pickuppoints";
	        }
	        pickupPointRepository.save(pickupPoint);
	        return "redirect:/";
	    }
*/	    
/*
		@RequestMapping("/new")
		public String showNewPickupPage(Model model) {
			PickupPoint pickupPoint = new PickupPoint();
		    model.addAttribute("pickupPoint", pickupPoint);
		    return "add-pickuppoints";
		}
		
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveProduct(@ModelAttribute("pickupPoint") PickupPoint pickupPoint) {
			pickupPointRepository.save(pickupPoint);
		    return "redirect:/";
		}
*/		
		/*
		//using CRUD to create a new pickuppoint
		@RequestMapping("/createpickup")
		public String showNewPickupPage(Model model) {
			PickupPoint pickupPoint = new PickupPoint();
		    model.addAttribute("pickuppoints", pickupPoint);
		    model.addAttribute("pickuppoints", pickupPointRepository.findAll());
		    return "add-pickuppoints";
		}
		
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveProduct(@ModelAttribute("pickupPoint") PickupPoint pickupPoint) {
			pickupPointRepository.save(pickupPoint);
		    return "redirect:/index";
		}
*/		


    //Mapping for the /signup URL - calls the add-user HTML, to add a user
	@RequestMapping({"/createpickup"})
    public String showCreatePickupForm(LocationPoint pickupPoint) {
        return "add-pickuppoints";
    }
    
	//Mapping for the /signup URL - to add a user
    @RequestMapping({"/addpickup"})
    public String addPickupPoint(@Validated LocationPoint pickupPoint, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-pickuppoints";
        }
        pickupPointRepository.save(pickupPoint);
        return "redirect:/";
    }
  
  
    //Mapping for the /edit/user URL to edit a user 
    @GetMapping("/editpickup/{id}")
    public String showPickupUpdateForm(@PathVariable("id") int id, Model model) {
    	LocationPoint pickupPoint = pickupPointRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("pickuppoint", pickupPoint);
        return "update-pickuppoint";
    }
    
    //Mapping for the /update/id URL to update a user 
    @PostMapping("/updatepickup/{id}")
    public String updatePickupPoint(@PathVariable("id") int id, @Validated LocationPoint pickupPoint, 
      BindingResult result, Model model) {
        if (result.hasErrors()) {
            pickupPoint.setId(id);
            return "update-pickuppoint";
        }
            
        pickupPointRepository.save(pickupPoint);
        return "redirect:/";
    }
    
    //Mapping for the /delete/id URL to delete a user     
    @GetMapping("/deletepickup/{id}")
    public String deletePickupPoint(@PathVariable("id") int id, Model model) {
    	LocationPoint pickupPoint = pickupPointRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid pickup Id:" + id));
        pickupPointRepository.delete(pickupPoint);
        return "redirect:/";
    }
    
    /*   
    //Mapping for the /index URL when initiated through Tomcat
    @RequestMapping({"/index"})
    public String showPickupPointList(Model model) {
        model.addAttribute("users", pickupPointRepository.findAll());
        return "index";
    }
*/
}
