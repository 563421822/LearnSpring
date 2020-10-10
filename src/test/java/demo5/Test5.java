package demo5;

import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Arrays;

public class Test5 {
    @Test
    public void test() {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\WANG\\IdeaProjects\\LearnSpring\\src\\test\\resources\\applicationContext.xml");
        Example1 myexample = context.getBean("myexample", Example1.class);
        System.out.println(myexample);
        System.out.println("输出数组:");
        System.out.println(Arrays.toString(myexample.getHobby()));
        System.out.println("_________");

        System.out.println("输出List集合:");
        myexample.getHobby2().stream().forEach(System.out::println);
        System.out.println("_________");

        System.out.println("输出Set集合:");
        myexample.getHobby3().stream().forEach((v)-> System.out.println(v));
        System.out.println("_________");

        System.out.println("输出Map集合:");
        System.out.println(myexample.getHobby4());
        System.out.println("_________");

        System.out.println("输出Properties对象:");
        System.out.println(myexample.getProperties());
    }
}
