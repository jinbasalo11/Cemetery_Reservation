/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import config.dbConnector;
import internalPages.reportsPage;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class reportForm extends javax.swing.JFrame {

    /**
     * Creates new form reservationForm
     */
    public reportForm() {
        initComponents();
    }
    
    
    
    
public void close(){
this.dispose();
dashBoard dash = new dashBoard();
dash.setVisible(true);
reportsPage up = new reportsPage();
dash.maindesktop.add(up).setVisible(true);
    }
    
    
    
   public int validateRegister (){
   int result;
   if(di_fname.getText().isEmpty() ||di_lname.getText().isEmpty() || di_age.getText().isEmpty() || di_bdeath.getText().isEmpty() || di_deathdate.getText().isEmpty()  ){
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
        jLabel7 = new javax.swing.JLabel();
        di_fname = new javax.swing.JTextField();
        di_lname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        di_id = new javax.swing.JTextField();
        di_age = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        di_bdeath = new javax.swing.JTextField();
        di_deathdate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        di_address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        rv_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(917, 606));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("First Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, 40));

        di_fname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(di_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 260, 40));

        di_lname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(di_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 260, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setText("Age:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, 40));

        di_id.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        di_id.setEnabled(false);
        di_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                di_idActionPerformed(evt);
            }
        });
        jPanel1.add(di_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 260, 40));

        di_age.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        di_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                di_ageActionPerformed(evt);
            }
        });
        jPanel1.add(di_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 260, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("Last Name:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setText("Birth date:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, 40));

        di_bdeath.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_bdeath.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_bdeath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(di_bdeath, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 260, 40));

        di_deathdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        di_deathdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di_deathdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(di_deathdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 260, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Address");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, 20));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255,80));
        jPanel2.setPreferredSize(new java.awt.Dimension(917, 606));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Report Form");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 20, 710, 60);

        close1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setText("x");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });
        jPanel2.add(close1);
        close1.setBounds(850, 10, 20, 29);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setText("Date of date:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(160, 390, 96, 40);

        di_address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(di_address);
        di_address.setBounds(280, 450, 260, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("->");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(670, 560, 30, 20);

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
        add.setBounds(360, 510, 80, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 710, 580));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/There is a Hope and a Purpose Beyond the Broken Places Archives ~ Cups of Hope Cafe.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
      close();
        
    }//GEN-LAST:event_close1MouseClicked

    private void rv_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rv_labelMouseClicked
      
        if(action.equals("Add")){
      dbConnector dbc = new dbConnector();
      int result;
            result = dbc.insertData("INSERT INTO  tbl_pdinfo(pdi_fname,pdi_lname,pdi_age,pdi_bdate,pdi_ddate,pdi_address)VALUES ('"+di_fname.getText()+"','"+di_lname.getText()+"', '"+di_age.getText()+"','"+di_bdeath.getText()+"', '"+di_deathdate.getText()+"','"+di_address.getText()+"' )");
      if(result == 1){
      JOptionPane.showMessageDialog(null,"Successfully Save!");
      close();
      }else{
      System.out.println("Saving Data Failed!");
      }
         
     }else if (action.equals("Update")){
          dbConnector dbc = new dbConnector();
          dbc.updateData("Update  tbl_pdinfo SET pdi_fname = '"+di_fname.getText()+"',pdi_lname = '"+di_lname.getText()+"', pdi_age = '"+di_age.getText()+"',"
          + " pdi_bdate = '"+di_bdeath.getText()+"',pdi_ddate= '"+di_deathdate.getText()+"',pdi_address= '"+di_deathdate.getText()+"' WHERE pdi_id = '"+di_id.getText()+"' ");
          
          close();
     }else{
       JOptionPane.showMessageDialog(null,"No action selected");
      
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

    private void di_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_di_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_di_ageActionPerformed

    private void di_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_di_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_di_idActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        close();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(reportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel add;
    private javax.swing.JLabel close1;
    public javax.swing.JTextField di_address;
    public javax.swing.JTextField di_age;
    public javax.swing.JTextField di_bdeath;
    public javax.swing.JTextField di_deathdate;
    public javax.swing.JTextField di_fname;
    public javax.swing.JTextField di_id;
    public javax.swing.JTextField di_lname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel rv_label;
    // End of variables declaration//GEN-END:variables
}