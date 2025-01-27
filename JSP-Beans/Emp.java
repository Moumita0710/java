package beans;

import java.io.Serializable;

public class Emp implements Serializable{
int empno;
String ename;
public Emp()
{
	super();
	
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno=empno;
}
public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}
}
