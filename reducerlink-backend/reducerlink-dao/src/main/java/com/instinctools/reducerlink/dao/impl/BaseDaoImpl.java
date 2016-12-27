package com.instinctools.reducerlink.dao.impl;

import java.io.Serializable;
import java.util.List;

public class BaseDaoImpl<T, ID extends Serializable> {
	
//	@Autowired
//    private DaoRepository<T> repository;

	protected Class<T> domainClass;

    public BaseDaoImpl(Class<T> domainClass) {
        this.domainClass = domainClass;
    }

    public T findOne(Long id) {
    	return null;//repository.findOne(id);
    }
    
	public List<T> findAll() {
        return null;//(List<T>) repository.findAll();
    }

    public T save(T object) {
        return null;//repository.save(object);
    }

    public long count() {
        return 0;//repository.count();
    }

    public void delete(Long id) {
        //repository.delete(id);
    }

    public void delete(T object) {
    	//repository.delete(object);
    }
}
