package com.knoldus.oauth2login;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    void testConstructor() {
        User actualUser = new User("Aasif", "aasif.ali@gmail.com", "Profile Pic", true);
        assertEquals("aasif.ali@gmail.com", actualUser.getEmail());
        assertEquals("Aasif", actualUser.getName());
        assertEquals("Profile Pic", actualUser.getProfilePic());
        assertTrue(actualUser.isEmailVerified());
    }
    @Test
    void testDefaultConstructor() {
        User actualUser = new User();
        actualUser.setEmail("aasif.ali@gmail.com");
        actualUser.setEmailVerified(true);
        actualUser.setName("Aasif");
        actualUser.setProfilePic("Profile Pic");
        assertEquals("aasif.ali@gmail.com", actualUser.getEmail());
        assertEquals("Aasif", actualUser.getName());
        assertEquals("Profile Pic", actualUser.getProfilePic());
        assertTrue(actualUser.isEmailVerified());
    }
}

