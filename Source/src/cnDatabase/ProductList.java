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

public class ProductList {

    ArrayList<Product> blist = new ArrayList<>();

    public ProductList() {
    }

    public ArrayList<Product> getList() {
        ArrayList<Product> bList = new ArrayList<>();
        //tao ket noi den CSDL
        Connection cn = Mylib.getCon();
        if (cn != null) {

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from tbProduct");

                //xu ly ket qua
                //duyet cac dong trong rs => blist
                while (rs.next()) {
                    //doc du lieu cua cac cot tuong ung trong dong hien tai

                    String productID = rs.getString(1);
                    String name = rs.getString(2);
                    int catID = rs.getInt(3);
                    int Quantity = rs.getInt(4);
                    int unitPrice = rs.getInt(5);
                    String Unit = rs.getString(6);
                    String status = rs.getString(7);
                    String manufacturer = rs.getString(8);
                    bList.add(new Product(productID, name, Unit, status, manufacturer, catID, Quantity, unitPrice));
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

    public boolean insert(Product b) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "insert tbProduct values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, b.productID);
            pst.setString(2, b.name);
            pst.setInt(3, b.catID);
            pst.setInt(4, b.Quantity);
            pst.setInt(5, b.unitPrice);
            pst.setString(6, b.Unit);
            pst.setString(7, b.status);
            pst.setString(8, b.manufacturer);
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }

    public boolean update(Product b) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "update tbProduct set name = ?,catID = ?, Quantity = ?,unitPrice = ?,Unit= ?, status = ?,manufacturer = ? where productID = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(8, b.productID);
            pst.setString(1, b.name);
            pst.setInt(2, b.catID);
            pst.setInt(3, b.Quantity);
            pst.setInt(4, b.unitPrice);
            pst.setString(5, b.Unit);
            pst.setString(6, b.status);
            pst.setString(7, b.manufacturer);
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }

    public boolean delete(String productID) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "delete from tbProduct where productID = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, productID);

            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }
}
