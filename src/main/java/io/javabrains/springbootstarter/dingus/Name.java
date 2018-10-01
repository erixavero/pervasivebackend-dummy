package io.javabrains.springbootstarter.dingus;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Name {
	
	@Id
	private String id;
	private String name;
	private String pswd;
	
	public Name() {
		
	}
	public Name(String id, String name, String pswd) {
		super();
		this.id = id;
		this.name = name;
		this.pswd = pswd;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
}
