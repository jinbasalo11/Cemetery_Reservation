/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.dbConnector;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author User
 */
public final class AreportsPage extends javax.swing.JInternalFrame {

    private int rowlndex;

    /**
     * Creates new form userPage
     */
    public AreportsPage() {
        initComponents();
        
       
        
        displayData();
        
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
       BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
       
        
        search.setOpaque(false);
        search.setBackground(new Color(0,0,0,0));
        
    }
    
    
    public void displayData(){
try{
dbConnector dbc = new dbConnector();
ResultSet rs = dbc.getData("SELECT tbl_rlocation.*, tbl_pdinfo.* FROM tbl_userinfo_relations " +
                          "JOIN tbl_rlocation ON tbl_userinfo_relations.rl_id = tbl_rlocation.rl_id " +
                          "JOIN tbl_pdinfo ON tbl_userinfo_relations.pdi_id = tbl_pdinfo.pdi_id");
report_table.setModel(DbUtils.resultSetToTableModel(rs));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        report_table = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        search_button = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(917, 606));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(917, 606));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setPreferredSize(new java.awt.Dimension(917, 606));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reports Status");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 440, 30));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(230, 0, 470, 70);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 70));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        report_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(report_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 870, 410));

        search.setBackground(new java.awt.Color(255, 204, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        search.setOpaque(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 750, 40));

        search_button.setBackground(new java.awt.Color(204, 204, 255));
        search_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        search_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_buttonMouseExited(evt);
            }
        });
        search_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Search");
        search_button.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel1.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 110, 40));

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Refresh");
        refresh.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, 40));

        print.setBackground(new java.awt.Color(204, 204, 255));
        print.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("print");
        print.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseEntered
      
        
     search_button.setBackground(bodycolor);
    }//GEN-LAST:event_search_buttonMouseEntered

    private void search_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseExited
      
        
     search_button.setBackground(navcolor);
    }//GEN-LAST:event_search_buttonMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
   
        
         refresh.setBackground(bodycolor);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
     
        
         refresh.setBackground(navcolor);
    }//GEN-LAST:event_refreshMouseExited

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
displayData();    
    }//GEN-LAST:event_refreshMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
       JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save PDF File");

    // Set the default file name
    String defaultFileName = "output.pdf";
    fileChooser.setSelectedFile(new File(defaultFileName));

    // Show the dialog and get the user's choice
    int userChoice = fileChooser.showSaveDialog(this);

    // If the user selects a file and clicks "Save"
    if (userChoice == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        String fileName = selectedFile.getName();

        try {
            // Create the PDF document
            Document document = new Document();

            // Create a PdfWriter instance to write the document to the selected file
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(selectedFile.getAbsolutePath()));

            // Open the document
            document.open();

            // Get the number of rows and columns in the table
            int rowCount = report_table.getRowCount();
            int columnCount = report_table.getColumnCount();

            // Iterate over the rows and print the data
            for (int row = 0; row < rowCount; row++) {
                for (int col = 0; col < columnCount; col++) {
                    // Get the value at each cell
                    Object value = report_table.getValueAt(row, col);

                    

                    // Add the cell value to the PDF document
                    document.add(new Paragraph(value.toString()));
                }
            }

            // Close the document
            document.close();

            JOptionPane.showMessageDialog(this, "PDF file saved successfully!");
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to save PDF file.");
        }
    }
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
      String keyword = search.getText();
    try {
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(report_table.getModel());
        report_table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(keyword));
    } catch (PatternSyntaxException ex) {
        // Invalid regex pattern, handle the exception if needed
        ex.printStackTrace();
    }
    }//GEN-LAST:event_searchActionPerformed

    private void search_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseClicked
        // TODO add your handling code here:
        
        String searchText = search.getText().trim(); // Get the search text from the search bar

    if (!searchText.isEmpty()) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(report_table.getModel());
        report_table.setRowSorter(sorter);

        RowFilter<TableModel, Object> filter = RowFilter.regexFilter("(?i)" + searchText); // Case-insensitive search
        sorter.setRowFilter(filter);
    } else {
        report_table.setRowSorter(null); // Clear the row filter if the search text is empty
    }
    }//GEN-LAST:event_search_buttonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel print;
    private javax.swing.JPanel refresh;
    private javax.swing.JTable report_table;
    private javax.swing.JTextField search;
    private javax.swing.JPanel search_button;
    // End of variables declaration//GEN-END:variables

}