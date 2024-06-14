/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import config.dbConnector;
import internalPages.reservationPage;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class reservationForm extends javax.swing.JFrame {

    /**
     * Creates new form reservationForm
     */
    public reservationForm() {
        initComponents();
    }
    
    
    public void close(){
     this.dispose();
dashBoard dash = new dashBoard();
dash.setVisible(true);
reservationPage up = new reservationPage();
dash.maindesktop.add(up).setVisible(true);
    }
    
    
    
    Color navcolor = new Color(204,204,255);
    Color headcolor = new Color(153,153,255);
    Color bodycolor = new Color(255,204,255);
    
     public String status;
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
        jPanel3 = new javax.swing.JPanel();
        add = new javax.swing.JPanel();
        rv_label = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        rv_label1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(917, 606));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 255,80));
        jPanel3.setLayout(null);

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
        add.add(rv_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        jPanel3.add(add);
        add.setBounds(250, 510, 110, 50);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setText("Amount:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(230, 250, 61, 40);

        rv_amount.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rv_amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rv_amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rv_amount.setOpaque(false);
        jPanel3.add(rv_amount);
        rv_amount.setBounds(300, 250, 260, 40);

        rv_address.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rv_address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rv_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rv_address.setOpaque(false);
        jPanel3.add(rv_address);
        rv_address.setBounds(300, 190, 260, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Address:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(230, 190, 65, 40);

        rv_id.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rv_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rv_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rv_id.setEnabled(false);
        rv_id.setOpaque(false);
        jPanel3.add(rv_id);
        rv_id.setBounds(300, 140, 260, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("ID:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(230, 130, 23, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Status:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(230, 360, 53, 40);

        male.setBackground(new java.awt.Color(255, 255, 255,80));
        male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        male.setText("Reserve");
        male.setBorder(null);
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel3.add(male);
        male.setBounds(310, 370, 110, 20);

        female.setBackground(new java.awt.Color(255, 255, 255));
        female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        female.setText("Not reserve");
        female.setBorder(null);
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel3.add(female);
        female.setBounds(440, 370, 120, 20);

        rv_type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rv_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Land Burial", "Cement Burial" }));
        jPanel3.add(rv_type);
        rv_type.setBounds(300, 310, 260, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Type:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(230, 310, 60, 40);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Location Reservation Form");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(190, 30, 430, 30);

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        close.add(rv_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        jPanel3.add(close);
        close.setBounds(460, 510, 110, 50);

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 10, 790, 72);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 770, 590));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/There is a Hope and a Purpose Beyond the Broken Places Archives ~ Cups of Hope Cafe.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(bodycolor);

    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited

        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
         

    }//GEN-LAST:event_addMouseClicked

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        
        female.setSelected(false);
        if (male.isSelected()){
        
        status= "Male";
                        
                }else{
        status = null;
        }
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        
         male.setSelected(false);
        if (female.isSelected()){
        
        status= "Male";
                        
                }else{
        status = null;
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void rv_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_labelMouseClicked
      
        if (action.equals("Add")) {
    dbConnector dbc = new dbConnector();
    int result;
    result = dbc.insertData("INSERT INTO tbl_rlocation(rl_address, rl_amount, rl_status, rl_type) VALUES (?, ?, ?, ?)",
        new Object[] { rv_address.getText(), rv_amount.getText(), status, rv_type.getSelectedItem() });
    if (result == 1) {
        JOptionPane.showMessageDialog(null, "Successfully Saved!");
      close();
      }else{
      System.out.println("Saving Data Failed!");
      }
         
     }else if (action.equals("Update")) {
    dbConnector dbc = new dbConnector();
    dbc.updateData("UPDATE tbl_rlocation SET rl_address = '" + rv_address.getText() + "', rl_amount = '" + rv_amount.getText() + "', "
            + "rl_status = '" + status + "', rl_type = '" + rv_type.getSelectedItem() + "' "
            + "WHERE rl_id = '" + rv_id.getText() + "'");

    close();
} else {
    JOptionPane.showMessageDialog(null, "No action selected");

    close();
}







     
     
     
      
       
    }//GEN-LAST:event_rv_labelMouseClicked

    private void rv_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_labelMouseEntered
        // TODO add your handling code here:
        rv_label.setBackground(bodycolor);
        
    }//GEN-LAST:event_rv_labelMouseEntered

    private void rv_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_labelMouseExited
        // TODO add your handling code here:
        
        rv_label.setBackground(navcolor);
    }//GEN-LAST:event_rv_labelMouseExited

    private void rv_label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_label1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rv_label1MouseClicked

    private void rv_label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_label1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_rv_label1MouseEntered

    private void rv_label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_label1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_rv_label1MouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       close();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(bodycolor);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
       
       close.setBackground(navcolor);
    }//GEN-LAST:event_closeMouseExited

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
            java.util.logging.Logger.getLogger(reservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel add;
    public javax.swing.JPanel close;
    public javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JRadioButton male;
    public javax.swing.JTextField rv_address;
    public javax.swing.JTextField rv_amount;
    public javax.swing.JTextField rv_id;
    public javax.swing.JLabel rv_label;
    public javax.swing.JLabel rv_label1;
    public javax.swing.JComboBox<String> rv_type;
    // End of variables declaration//GEN-END:variables
}
