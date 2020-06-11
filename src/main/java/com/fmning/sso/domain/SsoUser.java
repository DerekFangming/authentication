package com.fmning.sso.domain;

public class SsoUser extends org.springframework.security.core.userdetails.User {

    public SsoUser(User user) {
//        super(user.getUsername(), user.getPassword(), user.getGrantedAuthoritiesList());
        super(user.getUsername(), user.getPassword(), true, true, true, true, user.getGrantedAuthorities());

    }
}