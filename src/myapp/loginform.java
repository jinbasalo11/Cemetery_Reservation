    package myapp;


import config.PasswordHasher;
import config.dbConnector;
import java.awt.BasicStroke;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class loginform extends javax.swing.JFrame {

     
    public loginform() {
        initComponents();
    }

    Color hover = new Color(153,153,255);
     Color defbutton = new Color(204,204,255);
     
     Border empty = BorderFactory.createEmptyBorder();
     
     public boolean isEmail(String input) {
    // Regular expression pattern for basic email format validation
    String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Check if the input matches the email pattern
    return input.matches(emailPattern);
}
     
     void buttonBorderAnimation(JPanel panel){
         panel.setBackground(hover);
         panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
         
     }
    
     void buttonDefaultColor(JPanel panel){
         
         panel.setBackground(defbutton);
         panel.setBorder(empty);
     }
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        cancel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 204, 255, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(204, 204, 204));
        username.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 290, 50));

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 1, true));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Exit");
        cancel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 30));

        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 140, 50));

        login.setBackground(new java.awt.Color(204, 204, 204));
        login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 1, true));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        jPanel3.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 130, 50));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("New User? Click here to Register");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Login Form");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-email-48.png"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 50, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-password-48.png"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 50, 50));

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 290, 50));

        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 560, 70));

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        jButton1.setText("Others");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(210, 170, 560, 530);

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(930, 10, 11, 22);

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("-");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize);
        minimize.setBounds(900, 10, 8, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/There is a Hope and a Purpose Beyond the Broken Places Archives ~ Cups of Hope Cafe.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 860);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked

        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }

    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        setState(ICONIFIED);

    }//GEN-LAST:event_minimizeMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:

        registrationForm rf = new registrationForm();
        rf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited

        buttonDefaultColor(login);
    }//GEN-LAST:event_loginMouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered

        buttonBorderAnimation(login);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
       String email = username.getText();
String pass = password.getText();

if (username.getText().isEmpty() || password.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All Fields are Required!");
} else {
    try {
        String rehashedPassword;
        String hashedpass;
        dbConnector dbc = new dbConnector();

        if (isEmail(email)) {
            // User login
            ResultSet rs = dbc.getData("SELECT * FROM tbl_userinfo WHERE us_email = '" + email + "'");

            if (rs.next()) {
                int userId = rs.getInt("us_id");
                UserSessions.setUserId(userId); //id ni sya ayaw saba
                int storedUserId = UserSessions.getUserId();

                // para check sa id
                System.out.println("Stored User ID: " + storedUserId);

                hashedpass = rs.getString("us_password");
                rehashedPassword = PasswordHasher.hashPassword(pass);

                if (email.equals(rs.getString("us_email")) && hashedpass.equals(rehashedPassword)) {
                    JOptionPane.showMessageDialog(null, "User Login Success!");
                    userdash df = new userdash();
                    this.dispose();
                    df.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid User Account!");
                    password.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "User Account not Found!");
                System.out.println("No user data Found");
            }
        } else {
            // Admin login
            ResultSet rs = dbc.getData("SELECT * FROM tbl_admin WHERE username = '" + email + "'");

            if (rs.next()) {
                int adminId = rs.getInt("ad_id");
                UserSessions.setAdminId(adminId);
                int storedAdminId = UserSessions.getAdminId();

                // Check the stored admin ID
                System.out.println("Stored Admin ID: " + storedAdminId);

                hashedpass = rs.getString("password");
                rehashedPassword = PasswordHasher.hashPassword(pass);

                if (email.equals(rs.getString("username")) && hashedpass.equals(rehashedPassword)) {
                    JOptionPane.showMessageDialog(null, "Admin Login Success!");
                    dashBoard df = new dashBoard();
                    this.dispose();
                    df.setVisible(true);
                    // Perform actions for admin login
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Admin Account!");
                    password.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Admin Account not Found!");
                System.out.println("No admin data Found");
            }
        }
    } catch (NoSuchAlgorithmException | SQLException ex) {
        System.out.println("" + ex);
    }
}

    }//GEN-LAST:event_loginMouseClicked

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited

        buttonDefaultColor(cancel);
    }//GEN-LAST:event_cancelMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered

        buttonBorderAnimation(cancel);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        // TODO add your handling code here:
 
        int a = JOptionPane.showConfirmDialog(null,"Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }

    }//GEN-LAST:event_cancelMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminForm field = new AdminForm();
                field.setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel close;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel login;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
