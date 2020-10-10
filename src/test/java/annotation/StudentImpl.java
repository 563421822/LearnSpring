package annotation;

import org.springframework.stereotype.Component;

@Component(value = "stu2")
public class StudentImpl {
    public void showMyself() {
        System.out.println("大家好,我叫王永亮,这是我的注解版的apo切点");
    }
}
