package MainPackage.modle;

import java.time.LocalDate;

import jakarta.persistence.*;
@Entity
public class Patient {
	@Id
    @Column(name = "patient_ID", length = 12)
	private String patient_ID;
	private String patient_name;
	 @Column(name = "patient_email", unique = true)
	private String patient_email;
	private String patient_password;
	private LocalDate patient_date_Of_birth;
	private String patient_gender;
	private String patient_place_of_issue;
	private String patient_status;
	@ManyToOne
	@JoinColumn(name="candidate_id")
    private Candidates candidates;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String patient_ID, String patient_name, String patient_email, String patient_password,
			LocalDate patient_date_Of_birth, String patient_gender, String patient_place_of_issue,
			String patient_status, Candidates candidates) {
		super();
		this.patient_ID = patient_ID;
		this.patient_name = patient_name;
		this.patient_email = patient_email;
		this.patient_password = patient_password;
		this.patient_date_Of_birth = patient_date_Of_birth;
		this.patient_gender = patient_gender;
		this.patient_place_of_issue = patient_place_of_issue;
		this.patient_status = patient_status;
		this.candidates = candidates;
	}
	public String getPatient_ID() {
		return patient_ID;
	}
	public void setPatient_ID(String patient_ID) {
		this.patient_ID = patient_ID;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPatient_email() {
		return patient_email;
	}
	public void setPatient_email(String patient_email) {
		this.patient_email = patient_email;
	}
	public String getPatient_password() {
		return patient_password;
	}
	public void setPatient_password(String patient_password) {
		this.patient_password = patient_password;
	}
	public LocalDate getPatient_date_Of_birth() {
		return patient_date_Of_birth;
	}
	public void setPatient_date_Of_birth(LocalDate patient_date_Of_birth) {
		this.patient_date_Of_birth = patient_date_Of_birth;
	}
	public String getPatient_gender() {
		return patient_gender;
	}
	public void setPatient_gender(String patient_gender) {
		this.patient_gender = patient_gender;
	}
	public String getPatient_place_of_issue() {
		return patient_place_of_issue;
	}
	public void setPatient_place_of_issue(String patient_place_of_issue) {
		this.patient_place_of_issue = patient_place_of_issue;
	}
	public String getPatient_status() {
		return patient_status;
	}
	public void setPatient_status(String patient_status) {
		this.patient_status = patient_status;
	}
	public Candidates getCandidates() {
		return candidates;
	}
	public void setCandidates(Candidates candidates) {
		this.candidates = candidates;
	}
	
	
	

}
