/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.man;

import cnDatabase.Import;
import cnDatabase.ImportList;
import cnDatabase.Mylib;
import cnDatabase.ProductList;
import cnDatabase.User;
import cnDatabase.*;
import gui.login.Mylib1;
import gui.login.login.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ngô
 */
public class PnReport extends javax.swing.JPanel {

    manHome man;
    /**
     * Creates new form PProduct
     */
    DefaultTableModel modelReceipt;
    TableRowSorter<TableModel> sorter;
    ProductList pl = new ProductList();

    public PnReport() {
        initComponents();
        initModel();
        ReportReceipt();

        sorter = (TableRowSorter<TableModel>) tbNote.getRowSorter();

    }

    public PnReport(manHome home) {
        this.man = home;
        this.man.setVisible(true);
        initComponents();

        initModel();
        ReportReceipt();
        sorter = (TableRowSorter<TableModel>) tbNote.getRowSorter();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNote = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbName = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbCat = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        rbName = new javax.swing.JRadioButton();
        rbAll = new javax.swing.JRadioButton();
        rbCat = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        btnReceipt = new javax.swing.JButton();
        btnIssue = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnProduct = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        tbNote.setAutoCreateRowSorter(true);
        tbNote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Category", "Qantity", "Price", "Unit", "Manufacturer", "Status"
            }
        ));
        tbNote.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbNoteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbNote);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Name");

        jLabel2.setText("Category");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbName);

        buttonGroup1.add(rbAll);
        rbAll.setSelected(true);
        rbAll.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbAllStateChanged(evt);
            }
        });
        rbAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbAllItemStateChanged(evt);
            }
        });
        rbAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAllActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbCat);

        jLabel8.setText("All");

        btnReceipt.setText("Receipt");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });

        btnIssue.setText("Issue");
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnReceipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbName)
                            .addComponent(rbCat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(btnSearch)))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAll, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(rbName, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnReceipt)
                                .addComponent(btnIssue))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbCat))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        btnProduct.setText("Product need import");
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        btnSum.setText("Sum report");
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });

        jButton1.setText("Print receipt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Print Issue");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSum)
                .addGap(46, 46, 46)
                .addComponent(jButton2)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProduct)
                    .addComponent(btnSum)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        sorter.setRowFilter(null);
        modelReceipt.setRowCount(0);
        Pnip();
        if (modelReceipt.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "there is not any product need receipt! ");
        }
        modelReceipt = (DefaultTableModel) tbNote.getModel();
        btnReceipt.setBackground(Color.LIGHT_GRAY);
        btnIssue.setBackground(Color.LIGHT_GRAY);
        btnProduct.setBackground(Color.RED);

    }//GEN-LAST:event_btnProductActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        man.trypane.removeAll();
        man.trypane.add(new PnStock(man, this));
        man.trypane.validate();
        man.trypane.updateUI();
    }//GEN-LAST:event_btnSumActionPerformed

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
        sorter.setRowFilter(null);
        modelReceipt.setRowCount(0);
        ReportReceipt();
        modelReceipt = (DefaultTableModel) tbNote.getModel();
        btnReceipt.setBackground(Color.red);
        btnIssue.setBackground(Color.LIGHT_GRAY);
        btnProduct.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnReceiptActionPerformed

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        sorter.setRowFilter(null);
        modelReceipt.setRowCount(0);
        ReportIssue();
        modelReceipt = (DefaultTableModel) tbNote.getModel();
        btnIssue.setBackground(Color.red);
        btnReceipt.setBackground(Color.LIGHT_GRAY);
        btnProduct.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnIssueActionPerformed

    private void rbAllStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbAllStateChanged

    }//GEN-LAST:event_rbAllStateChanged

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (rbCat.isSelected() == false && rbName.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "please! choose by name or category.");
            return;
        }
        String c = cbCat.getSelectedItem().toString().trim();
        String b = cbName.getSelectedItem().toString().trim();

        ArrayList filters = new ArrayList();
        if (rbCat.isSelected()) {
            filters.add(RowFilter.regexFilter(c, 2));
        } else {
            filters.add(RowFilter.regexFilter(b, 1));
        }

        RowFilter fooBarFilter = RowFilter.andFilter(filters);
        sorter.setRowFilter(fooBarFilter);
        sorter = (TableRowSorter<TableModel>) tbNote.getRowSorter();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rbAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbAllItemStateChanged
        sorter.setRowFilter(null);
        if (rbAll.isSelected()) {
            if (btnReceipt.getBackground() == Color.RED) {
                btnReceiptActionPerformed(null);
            } else if (btnIssue.getBackground() == Color.RED) {
                btnIssueActionPerformed(null);
            } else if (btnProduct.getBackground() == Color.RED) {
                btnProductActionPerformed(null);
            }
        }
    }//GEN-LAST:event_rbAllItemStateChanged

    private void tbNoteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbNoteAncestorAdded

    }//GEN-LAST:event_tbNoteAncestorAdded

    private void rbAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport("report//reportReceipt.jasper", null, Mylib.getCon());
            JasperViewer jv = new JasperViewer(jasperPrint, false);
            jv.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport("report//reportIssue.jasper", null, Mylib.getCon());
            JasperViewer jv = new JasperViewer(jasperPrint, false);
            jv.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSum;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbCat;
    private javax.swing.JComboBox cbName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbAll;
    private javax.swing.JRadioButton rbCat;
    private javax.swing.JRadioButton rbName;
    private javax.swing.JTable tbNote;
    // End of variables declaration//GEN-END:variables

    private void initModel() {
        modelReceipt = (DefaultTableModel) tbNote.getModel();
        modelReceipt.setRowCount(0);
        btnReceipt.setBackground(Color.red);
        ProductList p = new ProductList();
        for (Product o : p.getList()) {
            cbName.addItem(o.name);
        }
        CategoryList c = new CategoryList();
        for (Category o : c.getList()) {
            cbCat.addItem(o.catName);
        }
    }

    public void ReportReceipt() {
        // modelReceipt = new DefaultTableModel();
        Connection cn = Mylib.getCon();
        if (cn != null) {

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select productID,sum(quantity)as quan from tbImportDetail group by productID");
                while (rs.next()) {
                    Vector v = new Vector();
                    String ProductID = rs.getString(1);
                    int quan = rs.getInt(2);
                    for (Product o : pl.getList()) {
                        if (ProductID.equals(o.productID)) {
                            v.add(o.productID);
                            v.add(o.name);
                            int cID = o.catID;
                            CategoryList cl = new CategoryList();
                            for (Category cat : cl.getList()) {
                                if (cID == cat.catID) {
                                    v.add(cat.catName);
                                }
                            }
                            v.add(quan);
                            v.add(o.unitPrice);
                            v.add(o.Unit);
                            v.add(o.manufacturer);
                            v.add(o.status);
                        }
                    }
                    modelReceipt.addRow(v);

                }
                //dong connection
                rs.close();
                cn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void ReportIssue() {
        // modelIssue = new DefaultTableModel();
        Connection cn = Mylib.getCon();
        if (cn != null) {

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select productID,sum(quantity)as quan from tbExportDetail group by productID");
                while (rs.next()) {
                    Vector v = new Vector();
                    String ProductID = rs.getString(1);
                    int quan = rs.getInt(2);
                    for (Product o : pl.getList()) {
                        if (ProductID.equals(o.productID)) {
                            v.add(o.productID);
                            v.add(o.name);
                            int cID = o.catID;
                            CategoryList cl = new CategoryList();
                            for (Category cat : cl.getList()) {
                                if (cID == cat.catID) {
                                    v.add(cat.catName);
                                }
                            }
                            v.add(quan);
                            v.add(o.unitPrice);
                            v.add(o.Unit);
                            v.add(o.manufacturer);
                            v.add(o.status);

                        }
                    }
                    modelReceipt.addRow(v);

                }
                //dong connection
                rs.close();
                cn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void Pnip() {
        for (Product o : pl.getList()) {
            if (o.Quantity < 5) {
                Vector v = new Vector();
                v.add(o.productID);
                v.add(o.name);
                int cID = o.catID;
                CategoryList cl = new CategoryList();
                for (Category cat : cl.getList()) {
                    if (cID == cat.catID) {
                        v.add(cat.catName);
                    }
                }
                v.add(o.Quantity);
                v.add(o.unitPrice);
                v.add(o.Unit);
                v.add(o.manufacturer);
                v.add(o.status);
                modelReceipt.addRow(v);
            }
        }

    }
}
