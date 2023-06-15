package com.vaz.flight.security;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;


public class CustomOAuth2User implements OAuth2User, Serializable {
 
   
	private static final long serialVersionUID = -905149569211094868L;
	private OAuth2User oauth2User;
     
    public CustomOAuth2User(OAuth2User oauth2User) {
        this.oauth2User = oauth2User;
    }
 
    @Override
    public Map<String, Object> getAttributes() {
        return oauth2User.getAttributes();
    }
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return oauth2User.getAuthorities();
    }
 
    @Override
    public String getName() {  
        return oauth2User.getAttribute("name");
    }
    
    public String getEmail() {
        return oauth2User.<String>getAttribute("email");     
    }
    
    
    public String getGivenName() {
    	return oauth2User.<String>getAttribute("given_name");     
    }
    

}