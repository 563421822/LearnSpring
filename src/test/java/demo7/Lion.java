package demo7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("l1")
public class Lion extends Pet {
    @Value("狮子")
    private String nickname;
    @Value("中国狮子")
    private String breed;
    @Value("北美洲")
    private String location;

    @Override
    public String toString() {
        return "Lion{" +
                "nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
