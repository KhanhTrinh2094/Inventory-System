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
public class Import {
    public String billNo, date, UserID, type, warehouseID, from, comment;
  
     

    public Import() {
    }

    public Import(String billNo, String date, String UserID, String type, String warehouseID, String from, String comment) {
        this.billNo = billNo;
        this.date = date;
        this.UserID = UserID;
        this.type = type;
        this.warehouseID = warehouseID;
        this.from = from;
        this.comment = comment;
    }

   
   

   
    public Vector toVector() {
        Vector v;
        v = new Vector();
        v.add(billNo);
        v.add(date);
        v.add(UserID);
        v.add(type);
        v.add(warehouseID);
        v.add(from);
        v.add(comment);
       
        return v;
        
        
    }
    
    
}

