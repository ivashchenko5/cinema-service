package project.spring.service.impl;

import org.springframework.stereotype.Service;
import project.spring.dao.RoleDao;
import project.spring.model.Role;
import project.spring.model.RoleType;
import project.spring.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByType(RoleType roleType) {
        return roleDao.getRoleByType(roleType).get();
    }
}
