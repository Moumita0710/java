package jdbcDemo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.util.*;
public class EmpDao {
private JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	System.out.println("I am in set jdbc template");
	this.jdbcTemplate=jdbcTemplate;
	
}
public int saveEmployee(Employee e) {
	String query="insert into employee value('"+e.getId()+"','"+e.getFirst_name()+"','"+e.getLast_name()
	+"','"+e.getSalary()+"')";
	return jdbcTemplate.update(query);
}
public List<Employee> getAllEmployees()
{
	return jdbcTemplate.query("select * from employee",new ResultSetExtractor <List<Employee>>()
			{
		       public List <Employee> extractData (ResultSet rs) throws SQLException,DataAccessException
		       {
		
		    	  List<Employee> list=new ArrayList<Employee>(); 
		           while(rs.next()) {
		        	   Employee e=new Employee();
		        	   e.setId(rs.getInt(1));
		        	   e.setFirst_name(rs.getString(2));
		        	   e.setLast_name(rs.getString(3));
		        	   e.setSalary(rs.getInt(4));
		        	   list.add(e);
		}
		           return list;
			}
			}	
			);
}
}
