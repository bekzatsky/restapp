package kz.restservice.restapp.repository.impl;

import kz.restservice.restapp.model.User;
import kz.restservice.restapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<User> getAllUsers() {
        return hibernateTemplate.loadAll(User.class);
    }

    public User getUserById(int id) {
        return hibernateTemplate.get(User.class, id);
    }

    public void saveUser(User user) {
        hibernateTemplate.save(user);
    }

    public void updateUser(User user) {
        hibernateTemplate.update(user);
    }

    public void deleteUser(int id) {
        hibernateTemplate.delete(id);
    }
}
