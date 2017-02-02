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
public class User {
    public String userID, fullName,Password, Sex, DOB ,Phone ,Adress;
    public int RoleID;
     

    public User() {
    }

    public User(String userID, String fullName, String Password, String Sex, String DOB, String Phone, String Adress, int RoleID) {
        this.userID = userID;
        this.fullName = fullName;
        this.Password = Password;
        this.Sex = Sex;
        this.DOB = DOB;
        this.Phone = Phone;
        this.Adress = Adress;
        this.RoleID = RoleID;
    }

   

   
    public Vector toVector() {
        Vector v;
        v = new Vector();
        v.add(userID);
        v.add(fullName);
        v.add(Password);
        v.add(Sex);
        v.add(DOB);
        v.add(Phone);
        v.add(Adress);
        v.add(RoleID);
        return v;
        
        
    }
    
    
}

