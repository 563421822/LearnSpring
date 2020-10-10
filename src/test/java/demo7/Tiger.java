package demo7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("t1")
public class Tiger extends Pet {
    @Value("老虎")
    private String nickname;
    @Value("东北虎")
    private String breed;
    @Value("18")
    private byte age;

    @Override
    public String toString() {
        return "Tiger{" +
                "nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
