package com.instinctools.reducerlink.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
public class Link extends BaseEntity<Long> {
	
	@GraphId
    private Long id;

	@Property
    private String tag;

	@Property
    private String comment;

	@Property
    private String shortUrl;

	@Property
    private String fullUrl;

    @Relationship(type="BELONG", direction = Relationship.OUTGOING)
    private User user;
    
//	@Relationship(type="HAVE", direction=Relationship.INCOMING)
//	private List<LinkHistory> listLinkHistory;

    public Long getId() {
        return id;
    }

    public Link setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public Link setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Link setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public Link setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public Link setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Link setUser(User user) {
        this.user = user;
        return this;
    }
}
