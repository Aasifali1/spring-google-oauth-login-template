package com.knoldus.oauth2login;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUser(Authentication principal) {
        DefaultOidcUser userDetails= (DefaultOidcUser) principal.getPrincipal();
        User user = new User(userDetails.getFullName(),
                userDetails.getEmail(),
                userDetails.getPicture(),
                userDetails.getEmailVerified());
        return user;
    }
}
