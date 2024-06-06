package MainPackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import MainPackage.Service.CandidateService;
import MainPackage.modle.Candidates;

@Controller
public class CandidateController {
	@Autowired
	private CandidateService theService;
	@GetMapping("/saveCandidate")
	public String getCandidatePage(@ModelAttribute("candidate") Candidates theCandidate,Model model) {
		
		return "registerCandidate";
	}

	 @PostMapping("/saveCandidate")
	public String addCandidate(@ModelAttribute("candidate") Candidates theCandidate,Model model) {
		
		theService.saveCandidate(theCandidate);
		model.addAttribute("message", "Candidate Succesful Saved");
		return "registerCandidate";
	}
	 @GetMapping("/editCandidate")
	 public String editPage(@ModelAttribute("candidate") Candidates theCandidate,Model model) {
		 
		 return "updateCandidate";
		 
	 }
	 @PostMapping("/editCandidate")
	    public String editCandidate(@ModelAttribute("candidate") Candidates theCandidate, Model model) {
	        try {
	            theService.updateCandidates(theCandidate);
	            model.addAttribute("message", "Candidate Updated Successfully");
	            return "updateCandidate";
	        } catch (Exception e) {
	            // Handle other exceptions
	            model.addAttribute("error", "An unexpected error occurred");
	            return "ErrorPage"; // Return the error page
	        }
	    }
	 
	 @GetMapping("/deleteCandidate")
	 public String deletePage(@ModelAttribute("candidate") Candidates theCandidate,Model model) {
		 
		 return "deleteCandidate";
		 
	 }
	 @PostMapping("/deleteCandidate")
	 public String deleteCandidate(@ModelAttribute("candidate") Candidates theCandidate,Model model) {
		 try {
			 theService.deleteCandidates(theCandidate);
			 model.addAttribute("message", "Candidate Deleted Successfully");
			 return "deleteCandidate";
		 }catch(Exception e) {
			 // Handle other exceptions
	            model.addAttribute("error", "An unexpected error occurred");
			    return null;
		 }
		 
	 }
}
