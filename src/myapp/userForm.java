/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import config.dbConnector;
import internalPages.reservationPage;
import internalPages.userPage;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class userForm extends javax.swing.JFrame {

    /**
     * Creates new form reservationForm
     */
    public userForm() {
        initComponents();
    }
    
    
    public void close(){
     this.dispose();
dashBoard dash = new dashBoard();
dash.setVisible(true);
userPage up = new userPage();
dash.maindesktop.add(up).setVisible(true);
    }
    
    
      public int validateRegister (){
      int result;
   if(fname.getText().isEmpty() ||lname.getText().isEmpty() || useremail.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty()  ){
    result = 0; 
   
   }else{
   result = 1;
   }
    return result;
    }
    
    
    Color navcolor = new Color(204,204,255);
    Color headcolor = new Color(153,153,255);
    Color bodycolor = new Color(255,204,255);
    
    
     public String action;
    
    
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        useremail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        add = new javax.swing.JPanel();
        rv_label = new javax.swing.JLabel();
        add1 = new javax.swing.JPanel();
        rv_label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filepath = new javax.swing.JTextField();
        filename = new javax.swing.JTextField();
        fileimage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(917, 606));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 255,80));
        jPanel2.setPreferredSize(new java.awt.Dimension(917, 606));
        jPanel2.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setText("Username:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(190, 260, 80, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("User ID:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(190, 140, 62, 40);

        userid.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        userid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        userid.setEnabled(false);
        userid.setOpaque(false);
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        jPanel2.add(userid);
        userid.setBounds(290, 140, 260, 40);

        username.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        username.setOpaque(false);
        jPanel2.add(username);
        username.setBounds(290, 260, 260, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("First Name:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(190, 200, 87, 40);

        fname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fname.setOpaque(false);
        jPanel2.add(fname);
        fname.setBounds(290, 200, 260, 40);

        password.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        password.setOpaque(false);
        jPanel2.add(password);
        password.setBounds(290, 440, 260, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setText("Email:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(190, 380, 46, 40);

        useremail.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        useremail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        useremail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        useremail.setOpaque(false);
        jPanel2.add(useremail);
        useremail.setBounds(290, 380, 260, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("Last Name:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(190, 320, 84, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setText("Password:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(190, 440, 78, 40);

        lname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lname.setOpaque(false);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname);
        lname.setBounds(290, 320, 260, 40);

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rv_label.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rv_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rv_label.setText("Label");
        rv_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rv_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rv_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rv_labelMouseExited(evt);
            }
        });
        add.add(rv_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 20));

        jPanel2.add(add);
        add.setBounds(260, 520, 80, 40);

        add1.setBackground(new java.awt.Color(255, 255, 255));
        add1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add1MouseExited(evt);
            }
        });
        add1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rv_label1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rv_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rv_label1.setText("Back");
        rv_label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rv_label1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rv_label1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rv_label1MouseExited(evt);
            }
        });
        add1.add(rv_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 20));

        jPanel2.add(add1);
        add1.setBounds(470, 520, 80, 40);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UserForm");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 20, 750, 60);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 750, 570));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/There is a Hope and a Purpose Beyond the Broken Places Archives ~ Cups of Hope Cafe.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 770));

        filepath.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        filepath.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filepath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        filepath.setOpaque(false);
        filepath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filepathActionPerformed(evt);
            }
        });
        jPanel1.add(filepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 0));

        filename.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        filename.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        filename.setOpaque(false);
        jPanel1.add(filename, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        fileimage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        fileimage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fileimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fileimage.setOpaque(false);
        fileimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileimageActionPerformed(evt);
            }
        });
        jPanel1.add(fileimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited

        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(bodycolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
       
    }//GEN-LAST:event_addMouseClicked

    private void rv_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_labelMouseExited
        // TODO add your handling code here:

        rv_label.setBackground(navcolor);
    }//GEN-LAST:event_rv_labelMouseExited

    private void rv_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_labelMouseEntered
        // TODO add your handling code here:
        rv_label.setBackground(bodycolor);

    }//GEN-LAST:event_rv_labelMouseEntered

    private void rv_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_labelMouseClicked
 if(action.equals("Add")){
     
     
     int check = validateRegister();
     if(check == 1){
     dbConnector dbc = new dbConnector();
            int result;
            result = dbc.insertData("INSERT INTO tbl_userinfo (us_fname, us_lname, us_email, us_filepath, us_filename, us_fileimage, us_username, us_password) VALUES ('" + fname.getText() + "', '" + lname.getText() + "', '" + useremail.getText() + "', 'pending', 'pending', 'pending', '" + username.getText() + "', '" + password.getText() + "')");
            if(result == 1){
            JOptionPane.showMessageDialog(null,"Successfully Save!");
            close();
            }else{
                System.out.println("Saving Data Failed!");
        }
    }else{
            JOptionPane.showMessageDialog(null,"All fields are required!");
     }
     
     
     
    }else if (action.equals("Update")) {
    int userId = UserSessions.getUserId();

try {
    // Retrieve the updated values from the input components
    String updatedFirstName = fname.getText();
    String updatedLastName = lname.getText();
    String updatedEmail = useremail.getText();
    String updatedFilePath = filepath.getText();
    String updatedFileName = filename.getText();
    String updatedFileImage = fileimage.getText();
    String updatedUsername = username.getText();
    String updatedPassword = password.getText();
    String updateduserid = userid.getText();
    
    dbConnector dbc = new dbConnector();

    // Construct the SQL update query
    String updateQuery = "UPDATE tbl_userinfo SET us_fname = ?, us_lname = ?, us_email = ?, us_username = ?, us_password = ?, us_filepath = ?, us_filename = ?, us_fileimage = ? WHERE us_id = ?";

// Create a PreparedStatement and set the parameter values
PreparedStatement statement = dbc.connect_db().prepareStatement(updateQuery);
statement.setString(1, updatedFirstName);
statement.setString(2, updatedLastName);
statement.setString(3, updatedEmail);
statement.setString(4, updatedUsername);
statement.setString(5, updatedPassword);
statement.setString(6, updatedFilePath);
statement.setString(7, updatedFileName);
statement.setString(8, updatedFileImage);
statement.setString(9, updateduserid);

    // Execute the update query
    int result = statement.executeUpdate();

    if (result == 1) {
        JOptionPane.showMessageDialog(null, "User information updated successfully!");
        close();
    } else {
        JOptionPane.showMessageDialog(null, "Failed to update user information!");
    }
} catch (SQLException e) {
    e.printStackTrace();
}}
    }//GEN-LAST:event_rv_labelMouseClicked

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
       
    }//GEN-LAST:event_lnameActionPerformed

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
      
    }//GEN-LAST:event_useridActionPerformed

    private void rv_label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_label1MouseClicked
     close();      
    }//GEN-LAST:event_rv_label1MouseClicked

    private void rv_label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_label1MouseEntered
                rv_label1.setBackground(bodycolor);

    }//GEN-LAST:event_rv_label1MouseEntered

    private void rv_label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_label1MouseExited
                rv_label1.setBackground(navcolor);

    }//GEN-LAST:event_rv_label1MouseExited

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
        close(); 
    }//GEN-LAST:event_add1MouseClicked

    private void add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseEntered
      add1 .setBackground(bodycolor);
    }//GEN-LAST:event_add1MouseEntered

    private void add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseExited
      add1 .setBackground(navcolor);
    }//GEN-LAST:event_add1MouseExited

    private void filepathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filepathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filepathActionPerformed

    private void fileimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileimageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileimageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel add;
    public javax.swing.JPanel add1;
    public javax.swing.JTextField fileimage;
    public javax.swing.JTextField filename;
    public javax.swing.JTextField filepath;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField password;
    public javax.swing.JLabel rv_label;
    public javax.swing.JLabel rv_label1;
    public javax.swing.JTextField useremail;
    public javax.swing.JTextField userid;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}