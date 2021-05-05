import java.sql.*;
import javax.swing.*;
public class bbm_class {
     Connection conn;
     public static Connection bbm_class1()
     {
         String sql="com.mysql.jdbc.Driver";
         try
         {
             Class.forName(sql);
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbm","root","");
             return conn;
         }
         catch(Exception ex)
         {
             JOptionPane.showMessageDialog(null,ex);
             return null;
         }
     }
    
}
