package demo6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test6 {

    @Test
    public void test() {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\WANG\\IdeaProjects\\LearnSpring\\src\\test\\resources\\applicationContext.xml");
        Master6 master6 = context.getBean("master6", Master6.class);
        System.out.println(master6);
    }
}
