package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable  
{
    public static void main(String[] args) 
    {
    	//creating the connection
        String Url = "jdbc:mysql://localhost:3306/ajpcores";
        String username = "root";
        String password = "uppi@2880";

        try (Connection con = DriverManager.getConnection(Url, username, password)) 
        {
        	//creating Statement
            Statement stmt = con.createStatement();

    String createTableQuery = "CREATE TABLE Teacher (" +"id SERIAL PRIMARY KEY, " +"name VARCHAR(50) NOT NULL, " +"age INT, " +"salary DECIMAL(10,2)" +")";

     //executing the Query
            stmt.executeUpdate(createTableQuery);
            
          //displaying the Output
            System.out.println("Table created successfully!");

            
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}