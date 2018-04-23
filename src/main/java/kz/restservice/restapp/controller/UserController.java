package kz.restservice.restapp.controller;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import kz.restservice.restapp.model.User;
import kz.restservice.restapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    @JsonSerialize(contentUsing = DateSerializer.class)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/user/{id}")
    @JsonSerialize(contentUsing = DateSerializer.class)
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }
}
