package com.hungerstrike.dao;
import java.util.List;

import com.hungerstrike.model.Users;
 
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
 
public class UsersDAOImpl implements UsersDAO {
    private SessionFactory sessionFactory;
 
    public UsersDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    @Override
    @Transactional
    public List<Users> list() {
        @SuppressWarnings("unchecked")
        List<Users> listUser = (List<Users>) sessionFactory.getCurrentSession()
                .createCriteria(Users.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 
        return listUser;
    }
 
}
