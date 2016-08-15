/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.L_UPSDatos;
import static Presentacion.FrmGestion_UPS_Datos.UbicarPuntoUPS;
import com.sun.awt.AWTUtilities;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kandskat
 */
public class FrmGestion_UPS_Datos_Detalle extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Gestion_UPS_Datos_Detalle
     */
    public FrmGestion_UPS_Datos_Detalle() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        jScrollPane1.setVisible(false);
        
        String PuntoUbicar = UbicarPuntoUPS;
        Mostrando_Datos_Ubicados(PuntoUbicar);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lbl_UPS_Datos_Detalle_Buscar = new javax.swing.JLabel();
        Lbl_UPS_Datos_Detalle_Eventos = new javax.swing.JLabel();
        Lbl_UPS_Datos_Detalle_Ubicar_Direccion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Lbl_UPS_Datos_Detalle_Email = new javax.swing.JLabel();
        Lbl_UPS_Datos_Detalle_ActualizarD = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Lbl_UPS_Datos_Detalle_Ubicacion_Photo = new javax.swing.JLabel();
        Txt_UPS_Datos_Detalle_Capacidad = new javax.swing.JTextField();
        Txt_UPS_Datos_Detalle_Buscar = new javax.swing.JTextField();
        Txt_UPS_Datos_Detalle_Direccion = new javax.swing.JTextField();
        Txt_UPS_Datos_Detalle_NroATM = new javax.swing.JTextField();
        Txt_UPS_Datos_Detalle_IP = new javax.swing.JTextField();
        Txt_UPS_Datos_Detalle_MskSr = new javax.swing.JTextField();
        Txt_UPS_Datos_Detalle_MarcaModel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_UPS_Datos_Detalle_Mostrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 10, 20));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 20));

        Lbl_UPS_Datos_Detalle_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Lbl_UPS_Datos_Detalle_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 120, 30));

        Lbl_UPS_Datos_Detalle_Eventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_UPS_Datos_Detalle_Eventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_UPS_Datos_Detalle_EventosMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_UPS_Datos_Detalle_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 120, 30));

        Lbl_UPS_Datos_Detalle_Ubicar_Direccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_UPS_Datos_Detalle_Ubicar_Direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_UPS_Datos_Detalle_Ubicar_DireccionMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_UPS_Datos_Detalle_Ubicar_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 120, 30));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 70, 60));

        Lbl_UPS_Datos_Detalle_Email.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Lbl_UPS_Datos_Detalle_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 60, 60));

        Lbl_UPS_Datos_Detalle_ActualizarD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Lbl_UPS_Datos_Detalle_ActualizarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 60, 60));

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 60, 60));
        getContentPane().add(Lbl_UPS_Datos_Detalle_Ubicacion_Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 390, 320));

        Txt_UPS_Datos_Detalle_Capacidad.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_UPS_Datos_Detalle_Capacidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_UPS_Datos_Detalle_Capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 110, -1));

        Txt_UPS_Datos_Detalle_Buscar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_UPS_Datos_Detalle_Buscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_UPS_Datos_Detalle_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 300, -1));

        Txt_UPS_Datos_Detalle_Direccion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_UPS_Datos_Detalle_Direccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_UPS_Datos_Detalle_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 110, -1));

        Txt_UPS_Datos_Detalle_NroATM.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_UPS_Datos_Detalle_NroATM.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_UPS_Datos_Detalle_NroATM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 120, -1));

        Txt_UPS_Datos_Detalle_IP.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_UPS_Datos_Detalle_IP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_UPS_Datos_Detalle_IP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 120, -1));

        Txt_UPS_Datos_Detalle_MskSr.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_UPS_Datos_Detalle_MskSr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_UPS_Datos_Detalle_MskSr, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 120, -1));

        Txt_UPS_Datos_Detalle_MarcaModel.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_UPS_Datos_Detalle_MarcaModel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_UPS_Datos_Detalle_MarcaModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/FrmUpsDetalle.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, -1));

        Tbl_UPS_Datos_Detalle_Mostrar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tbl_UPS_Datos_Detalle_Mostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 80, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        setExtendedState(FrmGestion_UPS_Datos_Detalle.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void Lbl_UPS_Datos_Detalle_Ubicar_DireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_UPS_Datos_Detalle_Ubicar_DireccionMouseClicked
        // TODO add your handling code here:
        String Direction;
        Direction = Txt_UPS_Datos_Detalle_Direccion.getText();
        Direction = Direction.replace(' ', '+');
        try {
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE)){
                    //desktop.browse(new URI("https://www.google.com.pe/maps/place/BBVA+Banco+Continental/@-12.0719335,-77.0382145,18z/data=!4m8!1m2!2m1!1sbbva!3m4!1s0x0:0x43eeb3f9488b7093!8m2!3d-12.071611!4d-77.0374209"));
                    desktop.browse(new URI("https://www.google.com.pe/maps?q="+Direction+"&bav=on.2,or.r_cp.&bvm=bv.129422649,d.eWE&biw=1366&bih=643&dpr=1&um=1&ie=UTF-8&sa=X&ved=0ahUKEwil8L_Y28LOAhVL5SYKHe0hAZUQ_AUIBigB"));
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Lbl_UPS_Datos_Detalle_Ubicar_DireccionMouseClicked

    private void Lbl_UPS_Datos_Detalle_EventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_UPS_Datos_Detalle_EventosMouseClicked
        // TODO add your handling code here:
        FrmGestion_OT_Eventos form_OT_Eventos_from_UPS_Detalles = new FrmGestion_OT_Eventos();
        form_OT_Eventos_from_UPS_Detalles.setVisible(true);
        form_OT_Eventos_from_UPS_Detalles.toFront();
        form_OT_Eventos_from_UPS_Detalles.Buscar_Eventos(Tbl_UPS_Datos_Detalle_Mostrar.getValueAt(0, 1).toString());
        
    }//GEN-LAST:event_Lbl_UPS_Datos_Detalle_EventosMouseClicked

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
            java.util.logging.Logger.getLogger(FrmGestion_UPS_Datos_Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_UPS_Datos_Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_UPS_Datos_Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_UPS_Datos_Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestion_UPS_Datos_Detalle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_UPS_Datos_Detalle_ActualizarD;
    private javax.swing.JLabel Lbl_UPS_Datos_Detalle_Buscar;
    private javax.swing.JLabel Lbl_UPS_Datos_Detalle_Email;
    private javax.swing.JLabel Lbl_UPS_Datos_Detalle_Eventos;
    private javax.swing.JLabel Lbl_UPS_Datos_Detalle_Ubicacion_Photo;
    private javax.swing.JLabel Lbl_UPS_Datos_Detalle_Ubicar_Direccion;
    private javax.swing.JTable Tbl_UPS_Datos_Detalle_Mostrar;
    private javax.swing.JTextField Txt_UPS_Datos_Detalle_Buscar;
    private javax.swing.JTextField Txt_UPS_Datos_Detalle_Capacidad;
    private javax.swing.JTextField Txt_UPS_Datos_Detalle_Direccion;
    private javax.swing.JTextField Txt_UPS_Datos_Detalle_IP;
    private javax.swing.JTextField Txt_UPS_Datos_Detalle_MarcaModel;
    private javax.swing.JTextField Txt_UPS_Datos_Detalle_MskSr;
    private javax.swing.JTextField Txt_UPS_Datos_Detalle_NroATM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Mostrando_Datos_Ubicados(String UbicarPunto) {
        try {
            DefaultTableModel model;
            L_UPSDatos func = new L_UPSDatos();
            model = func.MostrandoDatosUnicos(UbicarPunto);
            Tbl_UPS_Datos_Detalle_Mostrar.setModel(model);
            
            Txt_UPS_Datos_Detalle_Buscar.setText(Tbl_UPS_Datos_Detalle_Mostrar.getValueAt(0, 0).toString());
            Txt_UPS_Datos_Detalle_Direccion.setText(Tbl_UPS_Datos_Detalle_Mostrar.getValueAt(0, 2).toString());
            Txt_UPS_Datos_Detalle_NroATM.setText(Tbl_UPS_Datos_Detalle_Mostrar.getValueAt(0, 4).toString());
            Txt_UPS_Datos_Detalle_IP.setText(Tbl_UPS_Datos_Detalle_Mostrar.getValueAt(0, 12).toString());
            Txt_UPS_Datos_Detalle_MskSr.setText(Tbl_UPS_Datos_Detalle_Mostrar.getValueAt(0, 13).toString());
            Txt_UPS_Datos_Detalle_Capacidad.setText(Tbl_UPS_Datos_Detalle_Mostrar.getValueAt(0, 10).toString());
            Txt_UPS_Datos_Detalle_MarcaModel.setText(Tbl_UPS_Datos_Detalle_Mostrar.getValueAt(0, 11).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
}
