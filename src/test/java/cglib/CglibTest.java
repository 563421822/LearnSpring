package cglib;

import org.junit.Test;

/**
 * spring最难方法cglib的测试类
 */
public class CglibTest {
    @Test
    public void test() {
//        新建一个处理器类的对象
        CglibProxy proxy = new CglibProxy();
//        获得代理对象
        StudentServiceImpl service = (StudentServiceImpl) proxy.getClass(StudentServiceImpl.class);
//        变质了的StudentServiceImpl对象
        service.showMyself();

    }
}
