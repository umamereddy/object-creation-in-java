import java.util.Objects;

public class Employee implements Cloneable {

    private int Id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Employee() {

    }

    public int getId() {
        return Id;
    }

    public Employee(int id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        Id = id;
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

    private String name;
    private int age;


    private void privateMethod() {
        System.out.println("I am a privateMethod()...");
    }

    private static void privateStaticMethod(){
        System.out.println("I am a privateStaticMethod()...");
    }

    public static void publicStaticMethod(){
        System.out.println("I am a publicStaticMethod()...");
    }

    public void publicMethod(){
        System.out.println("I am a public method..");
    }

    @Override
    public String toString() {
        return "Employee {"
                + "Id=" + Id
                + ", name=" + name
                + ", age=" +  age
                + "}";

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Id == employee.Id && age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, age);
    }
}
