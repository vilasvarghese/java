package db;

import java.sql.*;  

class MysqlCon{  
	public static void main(String args[]) throws Exception{  
		System.out.println("Hi");
		Connection con= null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/hr","root","");  
			System.out.println("Connection created");
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			System.out.println("Statement created");
			ResultSet rs=stmt.executeQuery("select * from employee");  
			System.out.println("resultset created");
			
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
		}catch(Exception e){ System.out.println(e);} 
		finally {
			con.close();  
		}
		
	}  
}