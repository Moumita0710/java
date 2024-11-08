package Stream;
import java.sql.*;
public class JdbcDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver registered");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
        System.out.println("Connection established");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from emp");
        System.out.println("Empno\tName\tSalary\tDeptno");
        System.out.println("-----------------------------");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
        }
    }
}
