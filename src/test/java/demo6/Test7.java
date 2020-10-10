package demo6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Pig.class, Master6.class})
public class Test7 {
    @Test
    public void test() {
        //加载spring的java注解类
        ApplicationContext context = new AnnotationConfigApplicationContext(Test7.class);
//        通过IoC容器得到对象
        Master6 master6 = context.getBean("master6", Master6.class);
        System.out.println(master6);
    }
}
