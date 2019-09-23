package mainpackage.service;


import mainpackage.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	public boolean login(User user) {
		if(user.getUsername().equals("validuser")) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
