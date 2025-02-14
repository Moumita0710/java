package Com.Basic.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Basic.SpringCore.Person;
import Com.Basic.SpringCore.Passport;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext con=new ClassPathXmlApplicationContext("Com/Basic/SpringCore/config.xml");
    	Person ob=(Person) con.getBean("per1");
    	System.out.println(ob);
       
    }
}
