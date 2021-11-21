package project.spring.service;

import project.spring.model.Role;
import project.spring.model.RoleType;

public interface RoleService {
    void add(Role role);

    Role getRoleByType(RoleType roleType);
}
