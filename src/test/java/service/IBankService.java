package service;

import java.math.BigDecimal;

public interface IBankService {
    int transfer(String from, String to, BigDecimal amount);
}
