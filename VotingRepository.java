package MainPackage.Dao;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MainPackage.modle.AppUsers;
import MainPackage.modle.Votes;
@Repository
public interface VotingRepository extends JpaRepository<Votes, Integer> {





}
