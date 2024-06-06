package MainPackage.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import MainPackage.Dao.CandidateRepository;
import MainPackage.Dao.PatientRepository;
import MainPackage.Dao.VotingRepository;
import MainPackage.modle.Candidates;
import MainPackage.modle.Patient;
import MainPackage.modle.Votes;

@Service
public class Voting_Service_Impl implements Voting_Service {
  
    @Autowired
    private VotingRepository theRepo;
    
    @Autowired
    private PatientRepository patientRepo;
    
    @Autowired
    private CandidateRepository candidateRepo;
    
    @Override
    @Transactional
    public Votes saveVote(Votes vote) {
        if (vote.getVote_status().equals("Patient")) {
            Integer voices = 1;
            // Fetch patient information
         
                // Fetch candidate information based on the ID provided in the vote object
               Patient thePatient= new Patient();
               if(vote.getCitizen_Id().equals(thePatient.getPatient_ID()))
                 vote.getCandidate_name();
                 vote.setVoice(voices);
                 vote.getVotes_date();
                 theRepo.save(vote);
                
            } 
       
         else if (vote.getVote_status().equals("Diaspora")) {
            // Implement saving for Diaspora
        	 Integer voices = 2;
             // Fetch patient information
          
                 // Fetch candidate information based on the ID provided in the vote object
                Patient thePatient= new Patient();
                if(vote.getCitizen_Id().equals(thePatient.getPatient_ID()))
                  vote.getCandidate_name();
                  vote.setVoice(voices);
                  vote.getVotes_date();
                  theRepo.save(vote);
        } else if (vote.getVote_status().equals("Security")) {
            // Implement saving for Security
        } else if (vote.getVote_status().equals("Leaders")) {
            // Implement saving for Leaders
        } else {
            // Handle other cases
        }
        return null;
    }


    @Override
    public List<Votes> getVoting_Results() {
        
        return theRepo.findAll();
    }


   @Override
	public Page<Votes> findPaginated(int pageNo, int pageSize) {
		
       
		// creating an object of pageable interface
		Pageable myPages=PageRequest.of(pageNo-1, pageSize);
		return theRepo.findAll(myPages);
	}
}
