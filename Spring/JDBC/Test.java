package jdbcDemo;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("jdbcDemo/JdbcContext.xml");
	EmpDao dao=(EmpDao)con.getBean("edao");
	int status=dao.saveEmployee(new Employee(78488,"Rishita", "Kamat",195000));
	System.out.println(status);
	List<Employee> list=dao.getAllEmployees();
	for(Employee e:list) {
		System.out.println(e.getFirst_name()+"\t");
		System.out.println(e.getLast_name()+"\t");
		System.out.println(e.getSalary()+"\t");
	}
	
}
}
