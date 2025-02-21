package Pointcut;
import org.springframework.stereotype.Service;
public class Student {
private Integer age;
private String name;
public void setAge(Integer age) {
	this.age=age;
}
public Integer getAge() {
	System.out.println("Age:"+age);
	return age;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	System.out.println("Name:"+name);
	return name;
}
public void printThrowException() {
	System.out.println("Exception raised");
	throw new IllegalArgumentException();
}
public String hello(String name) {
	try {
		Thread.sleep(500);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	return "Hello, "+name+"!";
}


}
