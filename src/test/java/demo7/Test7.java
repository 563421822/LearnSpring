package demo7;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test7 {
    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("demo7");
        Master7 master7 = annotationConfigApplicationContext.getBean("master7", Master7.class);
        System.out.println(master7);
    }
}
