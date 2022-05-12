package jp.co.tonaise.learning.jpa.jpain10stepsjpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import jp.co.tonaise.learning.jpa.jpain10stepsjpa.entity.User;

@Repository
@Transactional
public class UserDAOService {
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
	entityManager.persist(user);
	return user.getId();
    }
}
