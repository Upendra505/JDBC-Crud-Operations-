package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//load the Drivers On the Project
       Class.forName("com.mysql.cj.jdbc.Driver");
       //Established the  Connection With the DataBase       
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpcores","root","uppi@2880");
     //    Creating a Statement
             Statement stmt =con.createStatement();
       //Execute The Query With Help of the Reasult Set.
      ResultSet rset = stmt.executeQuery("select *from Student");
      while(rset.next())
      {
    	  //printing the output
   	   System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getInt(3)+" "+rset.getString(4)+" ");
   	  
   	   
       }
      //Close The Statement
       stmt.close();
      rset.close();
       
	}

}
