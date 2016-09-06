/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.D_Message;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kandskat
 */
public class L_Message {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    String sSql = "";
    String sSql2 = "";
    
    public DefaultTableModel Mostrando_uMessages() {
        DefaultTableModel model;
        
        String [] Titulos={"idMessages","From","To","Message"};
        String [] Registr= new String[4];
        
        model = new DefaultTableModel(null,Titulos);
        sSql = "Select * From Messages";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while(rs.next()){
                Registr[0] = rs.getString("idMessages");
                Registr[1] = rs.getString("FromMessages");
                Registr[2] = rs.getString("ToMessages");
                Registr[3] = rs.getString("Messages");
                
                model.addRow(Registr);
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean Insertar_Messages(D_Message dts) {
        sSql="SELECT MAX(idMessages) FROM Messages";
        sSql2="INSERT INTO Messages(idMessages,FromMessages,ToMessages,Messages)"+
                "VALUES(?,?,?,?)";
        
        String idMessage;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            rs.next();
            
            idMessage = rs.getString("MAX(idMessages)");
            int idMessageInsert = Integer.parseInt(idMessage)+1;
            
            PreparedStatement pst = cn.prepareStatement(sSql2);
            pst.setInt(1, idMessageInsert);
            pst.setString(2, dts.getFromMessage());
            pst.setString(3, dts.getToMessage());
            pst.setString(4, dts.getMessage());
            
            int n = pst.executeUpdate();
            if(n!=0){
                return true;
            }
            else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
}
