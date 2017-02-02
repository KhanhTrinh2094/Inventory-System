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

public class UserList {

    ArrayList<User> blist = new ArrayList<>();

    public UserList() {
    }

    public ArrayList<User> getList() {
        ArrayList<User> bList = new ArrayList<>();
        //tao ket noi den CSDL
        Connection cn = Mylib.getCon();
        if (cn != null) {

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from tbUser");

                //xu ly ket qua
                //duyet cac dong trong rs => blist
                while (rs.next()) {
                    //doc du lieu cua cac cot tuong ung trong dong hien tai

                    String userID = rs.getString(1);
                    String fullName = rs.getString(2);
                    String Password = rs.getString(3);
                    String Sex = rs.getString(5);
                    String DOB = rs.getString(6);
                    String Phone = rs.getString(7);
                    String Adress = rs.getString(8);
                    int RoleID = rs.getInt(4);
                    bList.add(new User(userID, fullName, Password, Sex, DOB, Phone, Adress, RoleID));
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

    public boolean insert(User b) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "insert tbUser values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, b.userID);
            pst.setString(2, b.fullName);
            pst.setString(3, b.Password);
            pst.setString(5, b.Sex);
            pst.setString(6, b.DOB);
            pst.setString(7, b.Phone);
            pst.setString(8, b.Adress);
            pst.setInt(4, b.RoleID);
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }

    public boolean update(User b) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "update tbUser set fullName = ?,Password = ?, RoleID = ?,Sex = ?,DOB= ?, Phone = ?,Adress = ? where userID = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(8, b.userID);
            pst.setString(1, b.fullName);
            pst.setString(2, b.Password);
            pst.setString(4, b.Sex);
            pst.setString(5, b.DOB);
            pst.setString(6, b.Phone);
            pst.setString(7, b.Adress);

            pst.setInt(3, b.RoleID);
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }

    public boolean delete(String userID) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "delete from tbUser where userID = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, userID);

            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }
}
