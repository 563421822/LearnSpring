package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * StudentImpl类的代理处理器
 */
public class JdkProxy implements InvocationHandler {
    public Object target;

    //通过构造方法给目标对象赋值
    public JdkProxy(Object target) {
        this.target = target;
    }

    //第一个参数
//    第二个参数是代理方法的反射对象
//    第三个是原方法的参数
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("方法执行前的操作");
        Object invoke = method.invoke(target, objects);
        System.out.println("方法执行后的操作");
        return invoke;
    }
}
