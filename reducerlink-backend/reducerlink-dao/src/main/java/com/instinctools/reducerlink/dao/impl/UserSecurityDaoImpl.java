package com.instinctools.reducerlink.dao.impl;

import org.springframework.stereotype.Repository;
import com.instinctools.reducerlink.dao.UserSecurityDao;
import com.instinctools.reducerlink.model.User;
import com.instinctools.reducerlink.model.UserSecurity;

@Repository
public class UserSecurityDaoImpl extends BaseDaoImpl<UserSecurity, Long> implements UserSecurityDao {
    public UserSecurityDaoImpl() {
        super(UserSecurity.class);
    }

    public User getUserByLoginPassword(String login, String password) {
        return null;
    }

    public String getEncodedPasswordByLogin(String login) {
        return null;
    }

    public String getOldTokenByLogin(String login) {
        return null;
    }

    public String getUserRole(Long idUser) {
        return null;
    }

    public Boolean isLoginExist(String login) {
        return null;
    }

    public UserSecurity findUserSecurityByToken(String token) {
        return null;
    }
}
