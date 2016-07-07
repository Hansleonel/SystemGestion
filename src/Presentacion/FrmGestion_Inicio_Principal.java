  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import com.sun.awt.AWTUtilities;

/**
 *
 * @author kandskat
 */
public class FrmGestion_Inicio_Principal extends javax.swing.JFrame {

    /**
     * Creates new form FrmGestion_Inicio_Principal
     */
    public FrmGestion_Inicio_Principal() {
        this.setUndecorated(true);
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbl_Inicio_Principal_UPS_Eventos = new javax.swing.JLabel();
        Lbl_Inicio_Principal_UPS_Datos = new javax.swing.JLabel();
        Lbl_Inicio_Principal_Dispos = new javax.swing.JLabel();
        Lbl_Inicio_Principal_Min = new javax.swing.JLabel();
        Lbl_Inicio_Principal_Panel_01 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Inicio_Principal_UPS_Eventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Inicio_Principal_UPS_Eventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Inicio_Principal_UPS_EventosMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Inicio_Principal_UPS_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 250, 260));

        Lbl_Inicio_Principal_UPS_Datos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Inicio_Principal_UPS_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Inicio_Principal_UPS_DatosMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Inicio_Principal_UPS_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 240, 260));

        Lbl_Inicio_Principal_Dispos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Inicio_Principal_Dispos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Inicio_Principal_DisposMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Inicio_Principal_Dispos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 10, 30));

        Lbl_Inicio_Principal_Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Inicio_Principal_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Inicio_Principal_MinMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Inicio_Principal_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 30));

        Lbl_Inicio_Principal_Panel_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/FrmPrincipal.png"))); // NOI18N
        getContentPane().add(Lbl_Inicio_Principal_Panel_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_Inicio_Principal_UPS_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Inicio_Principal_UPS_DatosMouseClicked
        // TODO add your handling code here:
        FrmGestion_UPS_Datos form_ups_datos = new FrmGestion_UPS_Datos();
        form_ups_datos.setVisible(true);
        form_ups_datos.toFront();
        dispose();
    }//GEN-LAST:event_Lbl_Inicio_Principal_UPS_DatosMouseClicked

    private void Lbl_Inicio_Principal_UPS_EventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Inicio_Principal_UPS_EventosMouseClicked
        // TODO add your handling code here:
        FrmGestion_OT_Eventos form_ot_eventos = new FrmGestion_OT_Eventos();
        form_ot_eventos.setVisible(true);
        form_ot_eventos.toFront();
        dispose();
    }//GEN-LAST:event_Lbl_Inicio_Principal_UPS_EventosMouseClicked

    private void Lbl_Inicio_Principal_DisposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Inicio_Principal_DisposMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Lbl_Inicio_Principal_DisposMouseClicked

    private void Lbl_Inicio_Principal_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Inicio_Principal_MinMouseClicked
        // TODO add your handling code here:
        setExtendedState(FrmGestion_Inicio_Principal.CROSSHAIR_CURSOR);        
    }//GEN-LAST:event_Lbl_Inicio_Principal_MinMouseClicked

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
            java.util.logging.Logger.getLogger(FrmGestion_Inicio_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_Inicio_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_Inicio_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_Inicio_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestion_Inicio_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Inicio_Principal_Dispos;
    private javax.swing.JLabel Lbl_Inicio_Principal_Min;
    private javax.swing.JLabel Lbl_Inicio_Principal_Panel_01;
    private javax.swing.JLabel Lbl_Inicio_Principal_UPS_Datos;
    private javax.swing.JLabel Lbl_Inicio_Principal_UPS_Eventos;
    // End of variables declaration//GEN-END:variables
}
