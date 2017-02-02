package gui.login;

import cnDatabase.ServerFunction;
import javax.swing.JOptionPane;

public class ConfigDialog extends javax.swing.JDialog {

    public boolean validated;
    public login log ;
    public ServerFunction serverConnect;
    private String serverName, databaseName, username, password, port;

    public String getDatabaseName() {
        return databaseName;
    }

    public String getPassword() {
        return password;
    }

    public String getPort() {
        return port;
    }

    public String getServerName() {
        return serverName;
    }

    public String getUsername() {
        return username;
    }

    public ConfigDialog() {

        initComponents();
        txtServerName.requestFocusInWindow();
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
  public ConfigDialog(login log) {
      this.log = log;
      this.log.setVisible(false);
       initComponents();
        txtServerName.requestFocusInWindow();
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtServerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLoginName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDatabaseName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPortNumber = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        chkPortDefault = new javax.swing.JCheckBox();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText(" Database Configuration");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Server:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Login ID:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Database Name:");

        txtDatabaseName.setText("dbInventory");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Port:");

        txtPortNumber.setEditable(false);
        txtPortNumber.setText("1433");

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        chkPortDefault.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkPortDefault.setSelected(true);
        chkPortDefault.setText("Use default port");
        chkPortDefault.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPortDefaultStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(btSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExit)
                .addGap(187, 187, 187))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtServerName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPortNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassword)
                                    .addComponent(txtDatabaseName, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                            .addComponent(chkPortDefault)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtDatabaseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtServerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPortNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPortDefault))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Return the SQL Server instance name
    //Action taken when user presses Save button
    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        String server = txtServerName.getText().trim();
        String dataName = txtDatabaseName.getText().trim();
        String portSQL = txtPortNumber.getText().trim();
        String user = txtLoginName.getText().trim();
        String pass = txtPassword.getText().trim();
        if (server.equals("")) {
            JOptionPane.showMessageDialog(null, "Server name cannot be blank !");
            txtServerName.requestFocusInWindow();
            return;
        }
        if (dataName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Database name cannot be blank !");
            txtDatabaseName.requestFocusInWindow();
            return;
        }
        if (portSQL.isEmpty() && !chkPortDefault.isSelected()) {
            JOptionPane.showMessageDialog(null, "Port cannot be blank !");
            txtPortNumber.requestFocusInWindow();
            return;
        }
        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(null, "User name cannot be blank !");
            txtLoginName.requestFocusInWindow();
            return;
        }
        if (pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password cannot be blank !");
            txtPassword.requestFocusInWindow();
            return;
        }
        this.serverName = server;
        this.databaseName = dataName;
        this.username = user;
        this.password = pass;
        this.port = chkPortDefault.isSelected() ? "1433" : portSQL;
        validated = true;

        String dbServerName = "", dbName = "", dbUsername = "", dbPassword = "", dbPort = "";
        if (validated == true) {
            dbServerName = getServerName();
            dbName = getDatabaseName();
            dbUsername = getUsername();
            dbPassword = getPassword();
            dbPort = getPort();
            serverConnect = new ServerFunction(dbServerName, dbName, dbUsername,
                    dbPassword, dbPort);
            int check = serverConnect.openConnection();
            if (check ==0) {
                 serverConnect.saveConnectionParametersToFile(dbServerName, dbName, dbUsername, dbPassword, dbPort);
                  log.cn = serverConnect.getConnection();
                 dispose();
                 log.setVisible(true);
            }else{
                 JOptionPane.showMessageDialog(this, "Error while establishing connection."
                            + " Please try running the configuration again.");
            }
        }
       

}//GEN-LAST:event_btSaveActionPerformed

    //Action taken when user presses Exit button
    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        validated = false;
        dispose();
}//GEN-LAST:event_btExitActionPerformed
    //Use default SQL Server port if checkbox is selected, else requires input
    private void chkPortDefaultStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPortDefaultStateChanged
        if (chkPortDefault.isSelected()) {
            txtPortNumber.setText("1433");
            txtPortNumber.setEditable(false);
        } else {
            txtPortNumber.setEditable(true);
        }
    }//GEN-LAST:event_chkPortDefaultStateChanged

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
     ConfigDialog dialog = new ConfigDialog(new javax.swing.JFrame(), true);
     dialog.addWindowListener(new java.awt.event.WindowAdapter() {
     public void windowClosing(java.awt.event.WindowEvent e) {
     System.exit(0);
     }
     });
     dialog.setVisible(true);
     }
     });
     }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSave;
    private javax.swing.JCheckBox chkPortDefault;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDatabaseName;
    private javax.swing.JTextField txtLoginName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPortNumber;
    private javax.swing.JTextField txtServerName;
    // End of variables declaration//GEN-END:variables

}
