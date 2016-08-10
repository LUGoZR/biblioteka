package org.lugozr.domain;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * User Domain Class ( POJO )
 * @author Nikola Mirosavljev
 */
@Entity
@Table(name = "users")
public class User extends AbstractBaseEntity {

    @NotNull
    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean enabled;

    @Column(name = "real_name")
    private String realName;

    public User() { }

    public User(String username, String password, Boolean enabled, String realName) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getRealName() {
        return realName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
