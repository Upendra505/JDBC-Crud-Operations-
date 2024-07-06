package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainerBatch {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	       Class.forName("com.mysql.cj.jdbc.Driver");
	       //Established the  Connection With the DataBase       
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpcores","root","uppi@2880");
	     //    Creating a Statement
	             Statement stmt =con.createStatement();
	       //Execute The Query With Help of the Reasult Set.
	             stmt.addBatch("insert into teacher values(25,'Tharun',22,16500)");
	             stmt.addBatch("insert into teacher values(26,'Ramya',21,16500)");
	             stmt.addBatch("insert into teacher values(27,'siddu',24,16500)");
	             //update the values
	             stmt.addBatch("update teacher set salary =2500 where id = 25");
	             
	          int[] arr =   stmt.executeBatch();
	          if(arr.length!=0) {
	        	  System.out.println("The number of records are Inserted/updated="+arr.length);
	          }else
	          {
	        	  System.out.println("there is some issues");
	          }
                stmt.close();	
                }

}
