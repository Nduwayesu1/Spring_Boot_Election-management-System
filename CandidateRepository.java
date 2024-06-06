package MainPackage.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import MainPackage.modle.Candidates;

@Repository
public interface CandidateRepository extends JpaRepository<Candidates, String>{
	 @Query("SELECT c.candidate_names FROM Candidates c WHERE c.candidate_id = :candidateId")
	String findByCandidateId(@Param("candidateId") String candidateId);


}
