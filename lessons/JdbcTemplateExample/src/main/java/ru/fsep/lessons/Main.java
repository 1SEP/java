package ru.fsep.lessons;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcUserDao jdbcUserDao = (JdbcUserDao)context.getBean("jdbcUserDao");
        //User user = new User(11, "Misha", "Misha");
        //jdbcUserDao.insert(user);

        User foundedUser = jdbcUserDao.findBy(1);
        System.out.println(foundedUser);
    }
}
