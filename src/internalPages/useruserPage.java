/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;
import config.dbConnector;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import myapp.UserSessions;
import myapp.reservationForm;
import myapp.userForm;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public final class useruserPage extends javax.swing.JInternalFrame {

    private int rowlndex;

    /**
     * Creates new form userPage
     */
    public useruserPage() {
        initComponents();
        
       
        
        
        
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
       BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
       
        
        
        
    }
     public String status;
     public String action;
    
 
    
    
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
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        rv_amount = new javax.swing.JTextField();
        rv_address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rv_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        rv_type = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        di_id = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        di_fname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        di_lname = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        di_age = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        di_address = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ddeath = new org.netbeans.modules.form.InvalidComponent();
        bdate = new org.netbeans.modules.form.InvalidComponent();
        jLabel6 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        refreshbtn = new javax.swing.JLabel();
        edit2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(917, 606));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(917, 606));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(917, 606));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Info");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 410, 30));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(230, 0, 470, 70);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

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
        jLabel4.setText("Edit");
        edit.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, -1, 40));

        jPanel4.setBackground(new java.awt.Color(255, 204, 255,80));
        jPanel4.setForeground(new java.awt.Color(153, 153, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setText("Amount:");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(40, 220, 61, 40);

        rv_amount.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rv_amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rv_amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rv_amount.setOpaque(false);
        jPanel4.add(rv_amount);
        rv_amount.setBounds(110, 220, 260, 40);

        rv_address.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rv_address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rv_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rv_address.setOpaque(false);
        jPanel4.add(rv_address);
        rv_address.setBounds(110, 160, 260, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Address:");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(40, 160, 65, 40);

        rv_id.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rv_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rv_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rv_id.setEnabled(false);
        rv_id.setOpaque(false);
        jPanel4.add(rv_id);
        rv_id.setBounds(110, 110, 260, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("ID:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(40, 100, 23, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Status:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(40, 330, 53, 40);

        male.setBackground(new java.awt.Color(255, 255, 255,80));
        male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        male.setText("Reserve");
        male.setBorder(null);
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel4.add(male);
        male.setBounds(120, 340, 110, 20);

        female.setBackground(new java.awt.Color(255, 255, 255));
        female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        female.setText("Not reserve");
        female.setBorder(null);
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel4.add(female);
        female.setBounds(250, 340, 120, 20);

        rv_type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rv_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Land Burial", "Cement Burial" }));
        jPanel4.add(rv_type);
        rv_type.setBounds(110, 280, 260, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Type:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(40, 280, 60, 40);

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 26)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Location Reservation Form");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(190, 30, 430, 30);

        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        jPanel4.add(jLabel12);
        jLabel12.setBounds(0, 10, 790, 72);

        jLabel2.setText("This field is Autogenerated");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(110, 90, 190, 30);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 490));

        jPanel6.setBackground(new java.awt.Color(255, 204, 255,80));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(917, 606));
        jPanel6.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 26)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Person's Death Form");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        jPanel6.add(jLabel5);
        jLabel5.setBounds(0, 20, 780, 70);

        close1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setText("x");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });
        jPanel6.add(close1);
        close1.setBounds(860, 20, 20, 29);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("ID:");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(190, 110, 23, 40);

        di_id.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        di_id.setEnabled(false);
        di_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                di_idActionPerformed(evt);
            }
        });
        jPanel6.add(di_id);
        di_id.setBounds(300, 110, 260, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setText("First Name:");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(190, 160, 87, 40);

        di_fname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(di_fname);
        di_fname.setBounds(300, 160, 260, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel16.setText("Last Name:");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(190, 210, 84, 40);

        di_lname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(di_lname);
        di_lname.setBounds(300, 210, 260, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel17.setText("Age:");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(190, 260, 33, 40);

        di_age.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        di_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                di_ageActionPerformed(evt);
            }
        });
        jPanel6.add(di_age);
        di_age.setBounds(300, 260, 260, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel18.setText("Birth date:");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(180, 310, 79, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel19.setText("Date of date:");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(180, 370, 96, 40);

        di_address.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel6.add(di_address);
        di_address.setBounds(300, 420, 260, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Address");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(180, 430, 60, 19);
        jPanel6.add(ddeath);
        ddeath.setBounds(300, 360, 260, 40);
        jPanel6.add(bdate);
        bdate.setBounds(300, 310, 260, 40);

        jLabel6.setText("This field is autogenerated");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(300, 90, 180, 20);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -10, 620, 500));

        refresh.setBackground(new java.awt.Color(204, 204, 255));
        refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refreshbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refreshbtn.setText("Refresh");
        refresh.add(refreshbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, 40));

        edit2.setBackground(new java.awt.Color(204, 204, 255));
        edit2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        edit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit2MouseExited(evt);
            }
        });
        edit2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Edit");
        edit2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        jPanel1.add(edit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
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
        String updatedFirstName = di_fname.getText();
String updatedLastName = di_lname.getText();
int updatedAge = Integer.parseInt(di_age.getText());
java.util.Date updatedBDate = bdate.getDate();
java.util.Date updatedDDeath = ddeath.getDate();
String updatedAddress = di_address.getText();
dbConnector dbc = new dbConnector();

// Construct the SQL update query
String updateQuery = "UPDATE tbl_pdinfo SET pdi_fname = ?, pdi_lname = ?, pdi_age = ?, pdi_bdate = ?, pdi_ddate = ?, pdi_address = ? WHERE pdi_id = ?";

try {
    // Create a PreparedStatement and set the parameter values
    PreparedStatement statement = dbc.connect_db().prepareStatement(updateQuery);
    statement.setString(1, updatedFirstName);
    statement.setString(2, updatedLastName);
    statement.setInt(3, updatedAge);
    statement.setDate(4, new java.sql.Date(updatedBDate.getTime()));
    statement.setDate(5, new java.sql.Date(updatedDDeath.getTime()));
    statement.setString(6, updatedAddress);
    statement.setString(7, di_id.getText());

    // Execute the update query
    int result = statement.executeUpdate();

    if (result == 1) {
        JOptionPane.showMessageDialog(null, "Death Information Updated Successfully!");
    } else {
        JOptionPane.showMessageDialog(null, "Failed to Update Death Information!");
    }
} catch (SQLException e) {
    e.printStackTrace();
}
       
       
   
    }//GEN-LAST:event_editMouseClicked

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        female.setSelected(false);
        if (male.isSelected()){

            status= "Reserved";

        }else{
            status = null;
        }
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:

        male.setSelected(false);
        if (female.isSelected()){

            status= "Not reserved";

        }else{
            status = null;
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked

    }//GEN-LAST:event_close1MouseClicked

    private void di_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_di_idActionPerformed

    }//GEN-LAST:event_di_idActionPerformed

    private void di_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_di_ageActionPerformed

    }//GEN-LAST:event_di_ageActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // Save the stored IDs in tbl_userinfo_relations
    // Retrieve the stored IDs from UserSessions
    int userId = UserSessions.getUserId();
    int rlId = UserSessions.getReservationLocationId();
    int pdiId = UserSessions.getDeathPersonId();

    // Insert the data into tbl_userinfo_relations
    dbConnector dbc = new dbConnector();
    int result = dbc.insertData("INSERT INTO tbl_userinfo_relations (userinfo_id, pdi_id, rl_id) VALUES (?, ?, ?)",
        new Object[] { userId, pdiId, rlId });

   if (result == 1) {
    try {
        // Retrieve the reserved location data based on rlId
        ResultSet rlResultSet = dbc.getData("SELECT * FROM tbl_rlocation WHERE rl_id = " + rlId);
        // Retrieve the death information based on pdiId
        ResultSet pdiResultSet = dbc.getData("SELECT * FROM tbl_pdinfo WHERE pdi_id = " + pdiId);

        // Update the text fields with the retrieved data
        if (rlResultSet.next()) {
            rv_id.setText(rlResultSet.getString("rl_id"));
            rv_address.setText(rlResultSet.getString("rl_address"));
            rv_amount.setText(rlResultSet.getString("rl_amount"));
            rv_type.setSelectedItem(rlResultSet.getString("rl_type"));

            // Set the radio button for status
            String statusValue = rlResultSet.getString("rl_status");
            if (statusValue.equals("Reserved")) {
                male.setSelected(true);
                female.setSelected(false);
            } else if (statusValue.equals("Not reserved")) {
                male.setSelected(false);
                female.setSelected(true);
            } else {
                male.setSelected(false);
                female.setSelected(false);
            }
        }

        // Set the text fields for death information data
        if (pdiResultSet.next()) {
            di_id.setText(pdiResultSet.getString("pdi_id"));
            di_fname.setText(pdiResultSet.getString("pdi_fname"));
            di_lname.setText(pdiResultSet.getString("pdi_lname"));
            di_age.setText(pdiResultSet.getString("pdi_age"));
            java.util.Date bdateValue = pdiResultSet.getDate("pdi_bdate");
            java.util.Date ddeathValue = pdiResultSet.getDate("pdi_ddate");
            bdate.setDate(bdateValue);
            ddeath.setDate(ddeathValue);
            di_address.setText(pdiResultSet.getString("pdi_address"));
            // Set the other text fields for death information as needed
        }

        
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
} else {
    System.out.println("Saving Data Failed!");
}
}

private String retrieveReservedLocationData(int rlId) {
    // Retrieve the reserved location data using the rlId and format it as needed
    // Example:
    String rlData = ""; // Retrieve and format the data

    return rlData;
}

private String retrieveDeathInformationData(int pdiId) {
    // Retrieve the death information data using the pdiId and format it as needed
    // Example:
    String pdiData = ""; // Retrieve and format the data

    return pdiData;
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        // TODO add your handling code here:
        refreshbtn.setBackground(navcolor);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshMouseExited

    private void edit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit2MouseClicked
        // TODO add your handling code here:
        int rlId = Integer.parseInt(rv_id.getText());
    String address = rv_address.getText();
    double amount = Double.parseDouble(rv_amount.getText());
    String type = rv_type.getSelectedItem().toString();
    String status = (male.isSelected()) ? "Reserved" : "Not reserved";
    dbConnector dbc = new dbConnector();
    
    // Update the tbl_rlocation data
    String updateQuery = "UPDATE tbl_rlocation SET rl_address = ?, rl_amount = ?, rl_type = ?, rl_status = ? WHERE rl_id = ?";
    try {
        PreparedStatement statement = dbc.connect_db().prepareStatement(updateQuery);
        statement.setString(1, address);
        statement.setDouble(2, amount);
        statement.setString(3, type);
        statement.setString(4, status);
        statement.setInt(5, rlId);
        
        int result = statement.executeUpdate();
        if (result == 1) {
            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
        } else {
            System.out.println("Data Update Failed!");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_edit2MouseClicked

    private void edit2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_edit2MouseEntered

    private void edit2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_edit2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.modules.form.InvalidComponent bdate;
    private javax.swing.JLabel close1;
    private org.netbeans.modules.form.InvalidComponent ddeath;
    public javax.swing.JTextField di_address;
    public javax.swing.JTextField di_age;
    public javax.swing.JTextField di_fname;
    public javax.swing.JTextField di_id;
    public javax.swing.JTextField di_lname;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel edit2;
    public javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JRadioButton male;
    private javax.swing.JPanel refresh;
    private javax.swing.JLabel refreshbtn;
    public javax.swing.JTextField rv_address;
    public javax.swing.JTextField rv_amount;
    public javax.swing.JTextField rv_id;
    public javax.swing.JComboBox<String> rv_type;
    // End of variables declaration//GEN-END:variables

}