package com.instinctools.reducerlink.dao.impl;

import org.springframework.stereotype.Repository;
import com.instinctools.reducerlink.dao.UserPhotoDao;
import com.instinctools.reducerlink.model.UserPhoto;

@Repository
public class UserPhotoDaoImpl extends BaseDaoImpl<UserPhoto, Long> implements UserPhotoDao {
    public UserPhotoDaoImpl() {
        super(UserPhoto.class);
     }

     public UserPhoto getUserPhotoByIdUser(Long idUser) {
         return null;
     }

     public Long getIdUserPhotoByIdUser(Long idUser) {
         return null;
     }
}
