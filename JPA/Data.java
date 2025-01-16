package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Data {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("MyJPA");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		//manager.getTransaction().begin();
		//-------insert records-------
//		Emp ob=new Emp();
//		ob.setDeptno(777);
//		ob.setEmpName("Moumita");
//		ob.setEmpno(101);
//		ob.setSalary(30000);
//		manager.persist(ob);
//		manager.getTransaction().commit();
//		System.out.println("Record Save");
		
		//-------display records-------
//		transaction.begin();
//		List<Emp> all=manager.createQuery("select e from Emp e").getResultList();
//		System.out.println("All Students");
//		System.out.println("empno\temp_name\tdeptno\tsalary");
//		System.out.println("--------------------------------");
//		for(Emp e:all) {
//			System.out.print(e.getDeptno()+"  ");
//			System.out.print(e.getEmpName()+"  ");
//			System.out.print(e.getEmpno()+"  ");
//			System.out.println(e.getSalary()+"  ");
//		}
//		transaction.commit();
		
		//-------update records-------
//        transaction.begin();
//		Emp updateEmp=manager.find(Emp.class,103);
//		updateEmp.setEmpName("Suman");
//		
//		transaction.commit();
//		System.out.println("Record updated");
		
		//-------Delete records-------
		transaction.begin();
		Emp delEmp=manager.find(Emp.class,102);
		manager.remove(delEmp);
		transaction.commit();
		System.out.println("Record deleted");
//		
	}

}
