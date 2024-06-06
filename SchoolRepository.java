package MainPackage.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MainPackage.modle.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, String>{

}
