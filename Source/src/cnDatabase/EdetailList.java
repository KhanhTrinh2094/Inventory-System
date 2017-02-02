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

public class EdetailList {

    ArrayList<Edetail> blist = new ArrayList<>();

    public EdetailList() {
    }

    public ArrayList<Edetail> getList() {
        ArrayList<Edetail> bList = new ArrayList<>();
        //tao ket noi den CSDL
        Connection cn = Mylib.getCon();
        if (cn != null) {

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from tbExportDetail");

                //xu ly ket qua
                //duyet cac dong trong rs => blist
                while (rs.next()) {
                    //doc du lieu cua cac cot tuong ung trong dong hien tai

                    String detailID = rs.getString(1);
                    String billNo = rs.getString(2);
                    String productID = rs.getString(3);
                    int quantity = rs.getInt(4);
                    String comment = rs.getString(6);

                    bList.add(new Edetail(detailID, billNo, productID, comment, quantity));
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

    public boolean insert(Edetail b) {
        Connection cn = Mylib.getCon();
        try {
            String sql = "insert tbExportDetail values(?,?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, b.detailID);
            pst.setString(2, b.billNo);
            pst.setString(3, b.productID);
            pst.setInt(4, b.quantity);
            pst.setInt(5, 0);
            pst.setString(6, b.comment);
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

        return true;
    }

}
