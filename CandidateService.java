package MainPackage.Service;

import MainPackage.modle.Candidates;

public interface CandidateService {
	
	public Candidates saveCandidate(Candidates theCandidate);
	public Candidates updateCandidates(Candidates theCandidate);
	public Candidates deleteCandidates(Candidates theCandidates);
	public Candidates getCandidate();

}
