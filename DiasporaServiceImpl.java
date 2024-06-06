package MainPackage.Service;

import java.security.Key;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import MainPackage.Dao.DiasporaRepository;
import MainPackage.modle.Diaspora;
import jakarta.mail.internet.MimeMessage;

@Service
public class DiasporaServiceImpl  implements DiasporaService{

	@Autowired
	private DiasporaRepository diasporsRepo;
	@Autowired
	private JavaMailSender javaMail;
	@Value("${spring.mail.username}")
	private String fromEmail;
	@Override
	public Diaspora saveDiaspora(Diaspora theDiaspora) {
		
		try {
		        theDiaspora.getDiaspora_ID();
		        theDiaspora.getDiaspora_name();
		        theDiaspora.getPassword();
		        theDiaspora.getDiaspota_emai();
		        theDiaspora.getDiaspora__date_Of_birth();
		        theDiaspora.getDiaspora_gender();
		        theDiaspora.getDiaspora_place_of_issue();
		        theDiaspora.getDiaspora_status();
		        
		        String receiverEmail = theDiaspora.getDiaspota_emai();
		        String subject = "Welcome to Our Platform!";
		        String body = "Dear " + theDiaspora.getDiaspora_name() + ",\n\nWelcome To Our Votting Platform and We are Magician\n\nRegards,\nDeveloper Team";

		        // Extract any necessary attachments or CC email addresses
		        MultipartFile[] files = {/* provide necessary files if any */};
		        String[] cc = {/* provide necessary CC email addresses if any */};

		        // Call sendEmail method before saving
		        sendEmail(files, receiverEmail, cc, subject, body);
		        return diasporsRepo.save(theDiaspora);
		}catch(Exception ex) {
			 ex.printStackTrace(); // For debugging purposes
		     throw new RuntimeException("Failed to save Diaspora and send email: " + ex.getMessage());
		}
	}

	@Override
	public Diaspora updateDiaspora(Diaspora theDiaspora) {
		// get id
		Optional<Diaspora> diaspora= diasporsRepo.findById(theDiaspora.getDiaspora_ID());
		//check if id is present
		if(diaspora.isPresent()) {
			theDiaspora.getDiaspora_name();
			theDiaspora.getDiaspota_emai();
			theDiaspora.getDiaspora__date_Of_birth();
			theDiaspora.getDiaspora_gender();
			theDiaspora.getDiaspora_place_of_issue();
			theDiaspora.getDiaspora_status();
			// save the changes'
			return diasporsRepo.save(theDiaspora);
		}else {
			throw new IllegalArgumentException("ID Not Found");
		}
		
	}

	@Override
	public Diaspora deleDiaspora(Diaspora theDiaspora) {
		// check if ID EXIST
		Optional<Diaspora> diaspora=diasporsRepo.findById(theDiaspora.getDiaspora_ID());
		if(diaspora.isPresent()) {
			Diaspora diasporas=diaspora.get();
			diasporsRepo.delete(diasporas);
			return diasporas;
		}else {
			 throw new IllegalArgumentException("ID Not Found");
		}
		
	}

	@Override
	public Diaspora getDiaspora(Diaspora theDiaspora) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sendEmail(MultipartFile[] files, String receiver, String[] cc, String subject, String body) {
	    try {
	        MimeMessage mimeMessage = javaMail.createMimeMessage();
	        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

	        mimeMessageHelper.setFrom(fromEmail);
	        mimeMessageHelper.setTo(receiver);
	        if (cc != null && cc.length > 0) {
	            mimeMessageHelper.setCc(cc);
	        }
	        mimeMessageHelper.setSubject(subject);
	        mimeMessageHelper.setText(body);

	        for (MultipartFile file : files) {
	            String originalFilename = file.getOriginalFilename();
	            if (originalFilename != null) {
	                mimeMessageHelper.addAttachment(originalFilename, new ByteArrayResource(file.getBytes()));
	            }
	        }

	        javaMail.send(mimeMessage);
	        return "Email sent successfully";
	    } catch (Exception ex) {
	        // Handle the exception gracefully, log it, or provide a meaningful error message
	        ex.printStackTrace(); // For debugging purposes
	        return "Failed to send email: " + ex.getMessage();
	    }
	}

	



}
