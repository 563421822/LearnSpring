package service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.IBankService;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext3.xml")
public class BankServiceImplTest {
    @Autowired
    IBankService service;

    @Test
    public void transfer() {
        int transfer = service.transfer("王永亮", "哈哈", BigDecimal.valueOf(100));
        System.out.println("transfer = " + transfer);
    }
}