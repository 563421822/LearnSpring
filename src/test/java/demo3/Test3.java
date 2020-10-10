package demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用spring容器获得对象的方式
 */
public class Test3 {
    @Test
    public void test3() {
//加载spring核心配置文件
        ApplicationContext ac3 = new ClassPathXmlApplicationContext("applicationContext.xml");
/*//        通过spring容器获得对象,通过id名获得
        Dog d1 = ac3.getBean("d1", Dog.class);
        System.out.println("d1 = " + d1);

//        通过name名获得对象
        Dog d2 = ac3.getBean("d2", Dog.class);
        System.out.println("d2 = " + d2);*/

/*
//        通过spring容器获得对象,通过工厂的静态方法获得
        Dog d3 = ac3.getBean("d3", Dog.class);
        System.out.println("d3 = " + d3);
*/

        Dog d4 = ac3.getBean("bb",Dog.class);
        System.out.println(d4);

    }
}
