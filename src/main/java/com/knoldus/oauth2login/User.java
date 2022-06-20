package com.knoldus.oauth2login;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String email;
    private String profilePic;
    private boolean isEmailVerified;
    
    public User(String name, String email, String profilePic, boolean isEmailVerified) {
        this.name = name;
        this.email = email;
        this.profilePic = profilePic;
        this.isEmailVerified = isEmailVerified;
    }
    public User() {
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getProfilePic() {
        return profilePic;
    }
    
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
    
    public boolean isEmailVerified() {
        return isEmailVerified;
    }
    
    public void setEmailVerified(boolean emailVerified) {
        isEmailVerified = emailVerified;
    }
}
