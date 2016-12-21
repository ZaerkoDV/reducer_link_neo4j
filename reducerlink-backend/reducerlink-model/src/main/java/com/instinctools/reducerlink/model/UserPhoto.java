package com.instinctools.reducerlink.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
public class UserPhoto extends BaseEntity<Long> {

	@GraphId
    private Long id;

    @Property
    private Long createdAtTimestamp;

    @Property
    private byte[] photoData;

    @Relationship(type="BELONG", direction = Relationship.OUTGOING)
    private User user;

    public Long getId() {
        return id;
    }

    public UserPhoto setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCreatedAtTimestamp() {
        return createdAtTimestamp;
    }

    public UserPhoto setCreatedAtTimestamp(Long createdAtTimestamp) {
        this.createdAtTimestamp = createdAtTimestamp;
        return this;
    }

    public byte[] getPhotoData() {
        return photoData;
    }

    public UserPhoto setPhotoData(byte[] photoData) {
        this.photoData = photoData;
        return this;
    }

    public User getUser() {
        return user;
    }

    public UserPhoto setUser(User user) {
        this.user = user;
        return this;
    }
}
