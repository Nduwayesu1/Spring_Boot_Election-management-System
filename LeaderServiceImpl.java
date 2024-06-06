package MainPackage.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainPackage.Dao.LeaderRepository;
import MainPackage.modle.Leaders;

@Service
public class LeaderServiceImpl implements LeaderService{

	@Autowired
	private LeaderRepository leadersRepo;
	@Override
	public Leaders saveLeader(Leaders theLeaders) {
		theLeaders.getR_ID();
		theLeaders.getR_name();
		theLeaders.getR_email();
		theLeaders.getR_date_Of_birth();
		theLeaders.getR_gender();
		theLeaders.getR_place_of_issue();
		theLeaders.getR_status();
		return leadersRepo.save(theLeaders);
	}

	@Override
	public Leaders updateLeaders(Leaders theLeaders) {
		Optional<Leaders> myLeaders=leadersRepo.findById(theLeaders.getR_ID());
		if(myLeaders.isPresent()) {
			theLeaders.getR_name();
			theLeaders.getR_email();
			theLeaders.getR_place_of_issue();
			theLeaders.getR_gender();
			theLeaders.getR_place_of_issue();
			theLeaders.getR_status();
			return leadersRepo.save(theLeaders);
		}else {
			throw new IllegalArgumentException("ID Not Found");
		}
		
	}

	@Override
	public Leaders deleLeaders(Leaders theLeaders) {
		Optional<Leaders> myLeaders=leadersRepo.findById(theLeaders.getR_ID());
		if(myLeaders.isPresent()) {
			Leaders leader=myLeaders.get();
			leadersRepo.delete(leader);
			return leader;
		}else {
			throw new IllegalArgumentException("Id Not Found");
		}
	
	}

	@Override
	public List<Leaders> getLeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
