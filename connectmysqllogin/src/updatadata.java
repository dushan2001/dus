
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dushan
 */
public class updatadata {
    public static void main(String args[]) throws SQLException{
               //credential
               String url="jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=CONVERT_TO_NULL";
               String username="root";
               String password="dushan123!@#";
               
               Connection conn=null;
               Statement stmt =null;
               
               try{
                   //Getting the connecton to the database
                   conn=DriverManager.getConnection(url,username, password);
                   
                   //creating the statement
                   stmt=conn.createStatement();
                   
                   //Executing the sql query
                   
                   String sql= "UPDATE log SET";
                   
                   int rowAffected= stmt.executeUpdate(sql);
                   String rowsAffected = null;
                   
                   System.out.println("Rows affected:"+ rowsAffected);
                   System.out.println("Update Completed!");
                   
               
              
               }catch(SQLException ex){
               }finally{
                   if(stmt !=null){
                       stmt.close();
                   }
                   if(conn !=null){
                       conn.close();
                   }
               }
    }   
    }
