public class ObjectAndEquals {


    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Uma", 35);
        Employee e2 = new Employee(101, "Uma", 35);

        System.out.println( e1 == e2);
        System.out.println("Deep copy : " + e1.equals(e2));
    }
}