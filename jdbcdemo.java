package jdbc;
import java.sql.*;
public class jdbcdemo {
	public static void main(String[] args)throws Exception{

		Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Dinesh@27$");
Statement st=con.createStatement();
try{String query="create table student(ID int primary key,SName varchar(20),SMarks int)";
String query1="Insert into Student Value(6,'dine',40)";
String query2="Delete from Student Where ID=6";

st.executeUpdate(query1);}
catch(Exception e) {
		System.out.println("Student Table created successfully");}
st.close();
		con.close();
	}}