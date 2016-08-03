/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.L_OTEventos;
import Logica.L_POIExcel;
import com.sun.awt.AWTUtilities;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kandskat
 */
public class FrmGestion_OT_Eventos extends javax.swing.JFrame {

    /**
     * Creates new form FrmGestion_OT_Eventos
     */
    public FrmGestion_OT_Eventos() {
        this.setUndecorated(true);
        initComponents();        
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        jScrollPane1.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbl_OT_Eventos_Agregar = new javax.swing.JLabel();
        Lbl_OT_Eventos_Mail = new javax.swing.JLabel();
        Lbl_OT_Eventos_Actualizar = new javax.swing.JLabel();
        Lbl_OT_Eventos_ConvToExel = new javax.swing.JLabel();
        Lbl_OT_Eventos_Busqueda_Detallada = new javax.swing.JLabel();
        Lbl_OT_Eventos_Pendientes = new javax.swing.JLabel();
        Lbl_OT_Eventos_Close = new javax.swing.JLabel();
        Lbl_OT_Eventos_Min = new javax.swing.JLabel();
        Lbl_OT_Eventos_Buscar = new javax.swing.JLabel();
        Txt_OT_Eventos_Buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_OT_Eventos_Mostrando = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_OT_Eventos_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_OT_Eventos_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_OT_Eventos_AgregarMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_OT_Eventos_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 60, 60));

        Lbl_OT_Eventos_Mail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Lbl_OT_Eventos_Mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 60, 60));

        Lbl_OT_Eventos_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Lbl_OT_Eventos_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 60, 60));

        Lbl_OT_Eventos_ConvToExel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_OT_Eventos_ConvToExel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_OT_Eventos_ConvToExelMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_OT_Eventos_ConvToExel, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 60, 60));

        Lbl_OT_Eventos_Busqueda_Detallada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Lbl_OT_Eventos_Busqueda_Detallada, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 120, 30));

        Lbl_OT_Eventos_Pendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_OT_Eventos_Pendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_OT_Eventos_PendientesMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_OT_Eventos_Pendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, 120, 30));

        Lbl_OT_Eventos_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_OT_Eventos_CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_OT_Eventos_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 10, 20));

        Lbl_OT_Eventos_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_OT_Eventos_MinMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_OT_Eventos_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 20));

        Lbl_OT_Eventos_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_OT_Eventos_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_OT_Eventos_BuscarMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_OT_Eventos_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 120, 30));

        Txt_OT_Eventos_Buscar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Eventos_Buscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Eventos_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 290, -1));

        Tbl_OT_Eventos_Mostrando.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        Tbl_OT_Eventos_Mostrando.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tbl_OT_Eventos_Mostrando);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 960, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/FrmOTEventos.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_OT_Eventos_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_OT_Eventos_BuscarMouseClicked
        // TODO add your handling code here:
        Buscar_Eventos(Txt_OT_Eventos_Buscar.getText());       
    }//GEN-LAST:event_Lbl_OT_Eventos_BuscarMouseClicked

    private void Lbl_OT_Eventos_PendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_OT_Eventos_PendientesMouseClicked
        // TODO add your handling code here:
        FrmGestion_OT_Pendientes form_ot_pendientes = new FrmGestion_OT_Pendientes();
        form_ot_pendientes.setVisible(true);
        form_ot_pendientes.toFront();
        
    }//GEN-LAST:event_Lbl_OT_Eventos_PendientesMouseClicked

    private void Lbl_OT_Eventos_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_OT_Eventos_CloseMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Lbl_OT_Eventos_CloseMouseClicked

    private void Lbl_OT_Eventos_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_OT_Eventos_MinMouseClicked
        // TODO add your handling code here:
        setExtendedState(FrmGestion_OT_Eventos.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_Lbl_OT_Eventos_MinMouseClicked

    private void Lbl_OT_Eventos_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_OT_Eventos_AgregarMouseClicked
        // TODO add your handling code here:
        FrmGestion_OT_Crear form = new FrmGestion_OT_Crear();
        form.setVisible(true);
        form.toFront();
    }//GEN-LAST:event_Lbl_OT_Eventos_AgregarMouseClicked

    private void Lbl_OT_Eventos_ConvToExelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_OT_Eventos_ConvToExelMouseClicked
        // TODO add your handling code here:
        L_POIExcel Conv_Tbl_Excel = new L_POIExcel();
        try {
            //EL METODO EXPORTAR DEBE DE TENER EL THROW EXCEPTION
            //RECUERDA AGREGARLO AL METODO NECESARIAMENTE
            Conv_Tbl_Excel.Exportar(Tbl_OT_Eventos_Mostrando);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Lbl_OT_Eventos_ConvToExelMouseClicked

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
            java.util.logging.Logger.getLogger(FrmGestion_OT_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_OT_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_OT_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_OT_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestion_OT_Eventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_OT_Eventos_Actualizar;
    private javax.swing.JLabel Lbl_OT_Eventos_Agregar;
    private javax.swing.JLabel Lbl_OT_Eventos_Buscar;
    private javax.swing.JLabel Lbl_OT_Eventos_Busqueda_Detallada;
    private javax.swing.JLabel Lbl_OT_Eventos_Close;
    private javax.swing.JLabel Lbl_OT_Eventos_ConvToExel;
    private javax.swing.JLabel Lbl_OT_Eventos_Mail;
    private javax.swing.JLabel Lbl_OT_Eventos_Min;
    private javax.swing.JLabel Lbl_OT_Eventos_Pendientes;
    private javax.swing.JTable Tbl_OT_Eventos_Mostrando;
    private javax.swing.JTextField Txt_OT_Eventos_Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    void Buscar_Eventos(String buscar) {
        jScrollPane1.setVisible(true);
        try {
            DefaultTableModel model;
            L_OTEventos func = new L_OTEventos();
            model=func.MostrandoEventos(buscar);
            
            Tbl_OT_Eventos_Mostrando.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
}
