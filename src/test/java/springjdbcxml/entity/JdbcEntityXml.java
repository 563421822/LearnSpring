package springjdbcxml.entity;

public class JdbcEntityXml {
    private Integer id;
    private String name;
    private String password;
    private Integer age;
    private String hobby;

    public JdbcEntityXml(Integer id, String name, String password, Integer age, String hobby) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.hobby = hobby;
    }

    public JdbcEntityXml() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "JdbcEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
