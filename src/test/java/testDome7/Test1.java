package testDome7;

import demo7.Master7;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")

public class Test1 {
    @Resource(name = "master7")
    private Master7 master7;

    @Test
    public void test() {
        System.out.println(master7);
    }
}
