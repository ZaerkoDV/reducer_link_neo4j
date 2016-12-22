package com.instinctools.reducerlink.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.instinctools.reducerlink.dao.LinkDao;
import com.instinctools.reducerlink.model.Link;

@Repository
public class LinkDaoImpl extends BaseDaoImpl<Link, Long> implements LinkDao {
    public LinkDaoImpl() {
        super(Link.class);
    }

    public List<Link> getListLinkByIdUser(Long idUser) {
         return null;
    }
    
    public long countLinkByUser(Long idUser) {
        return 0;
    }

    public List<String> getListUniqueTag() {
        return null;
    }
}
