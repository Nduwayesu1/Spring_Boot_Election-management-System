package MainPackage.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainPackage.Dao.SecurityRepository;
import MainPackage.modle.Security;

@Service
public class SecuritySericeImpl implements SecurityService {

	@Autowired
	private SecurityRepository securityRepo;
	@Override
	public Security saveSecurity(Security theSecurity) {
		theSecurity.getSecurity_id();
		theSecurity.getSecurity_name();
		theSecurity.getSecurity_email();
		theSecurity.getSecurity_date_Of_birth();
		theSecurity.getSecurity_gender();
		theSecurity.getSecurity_place_of_issue();
		theSecurity.getSecurity_status();
		return securityRepo.save(theSecurity);
	}

	@Override
	public Security upSecurity(Security theSecurity) {
	   Optional<Security> security=securityRepo.findById(theSecurity.getSecurity_id());
	   if(security.isPresent()) {
		   theSecurity.getSecurity_name();
		   theSecurity.getSecurity_email();
		   theSecurity.getSecurity_date_Of_birth();
		   theSecurity.getSecurity_gender();
		   theSecurity.getSecurity_place_of_issue();
		   theSecurity.getSecurity_status();
		   return securityRepo.save(theSecurity);
	   }else {
		   throw new IllegalArgumentException("ID Not Found");
	   }

	}

	@Override
	public Security deSecurity(Security theSecurity) {
	     Optional<Security> security=securityRepo.findById(theSecurity.getSecurity_id());
	     if(security.isPresent()) {
	    	 Security security_id=security.get();
	    	 securityRepo.delete(security_id);
	    	 return security_id;
	     }else {
	    	 throw new IllegalArgumentException("ID Not Found");
	     }
	}

	@Override
	public List<Security> getSecurity() {
		// TODO Auto-generated method stub
		return null;
	}

}
