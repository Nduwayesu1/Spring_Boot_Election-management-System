package MainPackage.Service;

import java.util.List;

import MainPackage.modle.Students;

public interface StudentService {
   public Students saveStudent(Students theStudents);
   public Students updateStudents(Students theStudents);
   public Students deleteStudent(Students theStudents);
   public List<Students> getAllStudents();
}
