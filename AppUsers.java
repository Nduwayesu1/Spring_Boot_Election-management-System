package MainPackage.modle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AppUsers {
    @Id
    @GeneratedValue
    private Long userId;  // Changed field name to camel case
    private String username;  // Changed field name to camel case
    private String password;  // Simplified field name
    private String role;  // Simplified field name
    
    public AppUsers() {
        super();
    }

	public AppUsers(Long userId, String username, String password, String role) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

    
}
