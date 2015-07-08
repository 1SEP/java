package ru.fsep.lessons;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NamedJdbcTemplateUserDaoImpl implements JdbcUserDao {
    private DataSource dataSource;
    private NamedParameterJdbcTemplate namedParamJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }



    public void insert(User user) {
        namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        String sql = "INSERT INTO my_users(id, username, password) VALUES (:id, :username, :password)";
        Map params = new HashMap();
        params.put("username", user.getUsername());
        params.put("password", user.getPassword());
        params.put("id", user.getId());
        namedParamJdbcTemplate.update(sql, params);
        System.out.println("The new user was added to database");
    }

    public User findById(int id) {
        namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        String sql = "SELECT * FROM my_users WHERE id = :id";
        SqlParameterSource sqlParamSource = new MapSqlParameterSource("id", id);
        User user = (User)namedParamJdbcTemplate.queryForObject(sql, sqlParamSource, new BeanPropertyRowMapper<User>(User.class));
        return user;
    }

    public List<User> getAllUsers(){
        namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        String sql = "SELECT * FROM my_users";
        List<User> users = namedParamJdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    public void updateUser(int id, String newUsername, String newPassword) {
        String sql = "UPDATE my_users SET username = :username, password = :password WHERE id = :id";
        Map map = new HashMap();
        map.put("id", id);
        map.put("username", newUsername);
        map.put("password", newPassword);
        namedParamJdbcTemplate.update(sql, map);
        System.out.println("The user with ID = " + id + " was updated. Username is " + newUsername + ", password is " + newPassword);
    }

    public void delete(int id) {
        namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        String sql = "DELETE FROM my_users WHERE id = :id";
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource("id", id);
        namedParamJdbcTemplate.update(sql, sqlParameterSource);
        System.out.println("The user with ID = " + id + " was deleted");
    }
}
