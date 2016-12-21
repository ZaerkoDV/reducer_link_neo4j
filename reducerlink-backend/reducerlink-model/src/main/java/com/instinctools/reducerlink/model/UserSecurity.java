package com.instinctools.reducerlink.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
public class UserSecurity extends BaseEntity<Long> {
	
	@GraphId
	private Long id;

	@Property
	private String login;

	@Property
	private String password;

	@Property
	private String role;

	@Property
	private String token;

	@Relationship(type="BELONG", direction = Relationship.OUTGOING)
	private User user;

	public Long getId() {
		return id;
	}

	public UserSecurity setId(Long id) {
		this.id = id;
		return this;
	}

	public String getLogin() {
		return login;
	}

	public UserSecurity setLogin(String login) {
		this.login = login;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public UserSecurity setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getRole() {
		return role;
	}

	public UserSecurity setRole(String role) {
		this.role = role;
		return this;
	}

	public String getToken() {
		return token;
	}

	public UserSecurity setToken(String token) {
		this.token = token;
		return this;
	}

	public User getUser(){
		return user;
	}

	public UserSecurity setUser(User user) {
		this.user = user;
		return this;
	}
}
