package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "e1")
public class Entity {
    @Value(value = "王永亮")
    private String name;
    @Value(value = "19")
    private Integer age;
    @Value(value = "160.0")
    private float height;

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
