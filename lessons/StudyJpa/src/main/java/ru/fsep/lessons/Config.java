package ru.fsep.lessons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 17.11.15
 * Application
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "ru.fsep.lessons.repository")
@EnableAutoConfiguration
public class Config {
    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }
}
