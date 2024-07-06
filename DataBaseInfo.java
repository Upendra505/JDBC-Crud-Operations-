package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseInfo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	       Class.forName("com.mysql.cj.jdbc.Driver");
	       //Established the  Connection With the DataBase       
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpcores","root","uppi@2880");
	     //    Creating a Statement
	             Statement stmt =con.createStatement();
	       //Execute The Query With Help of the Reasult Set.
	        DatabaseMetaData metaData = con.getMetaData();
	        
	        System.out.println("DriverName"+metaData.getDriverName());
	        System.out.println("DriverVersion"+metaData.getDriverVersion());
	        System.out.println("User Name"+metaData.getUserName());
	        
	       
			ResultSet rset = stmt.executeQuery("select *from teacher");
			
			ResultSetMetaData  metaData2=  rset.getMetaData();
			  System.out.println("TableName"+metaData2.getTableName(4));
			  
			  System.out.println("Column 1"+metaData2.getColumnName(1));
			  System.out.println("Column 2"+metaData2.getColumnName(2));
			  System.out.println("Column 3"+metaData2.getColumnName(3));
			  System.out.println("Column 4"+metaData2.getColumnName(4));
			  System.out.println(metaData2.getColumnLabel(1));
			  rset.close();
			  con.close();	
			  }

}
