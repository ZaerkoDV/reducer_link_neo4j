package com.instinctools.reducerlink.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;

public class BaseDaoImpl<T, ID extends Serializable> {
	
//	@Autowired
//	private Neo4jTemplate neo4jTemplate;

	protected Class<T> domainClass;

    public BaseDaoImpl(Class<T> domainClass) {
        this.domainClass = domainClass;
    }

    public T findOne(Long id) {
    	return null;
    }

    public List<T> findAll() {
        return null;
    }

    public T save(T object) {
        return null;//neo4jTemplate.save(object);
    }

    public long count() {
        return 0;
    }

    public void delete(Long id) {
    }

    public void delete(T object) {
    }
}
