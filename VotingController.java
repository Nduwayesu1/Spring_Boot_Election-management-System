package MainPackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import MainPackage.Service.Voting_Service;
import MainPackage.modle.AppUsers;
import MainPackage.modle.Votes;

@Controller
public class VotingController {
    @Autowired
	private Voting_Service voteService;
	@GetMapping("/votes")
	public String getVote_Page(@ModelAttribute("voting") Votes vote,Model model) {
		
		return "VotingPage";
	}
	
	@PostMapping("/votes")
	public String perform_Voting(@ModelAttribute("voting") Votes vote,Model model) {
		try {
			voteService.saveVote(vote);
				model.addAttribute("message", "Candidate Voted Succesfull ");
				return "VotingPage";
		 }catch(Exception ex) {
			 return "ErrorPage";
		 }
	}
	

	

	@GetMapping("/votingList/{pageNo}")
	   public String getUserers(@PathVariable (value = "pageNo") int pageNo,
			  
			  
			   Model model) {
		   try {
			   int pageSize=7;
			   Page<Votes> pages=voteService.findPaginated(pageNo, pageSize);
			   //List of Votrs From page object
			   List<Votes> vooteList=pages.getContent();
			   model.addAttribute("currentPage", pageNo);
			   model.addAttribute("totolpages", pages.getTotalPages());
			   model.addAttribute("totalItems", pages.getTotalElements());
			   
			  
			   
			   model.addAttribute("VoteList", vooteList);
			  
			   
//	           @SuppressWarnings("unchecked")
//				List<Votes> userList =voteService.getVoting_Results();
//	           model.addAttribute("voteList", userList);
//	           model.addAttribute("message", "Data retrieved successfully");
	           return "VotingList";
	       } catch (Exception e) {
	           model.addAttribute("error", "Error retrieving users: " + e.getMessage());
	           return "errorPage"; // Return an error page or appropriate view
	       }
	  
	    }
	
	
	
}
	   


	

