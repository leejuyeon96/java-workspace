package UserController;

import com.youtube.model.User;

public class UserController {

	User user = null;
	public boolean login(String id, String password) {
		if (user!=null && user.getId().equals(id) && user.getPassword().equals(password));
		return false;
	}

	
	public void SignUp(User user) {
		this.user = user;
		
	}

	
	public User viewProfile() {
		
		if(login(user.getId(), user.getPassword())) {
			return user;
		}
		return null;
	}

	
	public User updateProfile(User user) {
		
		if(login(this.user.getId(), this.user.getPassword())) {
			this.user = user;
		}	
			return this.user;
	}

	
	public void deleteProfile(String id) {
		
		if(user.getId().equals(id)) {
			user = null;
		}
	}


	
	
    }
	
	
	

	

