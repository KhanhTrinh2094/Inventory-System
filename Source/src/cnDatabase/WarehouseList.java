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

public class WarehouseList {

    ArrayList<Warehouse> blist = new ArrayList<>();

    public WarehouseList() {
    }

    public ArrayList<Warehouse> getList() {
        ArrayList<Warehouse> bList = new ArrayList<>();
        //tao ket noi den CSDL
        Connection cn = Mylib.getCon();
        if (cn != null) {

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from tbWarehouse");

                //xu ly ket qua
                //duyet cac dong trong rs => blist
                while (rs.next()) {
                    //doc du lieu cua cac cot tuong ung trong dong hien tai

                    String warehouseID = rs.getString(1);
                    String name = rs.getString(2);
                    String adress = rs.getString(3);
                    String phone = rs.getString(4);
                    bList.add(new Warehouse(warehouseID, name, adress, phone));
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

    public boolean insert(Warehouse b) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "insert tbWarehouse values(?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, b.warehouseID);
            pst.setString(2, b.name);
            pst.setString(3, b.adress);
            pst.setString(4, b.phone);
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }

    public boolean update(Warehouse b) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "update tbWarehouse set name = ?,adress = ?, phone = ? where warehouseID = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(4, b.warehouseID);
            pst.setString(1, b.name);
            pst.setString(2, b.adress);
            pst.setString(3, b.phone); 
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }

    public boolean delete(String warehouseID) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "delete from tbWarehouse where warehouseID = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, warehouseID);

            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }
}
