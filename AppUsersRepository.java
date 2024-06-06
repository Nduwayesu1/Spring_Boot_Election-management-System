package MainPackage.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import MainPackage.modle.AppUsers;


import java.util.List;

@Repository
public interface AppUsersRepository extends JpaRepository<AppUsers, Long> {

	AppUsers findByUsername(String username); 
	AppUsers findByrole(String role);
	

}
