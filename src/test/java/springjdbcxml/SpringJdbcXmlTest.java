package springjdbcxml;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import springjdbcxml.entity.JdbcEntityXml;

import java.util.Arrays;
import java.util.List;

/**
 * 数据访问类的测试类
 */
public class SpringJdbcXmlTest {
    /**
     * 添加的测试方法
     */
    @Test
    public void add() {
//        加载Spring IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

        JdbcEntityXml jdbcEntity = new JdbcEntityXml(1, "haha", "mima", 12, Arrays.toString(new String[]{"sleep", "eat"}));
        SpringJdbcXml sj = context.getBean("jdbcXml",SpringJdbcXml.class);
        int add = sj.add(jdbcEntity);
        System.out.println(add);
    }

    @Test
    public void modify() {
//        加载Spring IoC容器
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\WANG\\IdeaProjects\\LearnSpring\\src\\test\\resources\\applicationContext1.xml");

        JdbcEntityXml jdbcEntity = new JdbcEntityXml(1, "haha", "fafa", 12, Arrays.toString(new String[]{"sleep", "eat"}));
        SpringJdbcXml sj = context.getBean("jdbcXml",SpringJdbcXml.class);
        int modify = sj.modify(jdbcEntity);
        System.out.println(modify);
    }

    @Test
    public void delete() {
//        加载Spring IoC容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        JdbcEntityXml jdbcEntity = new JdbcEntityXml(1, "haha", "jijiji", 12, Arrays.toString(new String[]{"sleep", "eat"}));
        SpringJdbcXml sj = context.getBean("jdbcXml",SpringJdbcXml.class);
        int add = sj.delete(jdbcEntity);
        System.out.println(add);
    }

    @Test
    public void getSingleObjectTest() {
//        加载Spring IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        SpringJdbcXml sj = context.getBean("jdbcXml",SpringJdbcXml.class);
        JdbcEntityXml haha = sj.getSingleObject("haha");
        System.out.println(haha);
    }

    @Test
    public void getAllObjectTest() {
//        加载Spring IoC容器
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\WANG\\IdeaProjects\\LearnSpring\\src\\test\\resources\\applicationContext1.xml");
        SpringJdbcXml sj = context.getBean("jdbcXml",SpringJdbcXml.class);
        List<JdbcEntityXml> allObject = sj.getAllObject();
        // allObject.stream().forEach(System.out::println);
        allObject.forEach((e) -> System.out.println("e = " + e));
    }

    @Test
    public void getTotalTest() {
//        加载Spring IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

        SpringJdbcXml sj = context.getBean("jdbcXml",SpringJdbcXml.class);
        int total = sj.getTotal();
        System.out.println("总条数为 = " + total);
    }
}