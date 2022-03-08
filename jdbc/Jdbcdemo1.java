package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbcdemo1 {

	public static void main(String[] args) throws Exception{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","latchu20");
			Statement st=con.createStatement();
			String query="create table employee(id int primary key,ename varchar(20),esalary int(5))";
			//String query1=
	st.executeUpdate(query);
	//System.out.println("table created");
	st.close();
	con.close();
	
	}

}
