package demo6;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test8 {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("demo6");
        Master6 master6 = context.getBean("master6", Master6.class);
        System.out.println(master6);
    }
}
