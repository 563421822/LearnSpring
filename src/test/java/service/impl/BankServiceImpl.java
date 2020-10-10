package service.impl;

import dao.IBankDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.IBankService;

import java.math.BigDecimal;

@Transactional
@Service
public class BankServiceImpl implements IBankService {
    @Autowired
    public IBankDao dao;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
    @Override
    public int transfer(String from, String to, BigDecimal amount) {
        return dao.transfer(from, to, amount);
    }
}
