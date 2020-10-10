package demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Test4 {
    @Test
    public void test() {
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("applicationContext.xml");//new一个子类
        Master m1 = ac1.getBean("ww", Master.class);
        System.out.println(m1);
    }

    @Test
    public void test2() {
        ArrayList<Object> alist = new ArrayList<>();
        alist.add("caho");
        alist.add(22);
//        alist.stream().forEach((v)-> System.out.println(v));
    }
}