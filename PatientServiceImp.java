package MainPackage.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainPackage.Dao.PatientRepository;
import MainPackage.modle.Patient;

@Service
public class PatientServiceImp implements PatientService {

	@Autowired
    private PatientRepository patientRepo;
	@Override
	public Patient savePatient(Patient thePatient) {
		thePatient.getPatient_ID();
		thePatient.getPatient_name();
		thePatient.getPatient_email();
		thePatient.getPatient_date_Of_birth();
		thePatient.getPatient_gender();
		thePatient.getPatient_place_of_issue();
		thePatient.getPatient_status();
		return patientRepo.save(thePatient);
	}

	@Override
	public Patient updatePatient(Patient thePatient) {
         Optional<Patient> patients= patientRepo.findById(thePatient.getPatient_ID());
         if(patients.isPresent()) {
        	 thePatient.getPatient_name();
        	 thePatient.getPatient_email();
        	 thePatient.getPatient_date_Of_birth();
        	 thePatient.getPatient_gender();
        	 thePatient.getPatient_place_of_issue();
        	 thePatient.getPatient_status();
        	 
        	 return patientRepo.save(thePatient);
         }
         else {
        	 throw new IllegalArgumentException("ID Not Found");
         }
	
	}

	@Override
	public Patient deletePatient(Patient thePatient) {
	  
		 Optional<Patient> patients= patientRepo.findById(thePatient.getPatient_ID());
         if(patients.isPresent()) {
        	 
        	 Patient patient=patients.get();
        	 patientRepo.delete(patient);
        	 return patient;
         }
         else {
        	 throw new IllegalArgumentException("ID Not Found");
         }
	}

	@Override
	public Patient getPatient(Patient thePatient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllPatientNames() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
