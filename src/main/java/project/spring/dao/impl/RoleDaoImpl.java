package project.spring.dao.impl;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import project.spring.dao.AbstractDao;
import project.spring.dao.RoleDao;
import project.spring.exception.DataProcessingException;
import project.spring.model.Role;
import project.spring.model.RoleType;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByType(RoleType roleType) {
        try (Session session = factory.openSession()) {
            Query<Role> getRoleByType = session.createQuery(
                    "FROM Role WHERE roleType = :roleType", Role.class);
            getRoleByType.setParameter("roleType", roleType);
            return getRoleByType.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Not found role with name " + roleType, e);
        }
    }
}
