package DB;

/**
 *
 * @author mayank_matkar
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnector 
{
    static Connection cn = null;
    static Statement st = null;
    
    static
    {
       try
       {
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Driver Loaded");
         
         cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "root");
         System.out.println("Connected");
         
         st = cn.createStatement();
       } 
       
       catch(ClassNotFoundException e)
       {
         System.out.println(e);
       }    
       catch(SQLException e)
       {
         System.out.println(e);
       }    
    }

   public static Connection getConnection()
   {
     return cn;  
   }        
   public static Statement getStatement()
   {
     return st;  
   }        
}
