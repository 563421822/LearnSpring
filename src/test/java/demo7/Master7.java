package demo7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component(value = "master7")
public class Master7 {
    @Value("王永亮")
    private String name;
    @Value("10")
    private byte age;
    @Value("160")
    private double height;
    /*@Autowired
    @Qualifier("t1")*/

    @Resource(name = "l1",type = Pet.class)//type=Pet.class
    private Pet myPet;

    @Override
    public String toString() {
        return "Master7{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", myPet=" + myPet +
                '}';
    }
    @PostConstruct
    private void aa(){
        System.out.println("*****初始化的方法");
    }
    @PreDestroy
    private void bb(){
        System.out.println("销毁的方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMyPet(Pet myPet) {
        this.myPet = myPet;
    }
}
