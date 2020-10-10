package demo4;

import org.springframework.context.annotation.Lazy;

@Lazy(value = false)
public class Cat {
    private String nickname;
    private String breed;

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
