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
public class L_OTEventos {
    
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    
    
    private String sSql ="";
    private String sSql2="";
    
    
    public int totalregistr;
    public int totalregistr1;

    public DefaultTableModel MostrandoEventos(String buscar) {
        DefaultTableModel model;
        
        String[] titulos = {"Item","Id","FechaReporte","Hora","C.C.","Local","Nombre",
                        "Zona Local","Solicitud", "Detalle Solicitud", "Numero_OT","Lvl_Servic","Estado Servic",
                        "Proveedor","Reprogrmc","Tecnic","Fecha Progrmada","Hora Programa", "Observaciones" };
        String[] registr = new String[19];
        
        totalregistr1 = 0;
        
        model = new DefaultTableModel(null, titulos);
        
        sSql = "select * from otinformacion_prb where idItem like '%"+buscar+"%' or FechaReporte like '%"+buscar+"%' or C_Costo_Nro_ATM like '%"+buscar
                +"%' or TipoLocal like '%"+buscar+"%' or NomLocal like '%"+buscar+"%' or TipoSolicitud like '%"+buscar+"%' or DetalleSolicitud like '%"+buscar
                +"%' or Nro_OT like '%"+buscar+"%' or Estado_Servic like '%"+buscar+"%' or Proveedor_Item like '%"+buscar+"%' or Tecnic like '%"+buscar
                +"%' or Fecha_Programada like '%"+buscar+"%'";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while (rs.next()) {
                
                registr[0]=rs.getString("idOrdenDeT");
                registr[1]=rs.getString("idItem");
                registr[2]=rs.getString("FechaReporte");
                registr[3]=rs.getString("HoraReporte");
                registr[4]=rs.getString("C_Costo_Nro_ATM");
                registr[5]=rs.getString("TipoLocal");
                registr[6]=rs.getString("NomLocal");
                registr[7]=rs.getString("ZonaLocal");
                registr[8]=rs.getString("TipoSolicitud");
                registr[9]=rs.getString("DetalleSolicitud");
                registr[10]=rs.getString("Nro_OT");
                registr[11]=rs.getString("Lvl_Servic");
                registr[12]=rs.getString("Estado_Servic");
                registr[13]=rs.getString("Proveedor_Item");
                registr[14]=rs.getString("Reprogr_Servic");
                registr[15]=rs.getString("Tecnic");
                registr[16]=rs.getString("Fecha_Programada");
                registr[17]=rs.getString("Hora_Programada");
                registr[18]=rs.getString("Observaciones");
                
                totalregistr = totalregistr + 1;
                
                model.addRow(registr);
                
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}
