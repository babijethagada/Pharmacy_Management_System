/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author siddh
 */
public class ConnectionProvider {
    public static Connection getCon(){
     try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/getconnect","root","PFH#23kgrw9");
      if(con!=null)
      {
       System.out.println("Successfully connected");
      
      }
      return con;
     }
     catch(Exception e)
     {
       System.out.println(e);
       System.out.println("not connected");
       return null;
     
     }

    }
}
