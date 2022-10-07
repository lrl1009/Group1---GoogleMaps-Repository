package sru.edu.luczak.GoogleMaps.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import sru.edu.luczak.GoogleMaps.domain.LocationPoint;
import sru.edu.luczak.GoogleMaps.domain.Schools;
import sru.edu.luczak.GoogleMaps.domain.Students;
import sru.edu.luczak.GoogleMaps.repository.LocationPointRepository;
import sru.edu.luczak.GoogleMaps.repository.SchoolRepository;
import sru.edu.luczak.GoogleMaps.repository.StudentRepository;

@Controller
public class GoogleMapsController {
	
	//set up Repository variables
		private LocationPointRepository locationPointRepository;
		private StudentRepository studentRepository;
		private SchoolRepository schoolRepository;
		
		//create an UserRepository instance - instantiation (new) is done by Spring
	    public GoogleMapsController(LocationPointRepository locationPointRepository, StudentRepository studentRepository, SchoolRepository schoolRepository) {
			this.locationPointRepository = locationPointRepository;
			this.studentRepository = studentRepository;
			this.schoolRepository = schoolRepository;
		}
	    
	    @RequestMapping({"", "/index"})
  		public String requestData() {
	    	return "index";
  		}
	    
	    @RequestMapping({"/createStudent"})
  		public String showCreateStudentForm(Students student) {
  			return "create-student";
  		}
	    
	    //Mapping for the /signup URL - to add a user
	    @RequestMapping({"/addStudent"})
	    public String addStudent(@Validated Students student, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            return "index";
	        }
	        studentRepository.save(student);
	        return "redirect:index";
	    }
	    
	    @RequestMapping({"/viewStudents"})
  		public String showStudents(Model model) {
	    	model.addAttribute("students", studentRepository.findAll());
  			return "view-students";
  		}
	    
	    @RequestMapping({"/viewSchool"})
	    public String showSchools(Model model) {
	    	model.addAttribute("schools", schoolRepository.findAll());
	    	return "view-school";
	    }
	    
	    @RequestMapping({"/createSchool"})
	    public String showCreateSchoolForm(Schools school) {
	        return "create-school";
	    }
	    
	    @RequestMapping({"/addSchool"})
	    public String addSchool(@Validated Schools school, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            return "index";
	        }
	        schoolRepository.save(school);
	        return "redirect:index";
	    }
	    

}
