package ru.fsep.lessons;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import javax.sql.DataSource;

public class JdbcUserDaoImpl implements JdbcUserDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(User user) {
        String sql = "INSERT INTO my_users " + "(id, username, password) VALUES (?,?,?)";
        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql, new Object[]{user.getId(), user.getUsername(), user.getPassword()});
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public User findBy(int id) {
        String sql = "SELECT * FROM my_users WHERE id = ?";
        jdbcTemplate = new JdbcTemplate(dataSource);
        User user = (User) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(User.class));
        return user;
    }
}
