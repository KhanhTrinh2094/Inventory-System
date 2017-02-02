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

public class ExportList {

    ArrayList<Export> blist = new ArrayList<>();

    public ExportList() {
    }

    public ArrayList<Export> getList() {
        ArrayList<Export> bList = new ArrayList<>();
        //tao ket noi den CSDL
        Connection cn = Mylib.getCon();
        if (cn != null) {

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from tbExport");

                //xu ly ket qua
                //duyet cac dong trong rs => blist
                while (rs.next()) {
                    //doc du lieu cua cac cot tuong ung trong dong hien tai

                    String billNo = rs.getString(1);
                    String date = rs.getString(2);
                    String UserID = rs.getString(3);
                    String type = rs.getString(4);
                    String warehouseID = rs.getString(5);
                    String to = rs.getString(6);
                    String comment = rs.getString(7);
                   
                    bList.add(new Export(billNo, date, UserID, type, warehouseID, to, comment));
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

    public boolean insert(Export b) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "insert tbExport values(?,?,?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, b.billNo);
            pst.setString(2, b.date);
            pst.setString(3, b.UserID);
            pst.setString(4, b.type);
            pst.setString(5, b.warehouseID);
            pst.setString(6, b.to);
            pst.setString(7, b.comment);
          
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }

   
}
