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
public class Idetail {
    public String detailID , billNo, productID,  comment ;
    int quantity;
  
     

    public Idetail() {
    }

    public Idetail(String detailID, String billNo, String productID, String comment, int quantity) {
        this.detailID = detailID;
        this.billNo = billNo;
        this.productID = productID;
        this.comment = comment;
        this.quantity = quantity;
    }

   

   
   

   
    public Vector toVector() {
        Vector v;
        v = new Vector();
        v.add(detailID);
        v.add(billNo);
        v.add(productID);
        v.add(comment);
        v.add(quantity);
        return v;
        
        
    }
    
    
}

