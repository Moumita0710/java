import java.util.Scanner;

public class Employee {
    String name[];
    int salary[];
    String designation[];
    float bonus[];

    Employee(String Name[],int Salary[], String Designation[],float Bonus[]) {
        name = Name;
        salary = Salary;
        designation=Designation;
        bonus=Bonus;
    }
    void all_data(){
        int size=name.length;
        System.out.println("Sr.no | Name | Designation | Salary | Bonus");
        for(int i=1;i<size;i++){
            System.out.println(i+"| "+name[i]+"| "+designation[i]+" |"+salary[i]+" |"+(bonus[i]*salary[i]/100+salary[i]));
        }
    }




}