package demo5;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Example1 {
    private String name;
    private int age;
    private boolean isSingle;
    private BigDecimal balance;
    private String[] hobby;
    private List<Object> hobby2;
    private Set<Object> hobby3;
    private Map<Object, Object> hobby4;
    private Properties properties;

    @Override
    public String toString() {
        return "Example1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isSingle=" + isSingle +
                ", balance=" + balance +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public List<Object> getHobby2() {
        return hobby2;
    }

    public void setHobby2(List<Object> hobby2) {
        this.hobby2 = hobby2;
    }

    public Set<Object> getHobby3() {
        return hobby3;
    }

    public void setHobby3(Set<Object> hobby3) {
        this.hobby3 = hobby3;
    }

    public Map<Object, Object> getHobby4() {
        return hobby4;
    }

    public void setHobby4(Map<Object, Object> hobby4) {
        this.hobby4 = hobby4;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
