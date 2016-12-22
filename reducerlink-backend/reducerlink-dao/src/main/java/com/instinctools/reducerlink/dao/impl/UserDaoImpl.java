package com.instinctools.reducerlink.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.instinctools.reducerlink.dao.UserDao;
import com.instinctools.reducerlink.model.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User, Long> implements UserDao {
    private static final Map<String, String> MAP_ORDER_BY;
    private static final Map<String, String> MAP_STATUS;

    public UserDaoImpl() {
        super(User.class);
    }

    static {
        MAP_ORDER_BY = new HashMap<String, String>();

        MAP_ORDER_BY.put("status", "status");
        MAP_ORDER_BY.put("firstName", "firstName");
        MAP_ORDER_BY.put("lastName", "lastName");
        MAP_ORDER_BY.put("middleName", "middleName");
        MAP_ORDER_BY.put("birth", "birth");
    }

    static {
        MAP_STATUS = new HashMap<String, String>();

        MAP_STATUS.put("active", "active");
        MAP_STATUS.put("blocked", "blocked");
    }

    public List<User> getListUserByLastName(User inputUser, int pageNum, int pageSize) {
    	return null;
    }
    
    public long countTotalUser() {
    	return 0;
    }
    
    public List<User> getListUserWithStatus(User inputUser, String orderBy, boolean orderAsc, int pageNum, int pageSize) {
    	return null;
    }
    
    public long countUserWithStatus(User inputUser) {
    	return 0;
    }
}
