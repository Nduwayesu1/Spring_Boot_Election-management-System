package MainPackage.Service;

import java.util.List;

import MainPackage.modle.Patient;

public interface PatientService {

	public Patient savePatient(Patient thePatient);
	public Patient updatePatient(Patient thePatient);
	public Patient deletePatient(Patient thePatient);
	public Patient getPatient(Patient thePatient);
	public List<String> getAllPatientNames() ;
      
   
}
