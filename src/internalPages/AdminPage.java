/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;
import config.dbConnector;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import myapp.AdminForm;
import myapp.UserSessions;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public final class AdminPage extends javax.swing.JInternalFrame {

    private int rowlndex;

    /**
     * Creates new form userPage
     */
    public AdminPage() {
        initComponents();
        
       
        displayData();
        
        
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
       BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
       
        
       
        
    }
    
    
    public void displayData(){
try{
dbConnector dbc = new dbConnector();
ResultSet rs = dbc.getData("SELECT* FROM  tbl_admin");

}catch(SQLException ex){
System.out.println("Errors:"+ex.getMessage());

}

}
    
    
    Color navcolor = new Color(204,204,255);
    Color headcolor = new Color(153,153,255);
    Color bodycolor = new Color(255,204,255);

    
  
  
    
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adpos = new javax.swing.JTextField();
        adad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        Change_image = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(917, 606));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(917, 606));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(917, 606));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ADMIN");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, 30));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(230, 0, 470, 70);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 70));

        edit.setBackground(new java.awt.Color(204, 204, 255));
        edit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Refresh");
        edit.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, 40));

        jLabel2.setText("Position:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 90, -1));

        adpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adposActionPerformed(evt);
            }
        });
        jPanel1.add(adpos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 220, 30));
        jPanel1.add(adad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 220, 30));

        jLabel3.setText("Address:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, 20));

        jLabel5.setText("Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, 20));
        jPanel1.add(adname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 220, 30));

        jLabel6.setText("Image");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 220, 190));

        jLabel7.setText("Username:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 170, 20));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 220, 30));

        jLabel8.setText("Password:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 180, 20));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 220, 30));

        Change_image.setBackground(new java.awt.Color(204, 204, 255));
        Change_image.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Change_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_imageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Change_imageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Change_imageMouseExited(evt);
            }
        });
        Change_image.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Image");
        Change_image.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Change");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        Change_image.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        jPanel1.add(Change_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        
        
        edit.setBackground(bodycolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        
        
        edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked

      try {
    dbConnector dbc = new dbConnector();
    int adminId = UserSessions.getAdminId(); // Assuming you have the admin ID stored in UserSessions

    // Retrieve admin information based on the admin ID
    ResultSet resultSet = dbc.getData("SELECT * FROM tbl_admin WHERE ad_id = " + adminId);

    if (resultSet.next()) {
        // Retrieve the admin information from the result set
        String fullName = resultSet.getString("ad_fullname");
        String position = resultSet.getString("ad_position");
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        String filePath = resultSet.getString("ad_imagepath");
        String fileName = resultSet.getString("ad_imagename");

        try {
            // Assuming resultSet contains the retrieved data from the database
            Blob imageBlob = resultSet.getBlob("ad_imagefile");
            InputStream inputStream = imageBlob.getBinaryStream();
            Image image = ImageIO.read(inputStream);
            ImageIcon imageIcon = new ImageIcon(image);
            img.setIcon(imageIcon);
        } catch (SQLException | IOException e) {
            // Handle the exception here
            e.printStackTrace();
        }

        // Set the admin information in the text fields
        adname.setText(fullName);
        adpos.setText(position);
        adad.setText(username);
        user.setText(username);
        pass.setText(password);

        // Handle the additional fields as needed
    } else {
        // Admin information not found
        System.out.println("Admin information not found!");
    }
} catch (SQLException e) {
    e.printStackTrace();
}

    }//GEN-LAST:event_editMouseClicked

    private void adposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adposActionPerformed

    private void Change_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_imageMouseClicked
        // TODO add your handling code here:

        int adminId = UserSessions.getAdminId(); // Assuming you have the admin ID stored in a variable called adminId
dbConnector dbc = new dbConnector();
JFileChooser fileChooser = new JFileChooser();

// Set the file chooser to only accept image files
FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif");
fileChooser.setFileFilter(filter);

// Show the file chooser dialog
int result = fileChooser.showOpenDialog(null);

// Check if a file was selected
if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();

    try {
        // Read the contents of the selected file
        byte[] fileData = Files.readAllBytes(selectedFile.toPath());

        // Update the image in the database
        String updateQuery = "UPDATE tbl_admin SET ad_imagefile = ? WHERE ad_id = ?";

        // Create a PreparedStatement and set the parameter values
        PreparedStatement statement = dbc.connect_db().prepareStatement(updateQuery);
        statement.setBytes(1, fileData);
        statement.setInt(2, adminId);

        // Execute the update query
        int updateResult = statement.executeUpdate();

        if (updateResult == 1) {
            JOptionPane.showMessageDialog(null, "Image updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update image!");
        }
    } catch (IOException | SQLException e) {
        e.printStackTrace();
    }

        }

    }//GEN-LAST:event_Change_imageMouseClicked

    private void Change_imageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_imageMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Change_imageMouseEntered

    private void Change_imageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_imageMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Change_imageMouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Change_image;
    private javax.swing.JTextField adad;
    private javax.swing.JTextField adname;
    private javax.swing.JTextField adpos;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

}