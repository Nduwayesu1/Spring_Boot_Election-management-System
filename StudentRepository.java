package MainPackage.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MainPackage.modle.Students;
@Repository
public interface StudentRepository  extends JpaRepository<Students, String>{

}
