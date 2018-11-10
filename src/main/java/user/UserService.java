package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
public boolean InsertUsertable(String email, String password){
		
		if (email !=null && password != null){
			
			User user = new User(email, password);
			userRepository.save(user);
			return true;
		}
		return false;
		
	}
	

	
}
