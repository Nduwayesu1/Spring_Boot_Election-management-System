package MainPackage.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MainPackage.modle.Security;

@Repository
public interface SecurityRepository extends JpaRepository<Security, String> {

}
