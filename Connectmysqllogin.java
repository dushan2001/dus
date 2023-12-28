/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectmysqllogin;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Dushan
 */
public class Connectmysqllogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           //Register the connection
           //Get the class driver
           Class.forName("com.mysql.cj.jdbc.Driver");
           //get the database url
           String url="jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=CONVERT_TO_NULL";
           //create a string object of username and password of mysqlserver connection
           String username ="root";
           String password ="dushan123!@#";
           //create a connection object to register the driver
           Connection conn=DriverManager.getConnection(url, username, password);
           //create astring object of sql query
           String sql="SELECT*FROM log";
           //prepare the sql query
           PreparedStatement pst =conn.prepareStatement(sql);
           //get the result of sql query
           ResultSet rs =pst.executeQuery();
           
           System.out.println("The records selected are:");
            
           int id;
           String firstname;
           String lastname;
           String dob;
           String email;
           String mobileno;
           String postelcode;
           String  confirmpassword;
           
           while(rs.next()){
               id=rs.getInt(1);
               firstname=rs.getString(2);
               lastname=rs.getString(3);
               dob=rs.getString(4);
               email=rs.getString(5);
               mobileno=rs.getString(6);
               postelcode=rs.getString(7);
               password=rs.getString(8);
               confirmpassword=rs.getString(9);
               
               System.out.println(id+"   "+firstname+"     "+lastname+"    "+dob+"    "+email+"      "+mobileno+"         "+postelcode+""+password+"       "+confirmpassword);
                
           }
                }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           
       }
    }
    
}

     
                  
              
           
      