package MainPackage.modle;

import java.time.LocalDate;

import jakarta.persistence.*;
@Entity
public class Students {
	@Id

	private String Student_ID;
	private String student_name;
	private String student_email;
	private String student_password;
	private LocalDate Student_date_Of_birth;
	private String Student_gender;
	private String Student_place_of_issue;
	private String Student_status;
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidates thecandidates;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String student_ID, String student_name, String student_email, String student_password,
			LocalDate student_date_Of_birth, String student_gender, String student_place_of_issue,
			String student_status, Candidates thecandidates) {
		super();
		Student_ID = student_ID;
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_password = student_password;
		Student_date_Of_birth = student_date_Of_birth;
		Student_gender = student_gender;
		Student_place_of_issue = student_place_of_issue;
		Student_status = student_status;
		this.thecandidates = thecandidates;
	}
	public String getStudent_ID() {
		return Student_ID;
	}
	public void setStudent_ID(String student_ID) {
		Student_ID = student_ID;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	public LocalDate getStudent_date_Of_birth() {
		return Student_date_Of_birth;
	}
	public void setStudent_date_Of_birth(LocalDate student_date_Of_birth) {
		Student_date_Of_birth = student_date_Of_birth;
	}
	public String getStudent_gender() {
		return Student_gender;
	}
	public void setStudent_gender(String student_gender) {
		Student_gender = student_gender;
	}
	public String getStudent_place_of_issue() {
		return Student_place_of_issue;
	}
	public void setStudent_place_of_issue(String student_place_of_issue) {
		Student_place_of_issue = student_place_of_issue;
	}
	public String getStudent_status() {
		return Student_status;
	}
	public void setStudent_status(String student_status) {
		Student_status = student_status;
	}
	public Candidates getThecandidates() {
		return thecandidates;
	}
	public void setThecandidates(Candidates thecandidates) {
		this.thecandidates = thecandidates;
	}
	
	

}
