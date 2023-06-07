import com.sun.source.doctree.StartElementTree;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, InvocationTargetException {
        Employee e = new Employee() ;
        System.out.println("" +e.hashCode());


        //1. By using class.forName("string class name");
        Class<?> ref = Class.forName("Employee");
        Employee employee = (Employee) ref.newInstance();
        System.out.println(employee.hashCode());


        //2. By using java classloader
        Class<?> aClass = Employee.class.getClassLoader().loadClass("Employee");
        Employee employee1 = (Employee) aClass.newInstance();
        System.out.println(employee1.hashCode());

        //3. By using clone() method of object.
        Employee employee2 = (Employee) e.clone();
        System.out.println(employee2.hashCode());

        //4. By using reflection.
        Employee employee3 = Employee.class.getConstructor(int.class, String.class, int.class).newInstance(102, "Uma", 37);
        System.out.println(employee3);

        Employee employee4 = new Employee(111, "test", 34);
        System.out.println(employee4.hashCode());






        }

    }

