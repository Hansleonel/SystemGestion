/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
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

    public void MostrandoDatos(String buscar) {
        DefaultTableModel model;
        
        String[] titulos = {"Id","Nombre","Direccion","CentroCosto.","NroAtm","Local","Estado","EstadoUps",
                                "Monitoreado","Descrip","Capacidad","Marca","Ip","Gw","Msc","Nro Serie","Garantia","Estado Garantia",
                                "Periodo Garantia","Propietario","Proveedor","Provnci","Ciudad","Territorio","Mantenimiento 2015"};
            
        String [] registr = new String[25];        
        totalregitrs=0;        
        model = new DefaultTableModel(null,titulos);
        
        sSql = "SELECT * FROM upsinformacion_prb where NomLocal like '%800%' or DirLocal like '%800%' or C_CostoLocal like '%800%' or Nro_ATM like '%800%' or TipoLocal like'%800%' or EstadoMonitoreo like '%800%' or Desc_UPS like '%800%' or Capacidad_UPS like '%800%' or Marca_UPS like '%800%' or IP_UPS like '%800%' or GW_UPS like '%800%' or Msc_UPS like '%800%' or Fecha_Garantia like '%800%' or Estado_Garantia like '%800%' or ProveedorUPS like '%800%'";
        
        
    }
    
}
