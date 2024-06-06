package MainPackage.Service;

import java.util.List;

import MainPackage.modle.School;

public interface SchoolService {


	public School saveSchool(School theSchool);
	public List<School> getSchool();
}
