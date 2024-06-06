package MainPackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import MainPackage.Service.DiasporaService;
import MainPackage.modle.Diaspora;

@Controller
public class DiasporaController {
	
	
	
	public DiasporaController(DiasporaService theService) {
		super();
		this.theService = theService;
	}
	@Autowired
	private DiasporaService theService;
	@GetMapping("/addDiaspora")
	public String getDiasPoraPage(@ModelAttribute("diaspora") Diaspora tehDiaspora,Model model) {
		
		return "addDiaspora";
	}
	
	@PostMapping("/addDiaspora")
	public String addDiaspora(@ModelAttribute("diaspora") Diaspora theDiaspora,Model model) {
		
		theService.saveDiaspora(theDiaspora);
		model.addAttribute("message", "Data Saved Succesful");
		return "addDiaspora";
	}
	
	@GetMapping("/updateDiaspora")
	public String getUpdate(@ModelAttribute("diaspora") Diaspora tehDiaspora,Model model) {
		
		return "updateDiaspora";
	}
	
	@PostMapping("/updateDiaspora")
	public String updateDiaspora(@ModelAttribute("diaspora") Diaspora theDiaspora,Model model) {
		
		try {
			 theService.updateDiaspora(theDiaspora);
			 model.addAttribute("message", "Diaspora Updated Successfully");
			 return "updateDiaspora";
		 }catch(Exception e) {
			 // Handle other exceptions
	            model.addAttribute("error", "An unexpected error occurred");
	            return "ErrorPage";
		 }
	}
	
	@GetMapping("/deleteDiaspora")
	public String getDelete(@ModelAttribute("diaspora") Diaspora tehDiaspora,Model model) {
		
		return "deleteDiaspora";
	}
	
	@PostMapping("/deleteDiaspora")
	public String deleteDiaspora(@ModelAttribute("diaspora") Diaspora theDiaspora,Model model) {
		
		 try {
			 theService.deleDiaspora(theDiaspora);
			 model.addAttribute("message", "Diaspora Deleted Successfully");
			 return "deleteDiaspora";
		 }catch(Exception e) {
			 // Handle other exceptions
	            model.addAttribute("error", "An unexpected error occurred");
	            return "ErrorPage";
		 }
	}
	@PostMapping("/sendDiaspora")
	public String sendEmail(@RequestParam(value = "file",required = false)MultipartFile[]file,String receiver,String [] cc,String subject,String body) {
   	 
   	 return theService.sendEmail(file, receiver, cc, subject, body);
    }
	
	
	@GetMapping("/login")
    public String getLoginPage(@ModelAttribute("loginRequest") Diaspora loginRequest, Model model) {
        // Add any necessary model attributes for the login page
        return "login";
    }

	

	

}
