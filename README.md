# java

 ##PASSWORD CRACKER##
 
package June_22;
import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("note: user select right password then start MCQ EXAM...\n" +
                "Set Password:");
        String setPassword = sc.next();
        System.out.println("Enter Password:");
        String enterPassword = sc.next();
        if (enterPassword.equals(setPassword)) {
            System.out.println("You can start your MCQ exam");
            System.out.println(" 1. Who invented Java Programming?\n"+
                    "1. Guido van Rossum\n"+
                    "2. James Gosling\n"+
                    "3. Dennis Ritchie\n"+
                    "4. Bjarne Stroustrup");
            System.out.println("Select answer from options");
            int enteredAnswer;
            enteredAnswer=sc.nextInt();
            int correctAnswer=2;
            if(enteredAnswer==correctAnswer){
                System.out.println("right answer");
                int rightAnswer=3;
                System.out.println("Q2) Which component is used to compile, debug, and execute the Java programs?\n"+
                        "   1. JRE\n"+
                        "   2. JIT\n"+
                        "   3. JDK\n"+
                        "   4. JVM\n"+
                        "Select answer from options");
                enteredAnswer=sc.nextInt();
                if(enteredAnswer==rightAnswer){
                    System.out.println("right answer");
                }
                else {
                    System.out.println("Wrong answer... Try next year");
                }
            }
            else {
                System.out.println("Wrong answer... Try next year");
            }
        } else if (!enterPassword.equals(setPassword)) {
            System.out.println("Wrong password... try 2 more times out of 2");
            System.out.println("Enter Password:");
            enterPassword = sc.next();
            if (enterPassword.equals(setPassword)) {
                System.out.println("You can start your MCQ exam");
                System.out.println(" 1. Who invented Java Programming?\n"+
                        "1. ) Guido van Rossum\n"+
                        "2. ) James Gosling\n"+
                        "3. ) Dennis Ritchie\n"+
                        "4. ) Bjarne Stroustrup");
                System.out.println("Select answer from options");
                int enteredAnswer;
                enteredAnswer=sc.nextInt();
                int correctAnswer=2;
                if(enteredAnswer==correctAnswer){
                    System.out.println("right answer");
                    int rightAnswer=3;
                    System.out.println("Q2) Which component is used to compile, debug, and execute the Java programs?\n"+
                            "   1) JRE\n"+
                            "   2) JIT\n"+
                            "   3) JDK\n"+
                            "   4) JVM\n"+
                            "Select answer from options");
                    enteredAnswer=sc.nextInt();
                    if(enteredAnswer==rightAnswer){
                        System.out.println("right answer");
                    }
                    else {
                        System.out.println("Wrong answer... Try next year");
                    }
                }
                else {
                    System.out.println("Wrong answer... Try next year");
                }
            } else if (!enterPassword.equals(setPassword)) {
                System.out.println("Wrong password... try 1 more times out of 1");
                System.out.println("Enter Password:");
                enterPassword = sc.next();
                if (enterPassword.equals(setPassword)) {
                    System.out.println("You can start your MCQ exam");
                    System.out.println(" 1. Who invented Java Programming?\n"+
                            "1. ) Guido van Rossum\n"+
                            "2. ) James Gosling\n"+
                            "3. ) Dennis Ritchie\n"+
                            "4. ) Bjarne Stroustrup");
                    System.out.println("Select answer from options");
                    int enteredAnswer;
                    enteredAnswer=sc.nextInt();
                    int correctAnswer=2;
                    if(enteredAnswer==correctAnswer){
                        System.out.println("right answer");
                        int rightAnswer=3;
                        System.out.println("Q2) Which component is used to compile, debug, and execute the Java programs?\n"+
                                "   1) JRE\n"+
                                "   2) JIT\n"+
                                "   3) JDK\n"+
                                "   4) JVM\n"+
                                "Select answer from options");
                        enteredAnswer=sc.nextInt();
                        if(enteredAnswer==rightAnswer){
                            System.out.println("right answer");
                        }
                        else {
                            System.out.println("Wrong answer... Try next year");
                        }
                    }
                    else {
                        System.out.println("Wrong answer... Try next year");
                    }
                } else if (!enterPassword.equals(setPassword)) {
                    System.out.println("Wrong password... try 0 more times out of 0");
                }

            }
        }
        else {
            System.out.println("Enter Password:");
            enterPassword = sc.next();
            System.out.println("You have reached your try limit");
        }

    }}


##ADVANCED SALARY SYSTEM###
import java.util.Scanner;

public class AdvancedSalarySystem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your employee id:");
        String empid=sc.next();
        System.out.print("Enter your employee name:");
        String empName=sc.next();
        System.out.print("For which month and year you want your salary statement:");
        int month=sc.nextInt();

        switch (month){
            case 1: System.out.println("January 2024");
                break;
            case 2: System.out.println("February 2024");
                break;
            case 3: System.out.println("March 2024");
                break;
            case 4: System.out.println("April 2024");
                break;
            case 5: System.out.println("May 2024");
                break;
            case 6: System.out.println("June 2024");
                break;
            case 7: System.out.println("July 2024");
                break;
            case 8: System.out.println("August 2024");
                break;
            case 9: System.out.println("September 2024");
                break;
            case 10: System.out.println("October 2024");
                break;
            case 11: System.out.println("November 2024");
                break;
            case 12: System.out.println("December 2024");
                break;
            default : System.out.println(" Invaild...");
                break;

        }

        System.out.print("Your total working days are:");
        int monthDays=sc.nextInt();
        System.out.print("Enter your leave days:");
        int noOfLeaveDays=sc.nextInt();
        System.out.print("Enter conveyance allowance in %:");
        float conveyance=sc.nextFloat();
        System.out.print("Enter Medical Allowance in %:");
        int medical=sc.nextInt();
        System.out.print("Enter Other Allowance in %:");
        int other=sc.nextInt();
        System.out.print("Enter your basic salary:");
        float salary=sc.nextInt();
        float yearlySalary=salary*12;
        System.out.println("Your yearly salary is:"+yearlySalary);
        System.out.print("Enter Professional Tax  in %:");
        float profTax=sc.nextInt();
        int paidDays=monthDays-noOfLeaveDays;
        System.out.println("Your paid days are:"+paidDays);
        float leaveAmt=(salary/monthDays)*noOfLeaveDays;
        System.out.println("Your leave amount is:"+leaveAmt);
        float conveyanceAmt=yearlySalary*conveyance/100;
        System.out.println("Your conveyance amount is:"+conveyanceAmt);
        float medicalAllowance=yearlySalary*medical/100;
        System.out.println("Your medical allowance amount is:"+medicalAllowance);
        float otherAllowance=yearlySalary*other/100;
        System.out.println("Your medical allowance amount is:"+otherAllowance);
        float ctc=(yearlySalary+conveyanceAmt+medicalAllowance+otherAllowance);
        System.out.println("Your CTC is:"+ctc);
        float totalAllowance=conveyanceAmt+medicalAllowance+otherAllowance;
        System.out.println("Your total allowance amount is:"+totalAllowance);
        float profTaxAmt=(salary-leaveAmt)-(ctc*profTax/100);
        System.out.println("Your professional tax amount is:"+profTaxAmt);
        float totalDeduction=(profTaxAmt-leaveAmt)+salary;
        System.out.println("Your total deduction amount is:"+totalDeduction);
        float totalEarningMonthly=(salary*conveyance/100)+(salary*medical/100)+(salary*other/100);
        System.out.println("Your total monthly earning from allowances are:"+totalEarningMonthly);
        float netSalary=(totalEarningMonthly+salary)-totalDeduction;
        System.out.println("Your total net salary is:"+netSalary);

    }
}











    
