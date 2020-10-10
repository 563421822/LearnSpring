package cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    //    创建增强对象
    private Enhancer enhancer = new Enhancer();

    public Object getClass(Class clazz) {
//        将原类(被代理的类)设为当前类的父类
        enhancer.setSuperclass(clazz);
//        将处理器对象设置子对象中
        enhancer.setCallback(this);
        return enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前的操作");
//        调用父方法执行反射操作
//        把从父类继承过来的方法拦截后执行前后操作
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("方法执行后的操作");
        return o1;
    }
}
