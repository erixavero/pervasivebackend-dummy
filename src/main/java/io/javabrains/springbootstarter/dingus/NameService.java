package io.javabrains.springbootstarter.dingus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameService {
	
	@Autowired
	private UsersController userCon;
	
			
	public List<Name> allNames(){
		List<Name> users = new ArrayList<>();
		userCon.findAll().forEach(users::add);
		return users;
	}
	
	public Optional<Name> getName(String id){
		//return users.stream().filter(n -> n.getId().equals(id)).findFirst().get();
		return userCon.findById(id);
	}
	
	public void addUser(Name user) {
		userCon.save(user);
		//users.add(user);
	}
	
	public void updateUser(String id, Name user) {
		userCon.save(user);
	}
	
	public void deleteUser(String id) {
		userCon.deleteById(id);
	}
}
