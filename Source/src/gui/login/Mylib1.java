/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.login;
import java.sql.*;
/**
 *
 * @author ngô
 */
public class Mylib1 {
    public static Connection getCon() {
        Connection con = null;
        //1 nap driver loai 4
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             //2 tao ket noi
            
            String url = "jdbc:sqlserver://127.0.0.1:1433;database=dbInventory";
            
            con = DriverManager.getConnection(url,"sa","0985720255");
        } catch (ClassNotFoundException e) {
            System.out.println("loi sai nap driver!");
            e.printStackTrace();
        }catch(SQLException ex) {
            System.out.println("loi sai ket noi csdl!");
            ex.printStackTrace();
        }
        
        return con;
    }
    
}
