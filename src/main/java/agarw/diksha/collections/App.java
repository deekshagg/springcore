package agarw.diksha.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Diksha!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("configcoll.xml");
        Employee emp1 = (Employee) context.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getMobile());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getCourses());
        System.out.println(emp1);
    }
}
