package test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\WANG\\IdeaProjects\\LearnSpring\\src\\test\\resources\\applicationContext.xml");
        Entity e1 = context.getBean("e1", Entity.class);
        System.out.println(e1);
    }
}
