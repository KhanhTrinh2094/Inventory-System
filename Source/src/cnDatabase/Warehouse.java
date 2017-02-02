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
public class Warehouse {
    public String warehouseID, name, adress, phone ;
  
     

    public Warehouse() {
    }

    public Warehouse(String warehouseID, String name, String adress, String phone) {
        this.warehouseID = warehouseID;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }

   

   

   
    public Vector toVector() {
        Vector v;
        v = new Vector();
        v.add(warehouseID);
        v.add(name);
        v.add(adress);
        v.add(phone);
        return v;
        
        
    }
    
    
}

