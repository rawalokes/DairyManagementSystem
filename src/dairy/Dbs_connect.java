/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dairy;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author rawal
 */
public class Dbs_connect {
    
   
        public static Connection Connector2(){
       try{
            Class.forName("org.sqlite.JDBC");
            Connection c=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\RawaLokes\\Downloads\\Dairy\\Dairy\\Billpad.sqlite");
                                                                    
//            JOptionPane.showMessageDialog(null, "Connected");
            return c;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
}
}