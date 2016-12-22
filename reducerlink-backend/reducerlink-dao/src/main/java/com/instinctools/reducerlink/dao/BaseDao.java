package com.instinctools.reducerlink.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T, ID extends Serializable> {
	public T findOne(Long id);
    public List<T> findAll();
    public T save(T object);
    public long count();
    public void delete(Long id);
    public void delete(T object);
}
