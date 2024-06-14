/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class dbConnector {
    
    private Connection connection;
   
    public dbConnector(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/christel_db", "root", "");
            }catch(SQLException ex){
                System.err.println("Cannot connect to database: " + ex.getMessage());
            }
        
        
    }
    
     public Connection connect_db(){
              try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/christel_db", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
              return connection;
        }
     
     
     public int getLastInsertedId(String tableName, String columnName) {
    int lastInsertedId = 0;
    String query = "SELECT MAX(" + columnName + ") FROM " + tableName;

    try (PreparedStatement statement = connection.prepareStatement(query);
         ResultSet resultSet = statement.executeQuery()) {

        if (resultSet.next()) {
            lastInsertedId = resultSet.getInt(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return lastInsertedId;
}
     
     
     
        
    
    public ResultSet getData(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }
    
    
    

public int insertData(String sql, Object... params) {
    int result;
    try {
        PreparedStatement pst = connection.prepareStatement(sql);
        
        // Set parameter values dynamically
        for (int i = 0; i < params.length; i++) {
            if (params[i] instanceof byte[]) {
                // For byte[] data (us_fileimage)
                pst.setBytes(i + 1, (byte[]) params[i]);
            } else {
                // For other parameter values
                pst.setObject(i + 1, params[i]);
            }
        }
        
        pst.executeUpdate();
        System.out.println("Inserted Successfully");
        pst.close();
        result = 1;
    } catch (SQLException ex) {
        System.out.println("Connection Error: " + ex);
        result = 0;
    }
    return result;
}






public void updateData(String sql){

int result;
try{
PreparedStatement pst = connection. prepareStatement(sql);
int rowsUpdated = pst.executeUpdate();
if (rowsUpdated > 0){
JOptionPane.showMessageDialog(null,"Data Updated Successfully");
}else{
System.out.println("Data Update Failed");
}
pst.close();
}catch(SQLException ex){
System.out.println("Connection Error"+ex);
}
}





public void deleteData(int id, String table, String table_id){
try{
PreparedStatement pst = connection. prepareStatement("DELETE FROM "+table+" WHERE "+table_id+" = ?");
  pst.setInt(1,id);
  int rowsDeleted = pst.executeUpdate();
  if(rowsDeleted > 0){
  JOptionPane.showMessageDialog(null,"Deleted Successfully");
  }else{
  System.out.println("Deletion Failed");
  }
  pst.close();
}catch(SQLException ex){
System.out.println("Connection Error"+ex);
}
}
   
}
        

    
 

