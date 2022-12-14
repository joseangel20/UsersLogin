/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.usuario;

import vista.producto.FrmProductoRecords;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author josea
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private ImageIcon imagen, icono;
    private FrmLogin frmLogin;

    /**
     * Creates new form NewJFrame
     */
    
    FrmPrincipal() {
        initComponents();
    }
    
    public FrmPrincipal(FrmLogin frmLogin) {
        initComponents();
        this.frmLogin = frmLogin;
    }

//    public void pintarImagen(JLabel lbl, String ruta) {
//        imagen = new ImageIcon(ruta);
//        icono = new ImageIcon(imagen.getImage()
//                .getScaledInstance(lbl.getWidth(), lbl.getHeight(),
//                        Image.SCALE_DEFAULT));
//
//        lbl.setIcon(icono);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        btnCloseSession = new javax.swing.JButton();
        lblProduct = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PANTALLA PRINCIPAL");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/configure_user.png"))); // NOI18N
        lblUser.setText("Usuarios");
        lblUser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserMouseClicked(evt);
            }
        });

        btnCloseSession.setText("CERRAR SECCION");
        btnCloseSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseSessionActionPerformed(evt);
            }
        });

        lblProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/product_negocio.png"))); // NOI18N
        lblProduct.setText("Productos");
        lblProduct.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblProduct.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnCloseSession, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCloseSession, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked
        this.setVisible(false);
        FrmUserRecords frmRegistro = new FrmUserRecords(this);
        //frmRegistro.setFrmLogin(frmLogin);
        frmRegistro.setVisible(true);
        frmRegistro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmRegistro.setLocationRelativeTo(this);
    }//GEN-LAST:event_lblUserMouseClicked

    private void btnCloseSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseSessionActionPerformed
        frmLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseSessionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frmLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void lblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductMouseClicked
        this.setVisible(false);
        FrmProductoRecords frmProductoRecords = new FrmProductoRecords(this);
        //frmRecords.setFrmLogin(frmLogin);
        frmProductoRecords.setVisible(true);
        frmProductoRecords.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmProductoRecords.setLocationRelativeTo(this);
    }//GEN-LAST:event_lblProductMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseSession;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
