package ru.fsep.lessons;

public interface JdbcUserDao {
    void insert(User user);
    User findBy(int id);
}
