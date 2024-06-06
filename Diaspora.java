package MainPackage.modle;

import java.time.LocalDate;

import jakarta.persistence.*;
@Entity

public class Diaspora {
    @Id
    @Column(name = "diaspora_ID", length = 12)
	private String diaspora_ID;
    @Column(name="diaspora_name")
    private String diaspora_name;
    @Column(name = "diaspota_email", unique = true)
    private String diaspota_emai;
    private String password;
	private LocalDate diaspora__date_Of_birth;
	private String diaspora_gender;
	private String diaspora_place_of_issue;
	private String diaspora_status;
	@ManyToOne
	@JoinColumn(name ="candidate_id")
	private Candidates theCandidate;
	public Diaspora() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Diaspora(String diaspora_ID, String diaspora_name, String diaspota_emai, String password,
			LocalDate diaspora__date_Of_birth, String diaspora_gender, String diaspora_place_of_issue,
			String diaspora_status, Candidates theCandidate) {
		super();
		this.diaspora_ID = diaspora_ID;
		this.diaspora_name = diaspora_name;
		this.diaspota_emai = diaspota_emai;
		this.password = password;
		this.diaspora__date_Of_birth = diaspora__date_Of_birth;
		this.diaspora_gender = diaspora_gender;
		this.diaspora_place_of_issue = diaspora_place_of_issue;
		this.diaspora_status = diaspora_status;
		this.theCandidate = theCandidate;
	}
	public String getDiaspora_ID() {
		return diaspora_ID;
	}
	public void setDiaspora_ID(String diaspora_ID) {
		this.diaspora_ID = diaspora_ID;
	}
	public String getDiaspora_name() {
		return diaspora_name;
	}
	public void setDiaspora_name(String diaspora_name) {
		this.diaspora_name = diaspora_name;
	}
	public String getDiaspota_emai() {
		return diaspota_emai;
	}
	public void setDiaspota_emai(String diaspota_emai) {
		this.diaspota_emai = diaspota_emai;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDiaspora__date_Of_birth() {
		return diaspora__date_Of_birth;
	}
	public void setDiaspora__date_Of_birth(LocalDate diaspora__date_Of_birth) {
		this.diaspora__date_Of_birth = diaspora__date_Of_birth;
	}
	public String getDiaspora_gender() {
		return diaspora_gender;
	}
	public void setDiaspora_gender(String diaspora_gender) {
		this.diaspora_gender = diaspora_gender;
	}
	public String getDiaspora_place_of_issue() {
		return diaspora_place_of_issue;
	}
	public void setDiaspora_place_of_issue(String diaspora_place_of_issue) {
		this.diaspora_place_of_issue = diaspora_place_of_issue;
	}
	public String getDiaspora_status() {
		return diaspora_status;
	}
	public void setDiaspora_status(String diaspora_status) {
		this.diaspora_status = diaspora_status;
	}
	public Candidates getTheCandidate() {
		return theCandidate;
	}
	public void setTheCandidate(Candidates theCandidate) {
		this.theCandidate = theCandidate;
	}
	
	
	

}
