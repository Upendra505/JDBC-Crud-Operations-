/**
 * 
 */
package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertValues
{
	

	public static void main(String args[]) throws SQLException
	{
	    String Url = "jdbc:mysql://localhost:3306/ajpcores";
        String username = "root";
        String password = "uppi@2880";

        try (Connection con = DriverManager.getConnection(Url, username, password)) 
        {
        	//creating the Statement
        	Statement stmt =con.createStatement();
        	  
        	   PreparedStatement psmt = con.prepareStatement("insert into Teacher values (?,?,?,?)"); //Execute The Query With Help of the prepareStatement
        	   //inserting the values...
        	   psmt.setInt(1,14);
        	   psmt.setString(2, "Srinivas");
        	   psmt.setInt(3,22);
        	   psmt.setInt(4, 16500);
        	   //executing the preparedStatement
        	   int i = psmt.executeUpdate();
        	   if(i!=0)
        	   { 
        		   //printing the Output
        		   System.out.println(" Row Values Are Inserted Sucessfully!");
        	   }
        	   else
        	   {
        		   System.out.println("Not inserted Values");
        	   }
        	   //closing the Connection
        	   stmt.close();
               psmt.close();
        	
        }
           catch(Exception e)
        {
        	   System.out.println(e);
        }

        
        
	}
}


