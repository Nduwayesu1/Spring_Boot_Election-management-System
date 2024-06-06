package MainPackage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainPackage.Dao.SchoolRepository;
import MainPackage.modle.School;

@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolRepository schoolRepo;
	@Override
	public School saveSchool(School theSchool) {
		theSchool.getSchool_Id();
		theSchool.getSchool_name();
		theSchool.getSchool_email();
		theSchool.getSchool_location();
		return schoolRepo.save(theSchool);
	}

	@Override
	public List<School> getSchool() {
		// TODO Auto-generated method stub
		return null;
	}


}
