package demo3;

/**
 * 狗类工厂,用静态方法获得对象
 */
public class DogFactory2 {
    public Dog getDog2(){
        System.out.println("用工厂的实例方法得到狗类对象");
        return new Dog();
    }
}
