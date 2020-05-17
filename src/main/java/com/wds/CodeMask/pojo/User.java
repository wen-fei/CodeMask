package com.wds.CodeMask.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author : TenYun
 * @date : 2020-05-17 9:55
 * @description : user key information
 * use for login
 * user detail information see userinfo
 *
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cm_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Column(name = "username", nullable = false, length = 50, unique = true)
    private String username;

    @Column(name = "password", nullable = false, length = 30)
    private String password;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

}
