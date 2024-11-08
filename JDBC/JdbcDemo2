package Stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JdbcDemo {
    static Connection connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver registered");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
        System.out.println("Connection established");
        return con;
    }
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
        Connection con=connect();
        Statement stmt=con.createStatement();
        System.out.println("Enter deptno:");
        int deptno=sc.nextInt();
        System.out.println("Enter sal:");
        int sal=sc.nextInt();
        //-------update--------
        PreparedStatement pst= con.prepareStatement("Update emp set salary=? where deptno=?");
        pst.setInt(1,sal);
        pst.setInt(2,deptno);
        int no=pst.executeUpdate();
        System.out.println(no+" records are updated");
        display();
        System.out.println(delete()+"records deleted");
        display();
    }


    static int delete() throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
        Connection con=connect();
        Statement stmt=con.createStatement();
        System.out.println("Enter empno:");
        int empno=sc.nextInt();
        PreparedStatement pst= con.prepareStatement("delete from emp where empno=?");
        pst.setInt(1, empno);
        int no=pst.executeUpdate();
        return no;
    }
    static void display() throws ClassNotFoundException, SQLException {
        Connection con=connect();
        Scanner sc=new Scanner(System.in);
        Statement stmt=con.createStatement();
        System.out.println("Enter deptno:");
        int deptno=sc.nextInt();
        ResultSet res=stmt.executeQuery("select * from emp where deptno="+deptno);
        System.out.println("Empno\tName\tSalary\tDeptno");
        System.out.println("-------------------------------");
        while(res.next()) {
            System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getInt(3)+"\t"+res.getInt(4));
        }
    }
}
