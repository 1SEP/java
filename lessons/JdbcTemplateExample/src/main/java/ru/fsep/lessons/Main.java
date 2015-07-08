package ru.fsep.lessons;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcUserDao jdbcUserDao = (JdbcUserDao)context.getBean("namedJdbcTemplateUserDao");

//        User user = new User(2, "human", "qwerty");
//        jdbcUserDao.insert(user);
//        jdbcUserDao.updateUser(2, "Ildar", "53");

//        User foundedUser = jdbcUserDao.findById(7);
//        System.out.println(foundedUser);

//        jdbcUserDao.delete(1);

        List<User> listOfUsers = jdbcUserDao.getAllUsers();
        for(User currentUser : listOfUsers){
            System.out.println(currentUser);
        }

    }
}
