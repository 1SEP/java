package com.devcolibri.dataexam.jdbc;

import com.devcolibri.dataexam.jpa.entity.entities.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
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
//            Bank bank = new Bank();
            String name = rs.getString("name");
            return new Bank(name);
        }
    };

    public List<Bank> getAll() {
        return Collections.emptyList();
    }

    @Cacheable("bank")
    public Bank getBank(int id) {
        //language=SQL
        String sql = "SELECT * FROM bank WHERE id = :id;";
        SqlParameterSource param = new MapSqlParameterSource("id", id);
        Bank result = namedTemplate.queryForObject(sql, param, bankRowMapper);
        return result;
    }

    @CacheEvict(value = "evict", allEntries = true)
    public Bank addBank(Bank bank) {
        long bankId = bank.getId();
        String bankName = bank.getName();
        SqlParameterSource param = new MapSqlParameterSource().addValue("id", bankId).addValue("name", bankName);
        //laguage=SQL
        String sql = "INSERT INTO bank VALUES (:id, :name);";
        namedTemplate.update(sql, param);

        return bank;
    }
}
