package MainPackage.Service;
import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import MainPackage.Dao.AppUsersRepository;
import MainPackage.modle.AppUsers;

@Service
public class AppUsersServiceImpl implements AppUsersService{

	@Autowired 
	private AppUsersRepository userRepo;
	@Override
	public AppUsers signUp(AppUsers theUsers) {
		theUsers.getUsername();
		 String encryptedPassword = encryptPassword(theUsers.getPassword());
	     theUsers.setPassword(encryptedPassword);
		theUsers.getRole();
		return userRepo.save(theUsers);
	}
	
	private String encryptPassword(String password) {
        // Use bcrypt to encrypt the password
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

	@Override
	public AppUsers login(String username, String password, String role) {
	    // Find user by username
	    AppUsers user = userRepo.findByUsername(username);
	    
	    // Check if user exists, role matches, and password is correct
	    if (user != null && user.getRole().equals(role) && user.getPassword().equals(password)) {
	        return user;
	    }
	    
	    return null;
	}


	

	
	

	
	

}
