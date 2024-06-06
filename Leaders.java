package MainPackage.modle;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Leaders {
	@Id
	private String R_ID;
	private String R_name;
	private String R_email;
	private String password;
	private LocalDate R_date_Of_birth;
	private String R_gender;
	private String R_place_of_issue;
	private String R_status;
	@ManyToOne
	@JoinColumn(name="candidate_id")
    private Candidates theCandidates;
	public Leaders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leaders(String r_ID, String r_name, String r_email, String password, LocalDate r_date_Of_birth,
			String r_gender, String r_place_of_issue, String r_status, Candidates theCandidates) {
		super();
		R_ID = r_ID;
		R_name = r_name;
		R_email = r_email;
		this.password = password;
		R_date_Of_birth = r_date_Of_birth;
		R_gender = r_gender;
		R_place_of_issue = r_place_of_issue;
		R_status = r_status;
		this.theCandidates = theCandidates;
	}
	public String getR_ID() {
		return R_ID;
	}
	public void setR_ID(String r_ID) {
		R_ID = r_ID;
	}
	public String getR_name() {
		return R_name;
	}
	public void setR_name(String r_name) {
		R_name = r_name;
	}
	public String getR_email() {
		return R_email;
	}
	public void setR_email(String r_email) {
		R_email = r_email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getR_date_Of_birth() {
		return R_date_Of_birth;
	}
	public void setR_date_Of_birth(LocalDate r_date_Of_birth) {
		R_date_Of_birth = r_date_Of_birth;
	}
	public String getR_gender() {
		return R_gender;
	}
	public void setR_gender(String r_gender) {
		R_gender = r_gender;
	}
	public String getR_place_of_issue() {
		return R_place_of_issue;
	}
	public void setR_place_of_issue(String r_place_of_issue) {
		R_place_of_issue = r_place_of_issue;
	}
	public String getR_status() {
		return R_status;
	}
	public void setR_status(String r_status) {
		R_status = r_status;
	}
	public Candidates getTheCandidates() {
		return theCandidates;
	}
	public void setTheCandidates(Candidates theCandidates) {
		this.theCandidates = theCandidates;
	}
	
	
}
