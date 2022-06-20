# spring-google-oauth-login-template
Spring Boot project for OAuth login with Google
Simple template for a Spring Boot Web application with Google OAuth support.

### Steps:
1. Create a Google App and get the Client ID and Client Secret values. (Specify callback URL as `http://localhost:8080/login/oauth2/code/google` for development)
2. Add those values in `application.yml` or `application.properties`
3. Run the Spring Boot App. You should be able to login with GitHub

You will be redirected back to the login page, but you can validate the authorized principal is created by accessing the `/user` API. 
