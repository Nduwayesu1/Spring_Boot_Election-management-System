package MainPackage.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MainPackage.modle.Diaspora;

@Repository
public interface DiasporaRepository  extends JpaRepository<Diaspora, String>{
	


}
