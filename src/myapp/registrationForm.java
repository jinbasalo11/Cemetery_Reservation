package myapp;


import config.PasswordHasher;
import config.dbConnector;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class registrationForm extends javax.swing.JFrame {

     
    public registrationForm() {
        initComponents();
    }
    private String selectedImagePath;
    Color hover = new Color(153,153,255);
     Color defbutton = new Color(204,204,255);
     
     Border empty = BorderFactory.createEmptyBorder();
     
     private void displayImage(String filePath) {
    ImageIcon imageIcon = new ImageIcon(filePath);
    
    
    Image image = imageIcon.getImage();
    Image scaledImage = image.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
    
    img.setIcon(scaledImageIcon);
}
     private String generateNewFileName(String originalFileName) {
    String extension = "";
    int dotIndex = originalFileName.lastIndexOf('.');
    if (dotIndex > 0 && dotIndex < originalFileName.length() - 1) {
        extension = originalFileName.substring(dotIndex + 1);
    }

    String baseName = originalFileName.substring(0, dotIndex);
    String randomSuffix = String.valueOf(System.currentTimeMillis() % 10000);
    return baseName + "_" + randomSuffix + "." + extension;
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
    
   public int validateRegister (){
      int result;
   if(fname.getText().isEmpty() ||lname.getText().isEmpty() || email.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty()   ){
    result = 0;
   }else{
   result = 1;
   }
    return result;
    }
    
   
    public String action;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        cancel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        register = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        image = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("-");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 30, -1));

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 30, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255,80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 13))); // NOI18N
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 320, 50));

        password.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setToolTipText("");
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 13))); // NOI18N
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 320, 50));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
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
        jLabel3.setText("Cancel");
        cancel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 150, -1));

        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 150, 50));

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });
        register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Register");
        register.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 150, -1));

        jPanel3.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 150, 50));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Already have account? Click here to Login");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registration Form");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        lname.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setToolTipText("");
        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 13))); // NOI18N
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 320, 50));

        email.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setToolTipText("");
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 13))); // NOI18N
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 320, 50));

        username.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setToolTipText("");
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 13))); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 320, 50));

        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 790, 70));

        image.setText("Select image");
        image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageActionPerformed(evt);
            }
        });
        jPanel3.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 260, 40));

        img.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                imgAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 260, 160));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 790, 680));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/There is a Hope and a Purpose Beyond the Broken Places Archives ~ Cups of Hope Cafe.jpg"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(1922, 1281));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 840));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 970, 840);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        
        
        buttonBorderAnimation(cancel);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
      
         buttonDefaultColor(cancel);
    }//GEN-LAST:event_cancelMouseExited

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
   
        
         buttonBorderAnimation(register);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
      
        
         buttonDefaultColor(register);
    }//GEN-LAST:event_registerMouseExited

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
    int check = validateRegister();
if (check == 1) {
    String pass;
    try {
        pass = PasswordHasher.hashPassword(password.getText());

        dbConnector dbc = new dbConnector();

        // Retrieve the file path and name
        String filePath = selectedImagePath != null ? selectedImagePath : "";
        File selectedFile = null;
        byte[] fileData = null;

        if (filePath != null && !filePath.isEmpty()) {
            selectedFile = new File(filePath);
            if (selectedFile.exists()) {
                try {
                    fileData = Files.readAllBytes(Paths.get(filePath));
                } catch (IOException e) {
                    System.out.println("Error reading file data: " + e.getMessage());
                }
            } else {
                System.out.println("Selected file does not exist: " + filePath);
            }
        }

        // Check if fileData is null and assign an empty byte array if it is
        if (fileData == null) {
            fileData = new byte[0];
        }

        // Get the filename or use a default value if selectedFile is null
        String filename = selectedFile != null ? selectedFile.getName() : "default.jpg";
        
       

        // Insert the data into the database
        int result = dbc.insertData("INSERT INTO tbl_userinfo (us_fname, us_lname, us_email, us_filepath, us_filename, us_fileimage, us_username, us_password) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
                new Object[] { fname.getText(), lname.getText(), email.getText(), filePath,
                        filename, fileData, username.getText(), pass });

        if (result == 1) {
            JOptionPane.showMessageDialog(null, "Successfully Registered!");
            loginform lf = new loginform();
            this.dispose();
            lf.setVisible(true);
        } else {
            System.out.println("Saving Data Failed!");
        }
    } catch (NoSuchAlgorithmException ex) {
        System.out.println("NoSuchAlgorithmException: " + ex.getMessage());
    }
}
      
    }//GEN-LAST:event_registerMouseClicked
    
    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        setState(ICONIFIED);
        
        
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
        System.exit(0);
        }  
    }//GEN-LAST:event_closeMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        
        


loginform lf = new loginform();
lf.setVisible(true);
this.dispose();
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        // TODO add your handling code here:
        loginform lf = new loginform();
        lf.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_cancelMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageActionPerformed
        // TODO add your handling code here:
        
     JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
    fileChooser.setFileFilter(filter);
    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        String filePath = selectedFile.getAbsolutePath();

        // Update the selectedImagePath variable with the file path
        selectedImagePath = filePath;

        // Display the selected image
        displayImage(selectedImagePath);
    }

    }//GEN-LAST:event_imageActionPerformed

    private void imgAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_imgAncestorAdded
        // TODO add your handling code here:
        
    
    // Load the image from the file
        if (selectedImagePath != null) {
            img.setIcon(null);
            
        // Display the image
        displayImage(selectedImagePath);
    }
        
    }//GEN-LAST:event_imgAncestorAdded

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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel close;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton image;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField password;
    private javax.swing.JPanel register;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

   
   
   
}
