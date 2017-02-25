package net.rigatti.admin.resource;

import net.rigatti.admin.provider.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/admin")
public class UserResource {

	@Autowired
	private UserProvider userProvider;

	@GetMapping(path="/user")
	public String user() {
		return userProvider.getAll().toString();
	}
}
