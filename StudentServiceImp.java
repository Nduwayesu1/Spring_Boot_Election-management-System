package MainPackage.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainPackage.Dao.StudentRepository;
import MainPackage.modle.Students;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired 
	private StudentRepository studentRepo;
	@Override
	public Students saveStudent(Students theStudents) {
		
		theStudents.getStudent_ID();
		theStudents.getStudent_name();
		theStudents.getStudent_email();
		theStudents.getStudent_date_Of_birth();
		theStudents.getStudent_gender();
		theStudents.getStudent_place_of_issue();
		theStudents.getStudent_status();
		return studentRepo.save(theStudents);
	}

	@Override
	public Students updateStudents(Students theStudents) {
		Optional<Students> student=studentRepo.findById(theStudents.getStudent_ID());
		if(student.isPresent()) {
			theStudents.getStudent_name();
			theStudents.getStudent_email();
			theStudents.getStudent_date_Of_birth();
			theStudents.getStudent_gender();
			theStudents.getStudent_place_of_issue();
			theStudents.getStudent_status();
			return studentRepo.save(theStudents);
		}else {
			throw new IllegalArgumentException("ID Not Found");
		}
		
	}

	@Override
	public Students deleteStudent(Students theStudents) {
		  Optional<Students> students= studentRepo.findById(theStudents.getStudent_ID());
		  if(students.isPresent()) {
			 Students student_Id= students.get();
			 studentRepo.delete(student_Id); 
			 return student_Id;
		  }else {
			  throw new IllegalArgumentException("ID Not Found");
		  }
	}

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
