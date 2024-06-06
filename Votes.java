package MainPackage.modle;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Votes {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer votes_id;
  private String vote_status;
  private String citizen_Id;
  private String candidate_name;
  private LocalDate votes_date;
  private Integer voice = 0;
public Votes(Integer votes_id, String vote_status, String citizen_Id, String candidate_name, LocalDate votes_date,
		Integer voice) {
	super();
	this.votes_id = votes_id;
	this.vote_status = vote_status;
	this.citizen_Id = citizen_Id;
	this.candidate_name = candidate_name;
	this.votes_date = votes_date;
	this.voice = voice;
}
public Votes() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getVotes_id() {
	return votes_id;
}
public void setVotes_id(Integer votes_id) {
	this.votes_id = votes_id;
}
public String getVote_status() {
	return vote_status;
}
public void setVote_status(String vote_status) {
	this.vote_status = vote_status;
}
public String getCitizen_Id() {
	return citizen_Id;
}
public void setCitizen_Id(String citizen_Id) {
	this.citizen_Id = citizen_Id;
}
public String getCandidate_name() {
	return candidate_name;
}
public void setCandidate_name(String candidate_name) {
	this.candidate_name = candidate_name;
}
public LocalDate getVotes_date() {
	return votes_date;
}
public void setVotes_date(LocalDate votes_date) {
	this.votes_date = votes_date;
}
public Integer getVoice() {
	return voice;
}
public void setVoice(Integer voice) {
	this.voice = voice;
}
 




}
