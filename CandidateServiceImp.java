package MainPackage.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainPackage.Dao.CandidateRepository;
import MainPackage.modle.Candidates;

@Service
public class CandidateServiceImp  implements CandidateService{

	@Autowired
	private CandidateRepository candidateRepo;
	@Override
	public Candidates saveCandidate(Candidates theCandidate) {
		theCandidate.getCandidate_id();
		theCandidate.getCandidate_names();
		theCandidate.getCandidate_email();
		return candidateRepo.save(theCandidate);
	}

	@Override
	public Candidates updateCandidates(Candidates theCandidate) {
		
		// get ID of theCandidate object or from the form
		Optional<Candidates> Candidate=candidateRepo.findById(theCandidate.getCandidate_id());
		// check if the ID Exit in the database
		if(Candidate.isPresent()) {
			theCandidate.getCandidate_names();
			theCandidate.getCandidate_email();
			// save the changes
			return candidateRepo.save(theCandidate);
		} else {
			 throw new IllegalArgumentException("Candidate with the given ID not found");
		}
		 
		
	}

	@Override
	public Candidates deleteCandidates(Candidates theCandidates) {
		// get ID of theCandidate object or from the form
		Optional<Candidates> Candidate=candidateRepo.findById(theCandidates.getCandidate_id());
		if(Candidate.isPresent()) {
			
			Candidates candidate=Candidate.get();
			candidateRepo.delete(candidate);
			// return the deleted user
			return candidate;
		}
		else {
	        // If the Candidate  with the given ID doesn't exist, handle it as needed
	        throw new IllegalArgumentException("User with the given ID not found");
	    }
	}

	@Override
	public Candidates getCandidate() {
		// TODO Auto-generated method stub
		return null;
	}

}
