package MainPackage.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MainPackage.modle.Leaders;

@Repository
public interface LeaderRepository  extends JpaRepository<Leaders, String>{

}
