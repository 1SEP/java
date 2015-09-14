package com.devcolibri.dataexam.jdbc;

import com.devcolibri.dataexam.jpa.entity.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class BankDaoImpl implements BankDao {

    NamedParameterJdbcTemplate namedTemplate;

    @Autowired
    public void setNamedTemplate(DataSource dataSource) {
        namedTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    RowMapper<Bank> bankRowMapper = new RowMapper<Bank>() {
        public Bank mapRow(ResultSet rs, int i) throws SQLException {
            Bank bank = new Bank();
            bank.setId(rs.getInt("id"));
            bank.setName(rs.getString("name"));
            return bank;
        }
    };

    public List<Bank> getAll() {
        return null;
    }

    public Bank getBank(int id) {
        //language=SQL
        String sql = "SELECT * FROM bank WHERE id = :id;";
        SqlParameterSource param = new MapSqlParameterSource("id", id);
        Bank result = namedTemplate.queryForObject(sql, param, bankRowMapper);
        return result;
    }

    public Bank addBank(Bank bank) {
        return null;
    }
}
