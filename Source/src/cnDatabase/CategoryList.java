/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnDatabase;

/**
 *
 * @author ngô
 */
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoryList {

    ArrayList<Category> blist = new ArrayList<>();

    public CategoryList() {
    }

    public ArrayList<Category> getList() {
        ArrayList<Category> bList = new ArrayList<>();
        //tao ket noi den CSDL
        Connection cn = Mylib.getCon();
        if (cn != null) {

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from tbCategory");

                //xu ly ket qua
                //duyet cac dong trong rs => blist
                while (rs.next()) {
                    //doc du lieu cua cac cot tuong ung trong dong hien tai

                    String catName = rs.getString(2);
                    String dec = rs.getString(3);
                    
                    int catId = rs.getInt(1);
                    bList.add(new Category(catName, dec, catId));
                }
                //dong connection
                rs.close();
                cn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return bList;
    }

    public boolean insert(Category b) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "insert tbCategory values(?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
           
            pst.setString(1, b.catName);
            pst.setString(2, b.Description);
           
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }

    public boolean update(Category b) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "update tbCategory set catName = ?,Description = ? where catID = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, b.catName);
            pst.setString(2, b.Description);
            pst.setInt(3, b.catID);
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }

    public boolean delete(int catID) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "delete from tbCategory where catID = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, catID);

            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }
}
