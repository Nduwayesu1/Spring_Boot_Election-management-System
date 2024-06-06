package MainPackage.Service;
import java.util.List;

import org.springframework.data.domain.Page;
import MainPackage.modle.Votes;

public interface Voting_Service {
	
 public Votes saveVote(Votes vote);
 public List<Votes> getVoting_Results();
 public Page<Votes> findPaginated(int pageNo,int pageSize);

 

}
