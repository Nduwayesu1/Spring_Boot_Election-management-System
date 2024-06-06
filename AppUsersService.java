package MainPackage.Service;

import MainPackage.modle.AppUsers;

public interface AppUsersService {
   AppUsers signUp(AppUsers theUsers);
   AppUsers login(String userbame,String password,String role);
   
  
  
}
