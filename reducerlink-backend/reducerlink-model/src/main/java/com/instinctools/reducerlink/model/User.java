package com.instinctools.reducerlink.model;

import org.neo4j.ogm.annotation.*;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
public class User extends BaseEntity<Long> {

	@GraphId
	private Long id;

	@Property
    private String firstName;

	@Property
    private String lastName;

	@Property
    private String middleName;

	@Property
    private Long birth;

	@Property
    private String status;
	
//	@Relationship(type="CREATE", direction=Relationship.INCOMING)
//	private List<Link> listLink;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public User setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public Long getBirth() {
        return birth;
    }

    public User setBirth(Long birth) {
        this.birth = birth;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public User setStatus(String status) {
        this.status = status;
        return this;
    }
}
