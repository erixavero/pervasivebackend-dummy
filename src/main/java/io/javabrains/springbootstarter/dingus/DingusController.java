package io.javabrains.springbootstarter.dingus;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DingusController {
	
	@Autowired
	private NameService nameService;
	
	@RequestMapping("/users")
	public List<Name> showUsers() {
		return nameService.allNames();
	}
	
	@RequestMapping("/users/{id}")
	public Optional<Name> showUser(@PathVariable String id) {
		return nameService.getName(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody Name user) {
		nameService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public void updateUser(@RequestBody Name user, @PathVariable String id) {
		nameService.updateUser(id,user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public void deleteUser(@PathVariable String id) {
		nameService.deleteUser(id);
	}
	
}
