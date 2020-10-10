package dao.impl;

import dao.IBankDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class BankDaoImpl implements IBankDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int transfer(String from, String to, BigDecimal amount) {
        String sql = "UPDATE t_transfer SET balance = balance + ? WHERE `name` =?";
        int send = jdbcTemplate.update(sql, amount.negate(), from);
        System.out.println(amount.negate());
//        int i = 8/0;
        int receive = jdbcTemplate.update(sql, amount, to);
        return send + receive;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
