package MainPackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import MainPackage.Service.LeaderService;
import MainPackage.modle.Leaders;

@Controller
public class LeaderControlller {
	
	@Autowired
	private LeaderService LeaderService;
	@GetMapping("/saveLeaders")
	public String getLeadrePage(@ModelAttribute("Leader") Leaders theLeaders,Model model) {
		
		return "registerLeader";
	}
	
	@PostMapping("/saveLeaders")
	public String addLeader(@ModelAttribute("Leader") Leaders theLeaders,Model model) {
		
		LeaderService.saveLeader(theLeaders);
		model.addAttribute("message", "Data Saved Succesful");
		return "registerLeader";
	}
	
	@GetMapping("/updateLeaders")
	public String getUpdatePage(@ModelAttribute("Leader") Leaders theLeaders,Model model) {
		
		return "updateLeaders";
	}
	
	@PostMapping("/updateLeaders")
	public String updateLeader(@ModelAttribute("Leader") Leaders theLeaders,Model model) {
		
		 try {
			 LeaderService.saveLeader(theLeaders);
			 model.addAttribute("message", "Data Updated Succesful");
			 return "updateLeaders";
		 }catch(Exception ex) {
			 model.addAttribute("error", "An unexpected error occurred");
	         return "ErrorPage"; // Return the error page
		 }
	}
	
	
	@GetMapping("/deleteLeader")
	public String getDeletePage(@ModelAttribute("Leader") Leaders theLeaders,Model model) {
		
		return "deleteLeaders";
	}
	
	@PostMapping("/deleteLeader")
	public String deleteLeader(@ModelAttribute("Leader") Leaders theLeaders,Model model) {
		
		 try {
			 LeaderService.deleLeaders(theLeaders);
			 model.addAttribute("message", "Data Deleted Succesful");
			 return "deleteLeaders";
		 }catch(Exception ex) {
			 model.addAttribute("error", "An unexpected error occurred");
	         return "ErrorPage"; // Return the error page
		 }
	}
	
	
	

}
