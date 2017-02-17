package net.rigatti.admin.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.rigatti.admin.repository.UserRepository;

@RestController
public class UserResource {
	@Autowired 
	private UserRepository userRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/user")
	public String test() {
		return userRepository.findByUsername("Michel").toString();
	}
}
