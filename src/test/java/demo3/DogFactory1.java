package demo3;

/**
 * 狗类工厂,用静态方法获得对象
 */
public class DogFactory1 {
    public static Dog getDog1(){
        System.out.println("用静态工厂得到狗类对象");
        return new Dog();
    }
}
