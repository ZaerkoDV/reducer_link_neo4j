package com.instinctools.reducerlink.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
public class UserCorespondence extends BaseEntity<Long> {
	
	@GraphId
	private Long id;

    @Property
    private String email;

    @Property
    private String skype;

    @Property
    private String phone;

    @Property
    private String ipAddress;

    @Relationship(type="BELONG", direction = Relationship.OUTGOING)
    private User user;

    public Long getId() {
        return id;
    }

    public UserCorespondence setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserCorespondence setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSkype() {
        return skype;
    }

    public UserCorespondence setSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserCorespondence setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public UserCorespondence setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public User getUser() {
        return user;
    }

    public UserCorespondence setUser(User user) {
        this.user = user;
        return this;
    }
}
