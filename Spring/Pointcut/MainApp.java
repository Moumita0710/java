package Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args)
{
	ApplicationContext con=new ClassPathXmlApplicationContext("Pointcut/config.xml");
	Student stud=(Student) con.getBean("student");
	stud.getName();
	stud.getAge();
	System.out.println(stud.hello("testing"));
	try {
		stud.printThrowException();
	}catch(Exception e) {
		
	}
	
}
}
