package io.javabrains.springbootstarter.dingus;

import org.springframework.data.repository.CrudRepository;

public interface UsersController extends CrudRepository<Name, String> {
	
}
