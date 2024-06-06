package MainPackage.modle;

import jakarta.persistence.*;

@Entity
public class School {
   @Id
   @Column(name = "School_Id", length = 12)
   private String  School_Id;
   private String School_name;
   @Column(name = "School_email", unique = true)
   private String School_email;
   private String School_location;
   @ManyToOne
   @JoinColumn(name="candidate_id")
   private Candidates thecandidates;
   
   
     public School() {
	    super();
	
            }
     public School(String school_Id, String school_name, String school_email, String school_location,
		Candidates thecandidates) {
	    super();
	    School_Id = school_Id;
	    School_name = school_name;
	    School_email = school_email;
	    School_location = school_location;
	    this.thecandidates = thecandidates;
        }
	public String getSchool_Id() {
		return School_Id;
	}
	public void setSchool_Id(String school_Id) {
		School_Id = school_Id;
	}
	public String getSchool_name() {
		return School_name;
	}
	public void setSchool_name(String school_name) {
		School_name = school_name;
	}
	public String getSchool_email() {
		return School_email;
	}
	public void setSchool_email(String school_email) {
		School_email = school_email;
	}
	public String getSchool_location() {
		return School_location;
	}
	public void setSchool_location(String school_location) {
		School_location = school_location;
	}
	public Candidates getThecandidates() {
		return thecandidates;
	}
	public void setThecandidates(Candidates thecandidates) {
		this.thecandidates = thecandidates;
	}
       
     

   
   
}
