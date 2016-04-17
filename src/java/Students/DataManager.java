/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;


/**
 *
 * @author adamopoulo
 */
public class DataManager {
    public static synchronized Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lab", "root", "");
            con.setAutoCommit(true);
            return con;
                  
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("failed");
        }
    } 
    
}
