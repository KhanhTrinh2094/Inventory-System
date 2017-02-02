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
public class Category {
    public String  catName, Description;
    public int catID;
     

    public Category() {
    }

    public Category(String catName, String Description, int catID) {
        this.catName = catName;
        this.Description = Description;
        this.catID = catID;
    }

   

   

   
    public Vector toVector() {
        Vector v;
        v = new Vector();
        v.add(catID);
        v.add(catName);
        v.add(Description);
        
        return v;
        
        
    }
    
    
}

