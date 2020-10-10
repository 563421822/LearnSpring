package jdkProxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestJdkProxy {
    @Test
    public void test() {
        IStudent stu = new StudentImpl();
        JdkProxy proxy = new JdkProxy(stu);
        IStudent proxyInstance = (IStudent) Proxy.newProxyInstance(TestJdkProxy.class.getClassLoader(), stu.getClass().getInterfaces(), proxy);
        System.out.println(proxy);
        proxyInstance.showMyself();
    }
}
