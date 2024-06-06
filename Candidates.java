package MainPackage.modle;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Candidates {
 @Id
 private String candidate_id;
 private String candidate_names;
 private String candidate_email;
 @OneToMany(mappedBy = "candidates")
 private List<Patient> patients;
 @OneToMany(mappedBy = "theCandidate")
 private List<Diaspora> diaspors;
 @OneToMany(mappedBy ="theCandidates")
 private List<Leaders> theLeader;
 @OneToMany(mappedBy ="theCandidates") 
 private List<Security> securities;
 @OneToMany(mappedBy = "thecandidates")
 private List<School> schools;
 @OneToMany(mappedBy = "thecandidates")
 private List<Students> student;
public Candidates() {
	super();
	// TODO Auto-generated constructor stub
}
public Candidates(String candidate_id, String candidate_names, String candidate_email, List<Patient> patients,
		List<Diaspora> diaspors, List<Leaders> theLeader, List<Security> securities, List<School> schools,
		List<Students> student) {
	super();
	this.candidate_id = candidate_id;
	this.candidate_names = candidate_names;
	this.candidate_email = candidate_email;
	this.patients = patients;
	this.diaspors = diaspors;
	this.theLeader = theLeader;
	this.securities = securities;
	this.schools = schools;
	this.student = student;
}
public String getCandidate_id() {
	return candidate_id;
}
public void setCandidate_id(String candidate_id) {
	this.candidate_id = candidate_id;
}
public String getCandidate_names() {
	return candidate_names;
}
public void setCandidate_names(String candidate_names) {
	this.candidate_names = candidate_names;
}
public String getCandidate_email() {
	return candidate_email;
}
public void setCandidate_email(String candidate_email) {
	this.candidate_email = candidate_email;
}
public List<Patient> getPatients() {
	return patients;
}
public void setPatients(List<Patient> patients) {
	this.patients = patients;
}
public List<Diaspora> getDiaspors() {
	return diaspors;
}
public void setDiaspors(List<Diaspora> diaspors) {
	this.diaspors = diaspors;
}
public List<Leaders> getTheLeader() {
	return theLeader;
}
public void setTheLeader(List<Leaders> theLeader) {
	this.theLeader = theLeader;
}
public List<Security> getSecurities() {
	return securities;
}
public void setSecurities(List<Security> securities) {
	this.securities = securities;
}
public List<School> getSchools() {
	return schools;
}
public void setSchools(List<School> schools) {
	this.schools = schools;
}
public List<Students> getStudent() {
	return student;
}
public void setStudent(List<Students> student) {
	this.student = student;
}

 
}
