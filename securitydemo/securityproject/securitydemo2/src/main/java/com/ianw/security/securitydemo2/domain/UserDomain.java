package com.ianw.security.securitydemo2.domain;/**
 * ClassName: UserDomain <br/>
 * Description: <br/>
 * date: 2019/8/2 16:17<br/>
 *
 * @author 72733<br />
 * @version
 * @since JDK 1.8
 */



import javax.persistence.*;

/**
 *@program: securityproject
 *@description:
 *@author: tao xujie
 *@create: 2019-08-02 16:17
 */

@Entity
public class UserDomain {
    public enum Role{
        ROLE_ADMIN,ROLE_USER
    }
    @Id @GeneratedValue
    private long uid;//主键.
    private String username;//用户名.
    private String password;//密码.
    @Enumerated(EnumType.STRING)
    private Role role;

    public UserDomain() {
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}