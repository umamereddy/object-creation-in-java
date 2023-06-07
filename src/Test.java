public class Test {

    private final String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void testMethod(){
        System.out.println("I am in testMethod().......");
    }

    private static void privateStaticMethod(){
        System.out.println("I am in privateStaticMethod().......");
    }

    private  void privateMethod(){
        System.out.println("I am in privateMethod().......");
    }
}
