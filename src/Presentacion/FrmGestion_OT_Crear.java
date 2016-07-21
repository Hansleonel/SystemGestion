/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.D_OTEventos;
import Logica.L_OTEventos;
import Logica.L_UPSDatos;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kandskat
 */
public class FrmGestion_OT_Crear extends javax.swing.JFrame {

    /**
     * Creates new form FrmGestion_OT_Crear
     */    
    public FrmGestion_OT_Crear() {
        this.setUndecorated(true);
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        this.setLocationRelativeTo(null);
        jScrollPane1.setVisible(false);
        
        Buscar_Nuevo_Nro_OT();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lbl_OT_Crear_Aceptar_OT = new javax.swing.JLabel();
        Lbl_OT_Crear_Enviar_Mail = new javax.swing.JLabel();
        Lbl_OT_Crear_Actualizar_OT = new javax.swing.JLabel();
        Lbl_OT_Crear_Buscar_UPS = new javax.swing.JLabel();
        Txt_OT_Crear_Tecnic = new javax.swing.JTextField();
        Txt_OT_Crear_Fecha_Reprogram = new javax.swing.JTextField();
        Txt_OT_Crear_Buscar_UPS = new javax.swing.JTextField();
        Txt_OT_Crear_FechaReporte = new javax.swing.JTextField();
        Txt_OT_Crear_HoraReporte = new javax.swing.JTextField();
        Txt_OT_Crear_TipoLocal = new javax.swing.JTextField();
        Txt_OT_Crear_NroAtm_CC = new javax.swing.JTextField();
        Txt_OT_Crear_Fecha_Program = new javax.swing.JTextField();
        Txt_OT_Crear_Direccion = new javax.swing.JTextField();
        Txt_OT_Crear_DetalleSolicitud = new javax.swing.JTextField();
        Txt_OT_Crear_EstadoServicio = new javax.swing.JTextField();
        Txt_OT_Crear_Proveedor = new javax.swing.JTextField();
        Txt_OT_Crear_Nro_OT = new javax.swing.JTextField();
        Txt_OT_Crear_Hora_Program = new javax.swing.JTextField();
        Txt_OT_Crear_NomLocal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_OT_Crear_UPS_Datos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 120, 30));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 120, 30));

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 10, 20));

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 20));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 120, 30));

        Lbl_OT_Crear_Aceptar_OT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_OT_Crear_Aceptar_OT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_OT_Crear_Aceptar_OTMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_OT_Crear_Aceptar_OT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 60, 60));

        Lbl_OT_Crear_Enviar_Mail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Lbl_OT_Crear_Enviar_Mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 60, 60));

        Lbl_OT_Crear_Actualizar_OT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Lbl_OT_Crear_Actualizar_OT, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 60, 60));

        Lbl_OT_Crear_Buscar_UPS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_OT_Crear_Buscar_UPS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_OT_Crear_Buscar_UPSMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_OT_Crear_Buscar_UPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, 120, 30));

        Txt_OT_Crear_Tecnic.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_Tecnic.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_Tecnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 110, 20));

        Txt_OT_Crear_Fecha_Reprogram.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_Fecha_Reprogram.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_Fecha_Reprogram, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 120, -1));

        Txt_OT_Crear_Buscar_UPS.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        Txt_OT_Crear_Buscar_UPS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_Buscar_UPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 110, -1));

        Txt_OT_Crear_FechaReporte.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_FechaReporte.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_FechaReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 120, -1));

        Txt_OT_Crear_HoraReporte.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_HoraReporte.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_HoraReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 120, -1));

        Txt_OT_Crear_TipoLocal.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_TipoLocal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_TipoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 120, -1));

        Txt_OT_Crear_NroAtm_CC.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_NroAtm_CC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_NroAtm_CC, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 120, -1));

        Txt_OT_Crear_Fecha_Program.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_Fecha_Program.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_Fecha_Program, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 120, -1));

        Txt_OT_Crear_Direccion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_Direccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 260, -1));

        Txt_OT_Crear_DetalleSolicitud.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_DetalleSolicitud.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_DetalleSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 110, -1));

        Txt_OT_Crear_EstadoServicio.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_EstadoServicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_EstadoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 110, -1));

        Txt_OT_Crear_Proveedor.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_Proveedor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 110, -1));

        Txt_OT_Crear_Nro_OT.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_Nro_OT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_Nro_OT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, 20));

        Txt_OT_Crear_Hora_Program.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_Hora_Program.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_Hora_Program, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 120, -1));

        Txt_OT_Crear_NomLocal.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Crear_NomLocal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Crear_NomLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 110, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 406, 260, 90));

        Tbl_OT_Crear_UPS_Datos.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        Tbl_OT_Crear_UPS_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tbl_OT_Crear_UPS_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_OT_Crear_UPS_DatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_OT_Crear_UPS_Datos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 470, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/FrmOTCrear.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_OT_Crear_Buscar_UPSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_OT_Crear_Buscar_UPSMouseClicked
        // TODO add your handling code here:
        jScrollPane1.setVisible(true);
        try {
            DefaultTableModel model;
            L_UPSDatos func = new L_UPSDatos();
            model = func.MostrandoDatos(Txt_OT_Crear_Buscar_UPS.getText());
            
            Tbl_OT_Crear_UPS_Datos.setModel(model);
            Ocultar_Columnas_UPS();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_Lbl_OT_Crear_Buscar_UPSMouseClicked

    private void Tbl_OT_Crear_UPS_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_OT_Crear_UPS_DatosMouseClicked
        // TODO add your handling code here:
        int fila = Tbl_OT_Crear_UPS_Datos.rowAtPoint(evt.getPoint());        
        Txt_OT_Crear_NomLocal.setText(Tbl_OT_Crear_UPS_Datos.getValueAt(fila, 1).toString());
        Txt_OT_Crear_Direccion.setText(Tbl_OT_Crear_UPS_Datos.getValueAt(fila, 2).toString());
        
        Date Fecha = new Date();
        SimpleDateFormat formatoDate = new SimpleDateFormat("dd/MM/YYYY");        
        Txt_OT_Crear_FechaReporte.setText(formatoDate.format(Fecha));
        
        Calendar Hora_Minuto = new GregorianCalendar();
        int Hora = Hora_Minuto.get(Calendar.HOUR_OF_DAY);
        int Minuto = Hora_Minuto.get(Calendar.MINUTE);
        Txt_OT_Crear_HoraReporte.setText(Hora+":"+Minuto);
        
        Txt_OT_Crear_TipoLocal.setText(Tbl_OT_Crear_UPS_Datos.getValueAt(fila, 5).toString());
        if(Tbl_OT_Crear_UPS_Datos.getValueAt(fila, 5).equals("ATM")){
            Txt_OT_Crear_NroAtm_CC.setText(Tbl_OT_Crear_UPS_Datos.getValueAt(fila, 4).toString());
        }
        else if (Tbl_OT_Crear_UPS_Datos.getValueAt(fila, 5).equals("OFICINA")){
            Txt_OT_Crear_NroAtm_CC.setText(Tbl_OT_Crear_UPS_Datos.getValueAt(fila, 3).toString());
        }
        
        //Completar el codigo para la eleccion de la fechaprogramada
        //Completar el codigo para la eleccion de la fechareprogramac
        Txt_OT_Crear_Fecha_Program.setText("dd/MM/YYYY");
        Txt_OT_Crear_Hora_Program.setText("Ingrese Hora");
        
        //la siguientes lineas se peude borrar 
        //solo son usadas para no permitir el null en ningun caso
        Txt_OT_Crear_Tecnic.setText(" ");
        Txt_OT_Crear_Fecha_Reprogram.setText(" ");
        jTextArea1.setText(" ");
    }//GEN-LAST:event_Tbl_OT_Crear_UPS_DatosMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        setExtendedState(FrmGestion_OT_Crear.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_jLabel8MouseClicked

    public static String TipoSolicitud="";
    private void Lbl_OT_Crear_Aceptar_OTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_OT_Crear_Aceptar_OTMouseClicked
        // TODO add your handling code here:
        D_OTEventos dts = new D_OTEventos();
        L_OTEventos func = new L_OTEventos();
        
        int fila = Tbl_OT_Crear_UPS_Datos.rowAtPoint(evt.getPoint());
        dts.setIdItem(Integer.parseInt(Tbl_OT_Crear_UPS_Datos.getValueAt(fila, 0).toString()));
        dts.setFechaReporte(Txt_OT_Crear_FechaReporte.getText());
        dts.setHoraReporte(Txt_OT_Crear_HoraReporte.getText());
        dts.setC_Costo_Nro_ATM(Txt_OT_Crear_NroAtm_CC.getText());
        dts.setTipoLocal(Txt_OT_Crear_TipoLocal.getText());        
        dts.setNomLocal(Txt_OT_Crear_NomLocal.getText());
        dts.setZonaLocal(" ");
        dts.setTipoSolicitud(TipoSolicitud);
        dts.setDetalleSolicitud(Txt_OT_Crear_DetalleSolicitud.getText());
        dts.setNro_OT(Integer.parseInt(Txt_OT_Crear_Nro_OT.getText()));
        dts.setLvl_servic(" ");
        dts.setEstado_servic(Txt_OT_Crear_EstadoServicio.getText());
        dts.setProveedor_Item(Txt_OT_Crear_Proveedor.getText());
        //completar esta informacion o reemplazarla
        //con el proveedor de la reprogramacn
        dts.setReprog_Servic(Txt_OT_Crear_Proveedor.getText());
        dts.setTecnic(Txt_OT_Crear_Tecnic.getText());
        dts.setFecha_Programada(Txt_OT_Crear_Fecha_Program.getText());
        dts.setHora_Programada(Txt_OT_Crear_Hora_Program.getText());
        dts.setObservaciones(jTextArea1.getText());
    }//GEN-LAST:event_Lbl_OT_Crear_Aceptar_OTMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        FrmGestion_OT_Crear_Estado_Servicio form_ot_crear_estado_servicio = new FrmGestion_OT_Crear_Estado_Servicio();
        form_ot_crear_estado_servicio.setVisible(true);
        form_ot_crear_estado_servicio.toFront();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        FrmGestion_OT_Crear_Proveedor form_ot_crear_proveedor = new FrmGestion_OT_Crear_Proveedor();
        form_ot_crear_proveedor.setVisible(true);
        form_ot_crear_proveedor.toFront();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        FrmGestion_OT_Crear_Detalle_Servicio form_ot_crear_detalle_servicio = new FrmGestion_OT_Crear_Detalle_Servicio();
        form_ot_crear_detalle_servicio.setVisible(true);
        form_ot_crear_detalle_servicio.toFront();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(FrmGestion_OT_Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_OT_Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_OT_Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_OT_Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestion_OT_Crear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_OT_Crear_Aceptar_OT;
    private javax.swing.JLabel Lbl_OT_Crear_Actualizar_OT;
    private javax.swing.JLabel Lbl_OT_Crear_Buscar_UPS;
    private javax.swing.JLabel Lbl_OT_Crear_Enviar_Mail;
    private javax.swing.JTable Tbl_OT_Crear_UPS_Datos;
    private javax.swing.JTextField Txt_OT_Crear_Buscar_UPS;
    public static javax.swing.JTextField Txt_OT_Crear_DetalleSolicitud;
    private javax.swing.JTextField Txt_OT_Crear_Direccion;
    public static javax.swing.JTextField Txt_OT_Crear_EstadoServicio;
    private javax.swing.JTextField Txt_OT_Crear_FechaReporte;
    private javax.swing.JTextField Txt_OT_Crear_Fecha_Program;
    private javax.swing.JTextField Txt_OT_Crear_Fecha_Reprogram;
    private javax.swing.JTextField Txt_OT_Crear_HoraReporte;
    private javax.swing.JTextField Txt_OT_Crear_Hora_Program;
    private javax.swing.JTextField Txt_OT_Crear_NomLocal;
    private javax.swing.JTextField Txt_OT_Crear_NroAtm_CC;
    private javax.swing.JTextField Txt_OT_Crear_Nro_OT;
    public static javax.swing.JTextField Txt_OT_Crear_Proveedor;
    private javax.swing.JTextField Txt_OT_Crear_Tecnic;
    private javax.swing.JTextField Txt_OT_Crear_TipoLocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void Ocultar_Columnas_UPS() {
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(0).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(0).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(0).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(2).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(2).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(2).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(5).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(5).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(5).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(6).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(6).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(6).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(7).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(7).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(7).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(8).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(8).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(8).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(9).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(9).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(9).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(10).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(10).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(10).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(11).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(11).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(11).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(13).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(13).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(13).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(14).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(14).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(14).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(15).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(15).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(15).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(16).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(16).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(16).setPreferredWidth(0);        
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(17).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(17).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(17).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(18).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(18).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(18).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(19).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(19).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(19).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(20).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(20).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(20).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(21).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(21).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(21).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(22).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(22).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(22).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(23).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(23).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(23).setPreferredWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(24).setMaxWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(24).setMinWidth(0);
        Tbl_OT_Crear_UPS_Datos.getColumnModel().getColumn(24).setPreferredWidth(0);        
    }

    private void Buscar_Nuevo_Nro_OT() {
        
        String Nro_OT_Actual;
        L_OTEventos func = new L_OTEventos();
        Nro_OT_Actual = func.Buscar_OT_Mayor();
        int Nro_OT_Actualizado = Integer.parseInt(Nro_OT_Actual)+1;
        Txt_OT_Crear_Nro_OT.setText(Integer.toString(Nro_OT_Actualizado));
        
    }
}
