/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ValidationRegister;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Connexion;
import modelo.User;

/**
 *
 * @author josea
 */
public class FrmUpdateUser extends javax.swing.JFrame {

    private FrmRecords frmRecords;
    private User user;

    public FrmUpdateUser(FrmRecords frmRecords, User user) {
        initComponents();

        this.frmRecords = frmRecords;
        this.user = user;

        txtUser.setText(user.getUser());
        txtName.setText(user.getName());
        txtSurname.setText(user.getSurname());
        txtTelephone.setText(user.getTelephone());
        txtEmail.setText(user.getEmail());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtPasswordCurrent = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblUserError = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();
        lblSurnameError = new javax.swing.JLabel();
        lblTelephoneError = new javax.swing.JLabel();
        lblEmailError = new javax.swing.JLabel();
        lblPasswordCurrentError = new javax.swing.JLabel();
        lblPasswordError = new javax.swing.JLabel();
        lblConfirmPasswordError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDICIÓN DE USUARIO");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Teléfono");

        jLabel5.setText("Email");

        jLabel6.setText("Contraseña actual");

        jLabel7.setText("Contraseña nueva");

        jLabel8.setText("Confirm. contraseña");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblUserError.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNameError.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSurnameError.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTelephoneError.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEmailError.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPasswordCurrentError.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPasswordError.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblConfirmPasswordError.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSurname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUserError, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSurnameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelephoneError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail)
                    .addComponent(txtPasswordCurrent)
                    .addComponent(txtPassword)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPasswordCurrentError, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(lblEmailError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConfirmPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblUserError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSurnameError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEmailError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPasswordCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPasswordCurrentError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelephoneError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirmPasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        frmRecords.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        String nameUser = txtUser.getText();
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String telephone = txtTelephone.getText();
        String email = txtEmail.getText();

        String passwordCurrent = "";
        for (char item : txtPasswordCurrent.getPassword()) {
            passwordCurrent += item;
        }

        String password = "";
        for (char item : txtPassword.getPassword()) {
            password += item;
        }

        String confirmPassword = "";
        for (char item : txtConfirmPassword.getPassword()) {
            confirmPassword += item;
        }

        boolean tag = true;

        if (!ValidationRegister.validateUser(nameUser)) {
            lblUserError.setIcon(
                    new ImageIcon(getClass().getResource("/iconos/error.png")));

            JOptionPane.showMessageDialog(this,
                    "Todos los campos son obligatorios.", "CAMPO IMCOMPLETO",
                    JOptionPane.ERROR_MESSAGE);
            tag = false;
        } else if (!ValidationRegister.validateName(name)) {
            lblNameError.setIcon(
                    new ImageIcon(getClass().getResource("/iconos/error.png")));

            JOptionPane.showMessageDialog(this,
                    "Todos los campos son obligatorios.", "CAMPO IMCOMPLETO",
                    JOptionPane.ERROR_MESSAGE);
            tag = false;
        } else if (!ValidationRegister.validateSurname(surname)) {
            lblSurnameError.setIcon(
                    new ImageIcon(getClass().getResource("/iconos/error.png")));

            JOptionPane.showMessageDialog(this,
                    "Todos los campos son obligatorios.", "CAMPO IMCOMPLETO",
                    JOptionPane.ERROR_MESSAGE);
            tag = false;
        } else if (!ValidationRegister.validateTelephone(telephone)) {
            lblTelephoneError.setIcon(
                    new ImageIcon(getClass().getResource("/iconos/error.png")));

            JOptionPane.showMessageDialog(this,
                    "Todos los campos son obligatorios.", "CAMPO IMCOMPLETO",
                    JOptionPane.ERROR_MESSAGE);
            tag = false;
        } else if (!ValidationRegister.validateEmail(email)) {
            lblEmailError.setIcon(
                    new ImageIcon(getClass().getResource("/iconos/error.png")));

            JOptionPane.showMessageDialog(this,
                    "Todos los campos son obligatorios.", "CAMPO IMCOMPLETO",
                    JOptionPane.ERROR_MESSAGE);
            tag = false;
        } else {

            lblUserError.setIcon(null);
            lblNameError.setIcon(null);
            lblSurnameError.setIcon(null);
            lblTelephoneError.setIcon(null);
            lblEmailError.setIcon(null);

            if (passwordCurrent.length() > 0) {

                if (passwordCurrent.equals(user.getPassword())) {

                    lblPasswordCurrentError.setIcon(null);
                    if (!ValidationRegister.validatePassword(password)) {
                        lblPasswordError.setIcon(
                                new ImageIcon(getClass().getResource("/iconos/error.png")));

                        JOptionPane.showMessageDialog(this,
                                "Este campo es obligatorio.", "CAMPO IMCOMPLETO",
                                JOptionPane.ERROR_MESSAGE);
                        tag = false;
                    } else if (!ValidationRegister.validatePassword(confirmPassword)) {
                        lblPasswordError.setIcon(null);
                        lblConfirmPasswordError.setIcon(
                                new ImageIcon(getClass().getResource("/iconos/error.png")));

                        JOptionPane.showMessageDialog(this,
                                "Este campo es obligatorio.", "CAMPO IMCOMPLETO",
                                JOptionPane.ERROR_MESSAGE);
                        tag = false;
                    } else if (!password.equals(confirmPassword)) {
                       
                        lblPasswordError.setIcon(
                                new ImageIcon(getClass().getResource("/iconos/error.png")));
                        lblConfirmPasswordError.setIcon(
                                new ImageIcon(getClass().getResource("/iconos/error.png")));
                        JOptionPane.showMessageDialog(this,
                                "Los campos de la nueva contraseña "
                                + "no coinciden", "CAMPOS INCORRECTO",
                                JOptionPane.ERROR_MESSAGE);
                        tag = false;

                    } else {
                        lblConfirmPasswordError.setIcon(null);
                    }

                } else {

                    lblPasswordCurrentError.setIcon(
                            new ImageIcon(getClass().getResource("/iconos/error.png")));

                    JOptionPane.showMessageDialog(this,
                            "La contraseña actual esta erronea.",
                            "CONTRASEÑA ACTUAL INCORRECTA",
                            JOptionPane.ERROR_MESSAGE);
                    tag = false;

                }
            }
        }

        if (tag) {
            Connexion.update(user);
            frmRecords.refreshTable();
            frmRecords.setEnabled(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frmRecords.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblConfirmPasswordError;
    private javax.swing.JLabel lblEmailError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPasswordCurrentError;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblSurnameError;
    private javax.swing.JLabel lblTelephoneError;
    private javax.swing.JLabel lblUserError;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordCurrent;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
