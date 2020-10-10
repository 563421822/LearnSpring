package aopAdvice;

public class StudentImpl implements IStudent {

    @Override
    public void showMyself() {
        System.out.println("大家好,我叫王永亮,这是我的配置版的apo切点");
    }
}
