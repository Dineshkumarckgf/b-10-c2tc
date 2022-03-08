package jdbc;

import java.sql.*;


public class jdbcDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","latchu20");
		
    Statement st=con.createStatement();
//String query="create table student(id int primary key,sname varchar(20))";
   // String query1="insert into student values(1,'vaishu')";
  //  String query2="insert into student values(2,'papaa')";
    //String query3="insert into student values(3,'gud')";
   // String query3="delete from student where id=3";
  //String query2="update student set sname='raghul' where id=2"; 
    
//st.executeUpdate(query2);
System.out.println("table created");
System.out.println("inserted");
st.close();
con.close();
}
}
