package project.spring.service;

import project.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
