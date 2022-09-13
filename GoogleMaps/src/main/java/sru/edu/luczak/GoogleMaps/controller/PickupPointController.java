package sru.edu.luczak.GoogleMaps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sru.edu.luczak.GoogleMaps.domain.PickupPoint;
import sru.edu.luczak.GoogleMaps.repository.PickupPointRepository;


@Controller
public class PickupPointController { 	

	//set up a UserRepositoty variable
	private PickupPointRepository pickupPointRepository;
    
	//create an UserRepository instance - instantiation (new) is done by Spring
    public PickupPointController(PickupPointRepository pickupPointRepository) {
		this.pickupPointRepository = pickupPointRepository;
	}
    
    //Mapping for the /index URL when initiated through Tomcat
    @RequestMapping({"/index"})
    public String showPickupPointList(Model model) {
        model.addAttribute("users", pickupPointRepository.findAll());
        return "index";
    }

    //Mapping for the /signup URL - calls the add-user HTML, to add a user
	@RequestMapping({"/signup"})
    public String showSignUpForm(PickupPoint pickupPoint) {
        return "add-pickup";
    }
    
	//Mapping for the /signup URL - to add a user
    @RequestMapping({"/addpickup"})
    public String addPickupPoint(@Validated PickupPoint pickupPoint, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-pickup";
        }
        
        pickupPointRepository.save(pickupPoint);
        return "redirect:/index";
    }
    
  
    //Mapping for the /edit/user URL to edit a user 
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
    	PickupPoint pickupPoint = pickupPointRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        
        model.addAttribute("Pickup Point", pickupPoint);
        return "update-pickup";
    }
    
    //Mapping for the /update/id URL to update a user 
    @PostMapping("/update/{id}")
    public String updatePickupPoint(@PathVariable("id") int id, @Validated PickupPoint pickupPoint, 
      BindingResult result, Model model) {
        if (result.hasErrors()) {
            pickupPoint.setId(id);
            return "update-pickup";
        }
            
        pickupPointRepository.save(pickupPoint);
        return "redirect:/index";
    }
    
    //Mapping for the /delete/id URL to delete a user     
    @GetMapping("/delete/{id}")
    public String deletePickupPoint(@PathVariable("id") int id, Model model) {
    	PickupPoint pickupPoint = pickupPointRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid pickup Id:" + id));
        pickupPointRepository.delete(pickupPoint);
        return "redirect:/index";
    }
}
