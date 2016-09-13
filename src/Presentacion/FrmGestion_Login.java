/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.D_Login;
import Logica.Login;
import com.sun.awt.AWTUtilities;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kandskat
 */
public class FrmGestion_Login extends javax.swing.JFrame {

    /**
     * Creates new form FrmGestion_Login
     */
    public FrmGestion_Login() {
        this.setUndecorated(true);
        initComponents();        
        AWTUtilities.setWindowOpaque(this, false);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbl_Login_Ingresar = new javax.swing.JLabel();
        Lbl_Login_Recuperar = new javax.swing.JLabel();
        Txt_Pass_Login = new javax.swing.JPasswordField();
        Txt_Name_Login = new javax.swing.JTextField();
        FrmGestion_Login_Min = new javax.swing.JLabel();
        FrmGestion_Login_Close = new javax.swing.JLabel();
        FrmGestion_Login_Panel_01 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Login_Ingresar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Login_Ingresar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        Lbl_Login_Ingresar.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_Login_Ingresar.setText("         Ingresar");
        Lbl_Login_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Login_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Login_IngresarMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Login_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 200, 30));

        Lbl_Login_Recuperar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        Lbl_Login_Recuperar.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_Login_Recuperar.setText("       Recuperar");
        getContentPane().add(Lbl_Login_Recuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 500, 210, 40));

        Txt_Pass_Login.setBackground(new java.awt.Color(102, 102, 102));
        Txt_Pass_Login.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        Txt_Pass_Login.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Pass_Login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_Pass_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 230, 50));

        Txt_Name_Login.setBackground(new java.awt.Color(102, 102, 102));
        Txt_Name_Login.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        Txt_Name_Login.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Name_Login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_Name_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 230, 50));

        FrmGestion_Login_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrmGestion_Login_MinMouseClicked(evt);
            }
        });
        getContentPane().add(FrmGestion_Login_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 60, 30));

        FrmGestion_Login_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrmGestion_Login_CloseMouseClicked(evt);
            }
        });
        getContentPane().add(FrmGestion_Login_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 60, 30));

        FrmGestion_Login_Panel_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Login.png"))); // NOI18N
        FrmGestion_Login_Panel_01.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrmGestion_Login_Panel_01MouseDragged(evt);
            }
        });
        FrmGestion_Login_Panel_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrmGestion_Login_Panel_01MousePressed(evt);
            }
        });
        getContentPane().add(FrmGestion_Login_Panel_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        Tbl_Login_Ingresar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tbl_Login_Ingresar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_Login_IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Login_IngresarMouseClicked
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo;
            Login function = new Login();
            D_Login dts = new D_Login();
            
            dts.setIdUsuario(Txt_Name_Login.getText());
            dts.setPwUsuario(Txt_Pass_Login.getText());
            
            modelo = function.lorgeo(dts.getIdUsuario(), dts.getPwUsuario());
            Tbl_Login_Ingresar.setModel(modelo);
            if(function.totalregistros==1){
                //FrmGestion_Inicio_Principal form = new FrmGestion_Inicio_Principal();
                FrmGestion_Login_Iniciar form = new FrmGestion_Login_Iniciar();
                form.setVisible(true);
                form.toFront();
                dispose();
            }
            else{
                JOptionPane.showConfirmDialog(rootPane, "Acceso Denegado","Acceso al Sistema",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Acceso Denegado","Acceso al Sistema",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Lbl_Login_IngresarMouseClicked

    private void FrmGestion_Login_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrmGestion_Login_CloseMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_FrmGestion_Login_CloseMouseClicked

    private void FrmGestion_Login_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrmGestion_Login_MinMouseClicked
        // TODO add your handling code here:
        setExtendedState(FrmGestion_Login.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_FrmGestion_Login_MinMouseClicked

    int posx;
    int posy;
    private void FrmGestion_Login_Panel_01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrmGestion_Login_Panel_01MousePressed
        // TODO add your handling code here:
        posx=evt.getX();
        posy=evt.getY();
    }//GEN-LAST:event_FrmGestion_Login_Panel_01MousePressed

    private void FrmGestion_Login_Panel_01MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrmGestion_Login_Panel_01MouseDragged
        // TODO add your handling code here:
        int xposicion = evt.getXOnScreen()-posx;
        int yposicion = evt.getYOnScreen()-posy;
        this.setLocation(xposicion,yposicion);
    }//GEN-LAST:event_FrmGestion_Login_Panel_01MouseDragged

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
            java.util.logging.Logger.getLogger(FrmGestion_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestion_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FrmGestion_Login_Close;
    private javax.swing.JLabel FrmGestion_Login_Min;
    private javax.swing.JLabel FrmGestion_Login_Panel_01;
    private javax.swing.JLabel Lbl_Login_Ingresar;
    private javax.swing.JLabel Lbl_Login_Recuperar;
    private javax.swing.JTable Tbl_Login_Ingresar;
    private javax.swing.JTextField Txt_Name_Login;
    private javax.swing.JPasswordField Txt_Pass_Login;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
