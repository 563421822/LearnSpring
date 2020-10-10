package demo6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "pig1")
public class Pig {
    @Value("蓝猫")
    private String nickname;
    @Value("19")
    private byte age;
    @Value("加菲猫")
    private String breed;
    @Value("hongmao")
    private String curl;

    public Pig() {
        System.out.println("这是狗的构造方法");
    }

    @Override
    public String toString() {
        return "Pig{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", curl='" + curl + '\'' +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCurl() {
        return curl;
    }

    public void setCurl(String curl) {
        this.curl = curl;
    }
}
