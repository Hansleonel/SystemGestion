/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kandskat
 */
public class L_UPSDatos {
    
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    
    private String sSql="";
    private String SSql2="";
    
    public int totalregitrs;
    public int confirmar;

    public DefaultTableModel MostrandoDatos(String buscar) {
        DefaultTableModel model;
        
        String[] titulos = {"Id","Nombre","Direccion","CentroCosto.","NroAtm","Local","Estado","EstadoUps",
                                "Monitoreado","Descrip","Capacidad","Marca","Ip","Gw","Msc","Nro Serie","Garantia","Estado Garantia",
                                "Periodo Garantia","Propietario","Proveedor","Provnci","Ciudad","Territorio","Mantenimiento 2015"};
            
        String [] registr = new String[25];        
        totalregitrs=0;        
        model = new DefaultTableModel(null,titulos);
        
        sSql = "SELECT * FROM upsinformacion_prb WHERE NomLocal LIKE '%"+buscar+"%' or DirLocal LIKE '%"+buscar+"%' or C_CostoLocal LIKE '%"+buscar
                +"%' or Nro_ATM LIKE '%"+buscar+"%' or TipoLocal LIKE '%"+buscar+"%' or EstadoMonitoreo LIKE '%"+buscar+"%' or Desc_UPS LIKE '%"+buscar
                +"%' or Capacidad_UPS LIKE '%"+buscar+"%' or Marca_UPS LIKE '%"+buscar+"%' or IP_UPS LIKE '%"+buscar+"%' or GW_UPS LIKE '%"+buscar
                +"%' or Msc_UPS like '%"+buscar+"%' or Fecha_Garantia like '%"+buscar+"%' or Estado_Garantia like '%"+buscar+"%' or ProveedorUPS like '%"+buscar+"%'";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while (rs.next()) {
                registr[0]=rs.getString("idInformacion_UPS");
                registr[1]=rs.getString("NomLocal");
                registr[2]=rs.getString("DirLocal");
                registr[3]=rs.getString("C_CostoLocal");
                registr[4]=rs.getString("Nro_ATM");
                registr[5]=rs.getString("TipoLocal");   
                registr[6]=rs.getString("EstadoLocal");   
                registr[7]=rs.getString("EstadoUPS");
                registr[8]=rs.getString("EstadoMonitoreo");
                registr[9]=rs.getString("Desc_UPS");
                registr[10]=rs.getString("Capacidad_UPS");
                registr[11]=rs.getString("Marca_UPS");
                registr[12]=rs.getString("IP_UPS");
                registr[13]=rs.getString("GW_UPS");
                registr[14]=rs.getString("Msc_UPS");
                registr[15]=rs.getString("Nro_Serie_UPS");
                registr[16]=rs.getString("Fecha_Garantia");
                registr[17]=rs.getString("Estado_Garantia");
                registr[18]=rs.getString("Periodo_de_Garantia");
                registr[19]=rs.getString("Propietario");
                registr[20]=rs.getString("ProveedorUPS");
                registr[21]=rs.getString("Provincia_UPS");
                registr[22]=rs.getString("Ciudad_Distrito_UPS");
                registr[23]=rs.getString("Territorio_UPS");
                registr[24]=rs.getString("Mantenimiento_UPS");
                
                totalregitrs = totalregitrs + 1;
                
                model.addRow(registr);
                
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
