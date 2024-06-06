package MainPackage.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import MainPackage.modle.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {
	@Query("SELECT p.patient_name FROM Patient p")
    String findByCandidate_names(String patient_name);
}
