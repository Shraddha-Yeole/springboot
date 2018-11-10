package user;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class UserController {
	
	@Autowired
	private UserService userService;
		
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ResponseEntity<?> addUser(@RequestParam(value="email",required=true) String email,
			@RequestParam(value="password",required=true) String password){
		if( userService.InsertUsertable(email, password))
		 			return ResponseEntity.ok(null);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
	
	

}