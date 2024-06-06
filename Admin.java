package MainPackage.modle;

import jakarta.persistence.*;

@Entity
public class Admin {
    @Id
	private String admin_ID;
	private String admin_email;

}
