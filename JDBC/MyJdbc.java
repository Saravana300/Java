package corejava;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJdbc{
	public static void main(String[] args) throws SQLException, ClassNotFoundException{	
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javapractise", "root", "Sara123456**");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select id from studdetails where name=saro");
    
	 System.out.print(rs);
	}
}


 