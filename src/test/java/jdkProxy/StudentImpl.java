package jdkProxy;

public class StudentImpl implements IStudent{
    @Override
    public void showMyself() {
        System.out.println("执行自我介绍的方法");
    }
}
