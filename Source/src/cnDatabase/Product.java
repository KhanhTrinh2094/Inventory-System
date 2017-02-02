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
public class Product {
    public String productID, name, Unit,  status, manufacturer ;
    public int  catID, Quantity, unitPrice;
     

    public Product() {
    }

    public Product(String productID, String name, String Unit, String status, String manufacturer, int catID, int Quantity, int unitPrice) {
        this.productID = productID;
        this.name = name;
        this.Unit = Unit;
        this.status = status;
        this.manufacturer = manufacturer;
        this.catID = catID;
        this.Quantity = Quantity;
        this.unitPrice = unitPrice;
    }

   

   

   
    public Vector toVector() {
        Vector v;
        v = new Vector();
        v.add(productID);
        v.add(name);
        v.add(catID);
        v.add(Quantity);
        v.add(unitPrice);
        v.add(Unit);
        
        v.add(manufacturer);
        v.add(status);
        return v;
        
        
    }
    
    
}

