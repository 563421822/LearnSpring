package demo4;

public class Master {
    private String name;
    private short age;
    private Cat myCat;

    public Master(String name, short age) {
        System.out.println("1。调用有参构造");
        System.out.println("name = " + name + ", age = " + age);
    }

    public Master(short age, String name) {
        System.out.println("2。调用有参构造");
        System.out.println("age = " + age + ", name = " + name);
    }

    public Master(String name, short age, Cat myCat) {
        System.out.println("调用全参构造");
        this.name = name;
        this.age = age;
        this.myCat = myCat;
    }

    public Master() {
        System.out.println("调用无参构造");
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", myCat=" + myCat +
                '}';
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setMyCat(Cat myCat) {
        this.myCat = myCat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public Cat getMyCat() {
        return myCat;
    }
}
