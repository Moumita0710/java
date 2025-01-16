package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the emp database table.
 * 
 */
@Entity
@NamedQuery(name="Emp.findAll", query="SELECT e FROM Emp e")
public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;

	private int deptno;

	@Lob
	@Column(name="emp_name")
	private String empName;

	@Id
	private int empno;

	private int salary;

	public Emp() {
	}

	public int getDeptno() {
		return this.deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpno() {
		return this.empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	

}