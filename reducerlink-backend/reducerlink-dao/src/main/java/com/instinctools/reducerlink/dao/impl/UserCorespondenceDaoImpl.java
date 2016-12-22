package com.instinctools.reducerlink.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.instinctools.reducerlink.dao.UserCorespondenceDao;
import com.instinctools.reducerlink.model.User;
import com.instinctools.reducerlink.model.UserCorespondence;

@Repository
public class UserCorespondenceDaoImpl extends BaseDaoImpl<UserCorespondence, Long> implements UserCorespondenceDao {
    public UserCorespondenceDaoImpl() {
        super(UserCorespondence.class);
    }

    public User getUserByEmail(String email) {
        return null;
    }

    public List<UserCorespondence> getListUserCorespondencesByIdUser(Long idUser) {
        return null;
    }

    public Boolean isEmailExist(String email) {
        return null;
    }

    public Boolean isSkypeExist(String skype) {
        return null;
    }

    public Boolean isPhoneExist(String phone) {
        return null;
    }

    public Boolean isUserIpAddress(Long idUser, String ipAddress) {
        return null;
    }
}