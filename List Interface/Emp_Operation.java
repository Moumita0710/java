package Oct_2024;
import java.util.*;

public class Emp_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<Employee>();
        String exit;
        String name;
        int emp_no,salary;
        while(true){
            System.out.println("Select Operation:\n 1)Insert \n 2)Delete \n 3)Update \n 4)Search \n 5)Display");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("------------------");
                        System.out.print("Enter Employee name:");
                        name = sc.next();
                        System.out.print("Enter Employee no:");
                        emp_no = sc.nextInt();
                        System.out.print("Enter Employee salary:");
                        salary = sc.nextInt();
                        System.out.print("Do you want to continue?");
                        exit = sc.next();
                        emp.add(new Employee(name, emp_no, salary));
                        System.out.println("------------------");
                    }
                    while (exit.equalsIgnoreCase("yes"));
                    break;
                case 2:
                    //delete
                    System.out.println("Enter emp no you want ot delete");
                    int del=sc.nextInt();
                    Iterator<Employee>itr=emp.iterator();
                    while(itr.hasNext()){
                        Employee m=itr.next();
                        if(m.getEmp_no()==del){
                            emp.remove(m);
                            System.out.println("------------------");
                            break;
                        }
                        }
                    break;
                case 3:
                    //update
                    System.out.println("Enter employee no to update");
                    int pos=sc.nextInt();
                    Iterator<Employee>itr1=emp.iterator();
                    while(itr1.hasNext()){
                        Employee ob=itr1.next();
                        if(ob.getEmp_no()==pos){
                            System.out.println("Enter employee name");
                            String new_name=sc.next();
                            System.out.println("Enter employee no");
                            int newEmp_no=sc.nextInt();
                            System.out.println("Enter Employee Salary");
                            int new_salary=sc.nextInt();
                            ob.setEmp_name(new_name);
                            ob.setEmp_no(newEmp_no);
                            ob.setSalary(new_salary);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter Employee no");
                    int E_no=sc.nextInt();
                    Iterator<Employee> itr2=emp.iterator();
                    while (itr2.hasNext()){
                        Employee obj=itr2.next();
                        if(obj.getEmp_no()==E_no){
                            System.out.println(obj);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("*******Display Operation*******");
                    System.out.println("---------Employee Details---------");
                    for (Employee e : emp) {
                        System.out.println("Employee Name:" + e.getEmp_name());
                        System.out.println("Employee No:" + e.getEmp_no());
                        System.out.println("Employee Salary:" + e.getSalary());

                    }
                    break;
            }
        }
    }
}
