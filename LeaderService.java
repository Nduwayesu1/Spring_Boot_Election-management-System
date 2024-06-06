package MainPackage.Service;

import java.util.List;

import MainPackage.modle.Leaders;

public interface LeaderService {

	public Leaders saveLeader(Leaders theLeaders);
	public Leaders updateLeaders(Leaders theLeaders);
	public Leaders deleLeaders(Leaders theLeaders);
	public List<Leaders> getLeaders();
}
