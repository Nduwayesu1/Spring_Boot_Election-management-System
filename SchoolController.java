package MainPackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import MainPackage.Service.SchoolService;
import MainPackage.modle.School;

@Controller
public class SchoolController {
	
	@Autowired
	private SchoolService theServices;
	@GetMapping("/saveSchool")
	public String getSchoolPage(@ModelAttribute("school")School theSchool,Model model) {
		return "saveSchool";
	}
	
	@PostMapping("/saveSchool")
	public String addSchool(@ModelAttribute("school")School theSchool,Model model) {
		theServices.saveSchool(theSchool);
		model.addAttribute("message", "Data Saved Succesfull");
		return "saveSchool";
	}

}
