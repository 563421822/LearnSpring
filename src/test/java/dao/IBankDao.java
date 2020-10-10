package dao;

import java.math.BigDecimal;

public interface IBankDao {
    int transfer(String from, String to, BigDecimal amount);
}
