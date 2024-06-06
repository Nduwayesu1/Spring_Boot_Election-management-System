package MainPackage.modle;

import java.time.LocalDate;

import jakarta.persistence.*;
@Entity
public class Security {
    @Id
    @Column(name = "Security_id", length = 12)
	private String Security_id;
    private String Security_name;
    @Column(name = "security_email", unique = true)
    private String security_email;
    private String security_password;
	private LocalDate Security_date_Of_birth;
	private String Security_gender;
	private String Security_place_of_issue;
	private String Security_status;
    @ManyToOne
    @JoinColumn(name="candidate_id")
	private Candidates theCandidates;
	public Security() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Security(String security_id, String security_name, String security_email, String security_password,
			LocalDate security_date_Of_birth, String security_gender, String security_place_of_issue,
			String security_status, Candidates theCandidates) {
		super();
		Security_id = security_id;
		Security_name = security_name;
		this.security_email = security_email;
		this.security_password = security_password;
		Security_date_Of_birth = security_date_Of_birth;
		Security_gender = security_gender;
		Security_place_of_issue = security_place_of_issue;
		Security_status = security_status;
		this.theCandidates = theCandidates;
	}
	public String getSecurity_id() {
		return Security_id;
	}
	public void setSecurity_id(String security_id) {
		Security_id = security_id;
	}
	public String getSecurity_name() {
		return Security_name;
	}
	public void setSecurity_name(String security_name) {
		Security_name = security_name;
	}
	public String getSecurity_email() {
		return security_email;
	}
	public void setSecurity_email(String security_email) {
		this.security_email = security_email;
	}
	public String getSecurity_password() {
		return security_password;
	}
	public void setSecurity_password(String security_password) {
		this.security_password = security_password;
	}
	public LocalDate getSecurity_date_Of_birth() {
		return Security_date_Of_birth;
	}
	public void setSecurity_date_Of_birth(LocalDate security_date_Of_birth) {
		Security_date_Of_birth = security_date_Of_birth;
	}
	public String getSecurity_gender() {
		return Security_gender;
	}
	public void setSecurity_gender(String security_gender) {
		Security_gender = security_gender;
	}
	public String getSecurity_place_of_issue() {
		return Security_place_of_issue;
	}
	public void setSecurity_place_of_issue(String security_place_of_issue) {
		Security_place_of_issue = security_place_of_issue;
	}
	public String getSecurity_status() {
		return Security_status;
	}
	public void setSecurity_status(String security_status) {
		Security_status = security_status;
	}
	public Candidates getTheCandidates() {
		return theCandidates;
	}
	public void setTheCandidates(Candidates theCandidates) {
		this.theCandidates = theCandidates;
	}
	
    
    
}
