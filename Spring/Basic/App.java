package Com.Basic.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("Com/Basic/SpringDemo/config.xml");
        Employee ob=(Employee) con.getBean("emp");
        System.out.println(ob);
    }
}
