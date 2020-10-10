package demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "master6")
public class Master6 {
    @Value("王永亮")
    private String name;
    @Value("11")
    private byte age;
    @Value("男")
    private char gender;
    //    自动赋值
    @Autowired
    private Pig pig;

    public Master6() {
        System.out.println("这是主人的构造方法");
    }

    @Override
    public String toString() {
        return "Master6{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", pig=" + pig +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPig(Pig pig) {
        this.pig = pig;
    }
}
