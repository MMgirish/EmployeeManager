package com.ons.empmanager.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "user")
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	
	private String userId;
	
	private String firstName;
	
	private String lastName;
	
	private String reportingManager;
	
	private String username;

	private String password;
	
	private boolean enabled;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Role> roles; 

	public User(User user) {
		this.username= user.getUsername();
		this.password=user.getPassword();
		this.roles=user.getRoles();
		this.enabled=user.isEnabled();
		this.firstName=user.getFirstName();
		this.lastName=user.getLastName();
		this.reportingManager=user.getReportingManager();
		
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstame) {
		this.firstName = firstame;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	} 
	
}
