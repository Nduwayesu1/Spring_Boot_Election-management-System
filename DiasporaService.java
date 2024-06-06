package MainPackage.Service;

import org.springframework.web.multipart.MultipartFile;

import MainPackage.modle.Diaspora;

public interface DiasporaService {
	
	public Diaspora saveDiaspora(Diaspora theDiaspora);
	public Diaspora updateDiaspora(Diaspora theDiaspora);
	public Diaspora deleDiaspora(Diaspora theDiaspora);
	public Diaspora getDiaspora(Diaspora theDiaspora);
	String sendEmail(MultipartFile[] file, String receiver, String[] cc, String subject, String body);
	
	
	
	

}
