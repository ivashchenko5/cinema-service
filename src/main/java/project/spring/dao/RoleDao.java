package project.spring.dao;

import java.util.Optional;
import project.spring.model.Role;
import project.spring.model.RoleType;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByType(RoleType roleType);
}

