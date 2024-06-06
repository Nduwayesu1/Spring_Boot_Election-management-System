package MainPackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import MainPackage.Service.PatientService;
import MainPackage.modle.Patient;

@Controller
public class PatientController {
	
	@Autowired
	private PatientService theService;
	@GetMapping("/savePatient")
	public String getpatientForm(@ModelAttribute("patient") Patient thePatient,Model model) {
		
		return "addPatient";
	}
	
	@PostMapping("/savePatient")
	public String registerPatient(@ModelAttribute("patient") Patient thePatient,Model model) {
		
		theService.savePatient(thePatient);
		model.addAttribute("message", "Patient Succesful Saved");
		
		return "addPatient";
	}
	@GetMapping("/editPatient")
    public String updateForm(@ModelAttribute("patient") Patient thePatient,Model model) {
		
		return "updatePatient";
	}
	
	@PostMapping("/editPatient")
	public String updatePatient(@ModelAttribute("patient") Patient thePatient,Model model) {
	  try {
			
			theService.savePatient(thePatient);
			model.addAttribute("message", "Patient Updated Succesful");
			
			return "updatePatient";
	  }catch(Exception ex) {
		  model.addAttribute("message", "Something Went Wrong");
		  return "ErrorPage";
	  }
	}
	@GetMapping("/deletePatient")
    public String deleteForm(@ModelAttribute("patient") Patient thePatient,Model model) {
		
		return "deletePatient";
	}
	
	@PostMapping("/deletePatient")
	public String deletePatient(@ModelAttribute("patient") Patient thePatient,Model model) {
	  try {
			
			theService.deletePatient(thePatient);
			model.addAttribute("message", "Patient Deleted Succesful");
			
			return "deletePatient";
	  }catch(Exception ex) {
		  model.addAttribute("message", "Something Went Wrong");
		  return "ErrorPage";
	  }
	}
	
}
