package MainPackage.Service;

import java.util.List;

import MainPackage.modle.Security;

public interface SecurityService {
	
	
	public Security saveSecurity(Security theSecurity);
	public Security upSecurity(Security theSecurity);
	public Security deSecurity(Security theSecurity);
	public List<Security> getSecurity();

}
