/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cnDatabase;

/**
 *
 * @author ngô
 * lop mo ta cau truc bang tbBatch
 */
import java.sql.*;
import java.util.Vector;
public class Role {
    public String  roleName, Description;
    public int RoleID;
     

    public Role() {
    }

    public Role(String roleName, String Description, int RoleID) {
        this.roleName = roleName;
        this.Description = Description;
        this.RoleID = RoleID;
    }

   

   

   

   
    public Vector toVector() {
        Vector v;
        v = new Vector();
        v.add(RoleID);
        v.add(roleName);
        v.add(Description);
        
        return v;
        
        
    }
    
    
}

