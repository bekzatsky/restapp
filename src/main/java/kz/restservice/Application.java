package kz.restservice;

import kz.restservice.restapp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-config.xml");
        UserService userService = (UserService) ac.getBean("userServiceImpl");
        System.out.println(userService.getAllUsers());
    }
}
