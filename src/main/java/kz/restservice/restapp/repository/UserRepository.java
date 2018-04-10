package kz.restservice.restapp.repository;

import kz.restservice.restapp.model.User;
import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();
    User getUserById(int id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
