package com.instinctools.reducerlink.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
public class LinkHistory extends BaseEntity<Long> {

	@GraphId
	private Long id;

    @Property
    private Long createdAtTimestamp;

    @Property
    private Long sumClick;

    @Relationship(type="BELONG", direction = Relationship.OUTGOING)
    private Link link;

    public Long getId() {
        return id;
    }

    public LinkHistory setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCreatedAtTimestamp() {
        return createdAtTimestamp;
    }

    public LinkHistory setCreatedAtTimestamp(Long createdAtTimestamp) {
        this.createdAtTimestamp = createdAtTimestamp;
        return this;
    }

    public Long getSumClick() {
        return sumClick;
    }

    public LinkHistory setSumClick(Long sumClick) {
        this.sumClick = sumClick;
        return this;
    }

    public Link getLink() {
        return link;
    }

    public LinkHistory setLink(Link link) {
        this.link = link;
        return this;
    }
}