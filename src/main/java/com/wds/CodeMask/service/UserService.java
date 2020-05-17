package com.wds.CodeMask.service;

/**
 * @author : TenYun
 * @date : 2020-05-17 15:25
 * @description :
 **/

public interface UserService {

    /**
     * create a new user
     * @param username
     * @param email
     * @param password
     */
    void create(String username, String email, String password);

    /**
     * delete user by username
     * @param username
     */
    void deleteByUsername(String username);

//    Integer getAllUsers();

}
