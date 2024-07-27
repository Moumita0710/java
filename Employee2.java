import java.util.Scanner;

public class Employee2 {
    public static void main(String[] args) {
        String Name1[]={"Jiya","Onkita","Moumita","Aniket"};
        int Salary1[]={25000,50000,70000,80000};
        String Designation1[]={"hr","Sales Manager","Developer","Operation"};
        float Bonus1[]={2,4,6,8};
        Employee emp=new Employee(Name1,Salary1,Designation1,Bonus1);
        emp.all_data();

    }
}
