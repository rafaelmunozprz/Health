/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthfocus;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class nuevoUsuarioFrame extends javax.swing.JFrame {

    selectorTexto seleccionarTexto = new selectorTexto();
    funciones funcion = new funciones();

    /**
     * Creates new form nuevoUsuarioFrame
     */
    public nuevoUsuarioFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/icons/headerIcon.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPass = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        labelPass2 = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        labelApellidos = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        labelSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        labelFNac = new javax.swing.JLabel();
        tfNac = new javax.swing.JTextField();
        labelEstatura = new javax.swing.JLabel();
        tfEstatura = new javax.swing.JTextField();
        labelDomicilio = new javax.swing.JLabel();
        tfDomicilio = new javax.swing.JTextField();
        labelCP = new javax.swing.JLabel();
        tfCP = new javax.swing.JTextField();
        labelCiudad = new javax.swing.JLabel();
        tfCiudad = new javax.swing.JTextField();
        btnGuardarUsuario = new javax.swing.JButton();
        labelGuardarUsuario = new javax.swing.JLabel();
        labelGuardar = new javax.swing.JLabel();
        jpPass = new javax.swing.JPasswordField();
        jpPass2 = new javax.swing.JPasswordField();
        labelFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HF - Nuevo usuario");
        setPreferredSize(new java.awt.Dimension(1024, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPass.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelPass.setForeground(new java.awt.Color(255, 255, 255));
        labelPass.setText("Contraseña");
        getContentPane().add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        labelID.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(153, 217, 234));
        labelID.setText("ID usuario");
        getContentPane().add(labelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        tfID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfID.setText("2074482299");
        tfID.setToolTipText("Agregar solo números");
        tfID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIDFocusLost(evt);
            }
        });
        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });
        getContentPane().add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 200, -1));

        labelPass2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelPass2.setForeground(new java.awt.Color(255, 255, 255));
        labelPass2.setText("Confirmar constraseña");
        getContentPane().add(labelPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, -1));

        labelInfo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 22)); // NOI18N
        labelInfo.setForeground(new java.awt.Color(153, 217, 234));
        labelInfo.setText("Datos de nuevo usuario");
        getContentPane().add(labelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labelNombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(153, 217, 234));
        labelNombre.setText("Nombre");
        getContentPane().add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        tfNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNombre.setText("Kevin");
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, -1));

        labelApellidos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelApellidos.setForeground(new java.awt.Color(153, 217, 234));
        labelApellidos.setText("Apellidos");
        getContentPane().add(labelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        tfApellidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfApellidos.setText("Alcantar Almaraz");
        tfApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfApellidosFocusLost(evt);
            }
        });
        tfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 200, -1));

        labelSexo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelSexo.setForeground(new java.awt.Color(153, 217, 234));
        labelSexo.setText("Sexo");
        getContentPane().add(labelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, -1, -1));

        cbSexo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Femenino", "Masculino" }));
        cbSexo.setSelectedIndex(1);
        cbSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 150, -1));

        labelFNac.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelFNac.setForeground(new java.awt.Color(153, 217, 234));
        labelFNac.setText("Nacimiento");
        getContentPane().add(labelFNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        tfNac.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfNac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNac.setText("1997-12-25");
        tfNac.setToolTipText("Ejemplo: 1992-07-21");
        tfNac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNacFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNacFocusLost(evt);
            }
        });
        getContentPane().add(tfNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 200, -1));

        labelEstatura.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelEstatura.setForeground(new java.awt.Color(153, 217, 234));
        labelEstatura.setText("Estatura");
        getContentPane().add(labelEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        tfEstatura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfEstatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEstatura.setText("165");
        tfEstatura.setToolTipText("Agregar la estatura en centimetros");
        tfEstatura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEstaturaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEstaturaFocusLost(evt);
            }
        });
        tfEstatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEstaturaActionPerformed(evt);
            }
        });
        getContentPane().add(tfEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 200, -1));

        labelDomicilio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelDomicilio.setForeground(new java.awt.Color(153, 217, 234));
        labelDomicilio.setText("Domicilio");
        getContentPane().add(labelDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        tfDomicilio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfDomicilio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDomicilio.setText("Tierra morada # 26");
        tfDomicilio.setToolTipText("Agregar el nombre del domicilio, con número");
        tfDomicilio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDomicilioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDomicilioFocusLost(evt);
            }
        });
        getContentPane().add(tfDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 540, -1));

        labelCP.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelCP.setForeground(new java.awt.Color(153, 217, 234));
        labelCP.setText("CP");
        getContentPane().add(labelCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, -1));

        tfCP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCP.setText("47140");
        tfCP.setToolTipText("Agregar el código postal");
        tfCP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCPFocusLost(evt);
            }
        });
        tfCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPActionPerformed(evt);
            }
        });
        getContentPane().add(tfCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 150, -1));

        labelCiudad.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelCiudad.setForeground(new java.awt.Color(153, 217, 234));
        labelCiudad.setText("Ciudad");
        getContentPane().add(labelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        tfCiudad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCiudad.setText("Acatic, Jalisco");
        tfCiudad.setToolTipText("Agregar el nombre de la ciudad");
        tfCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCiudadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCiudadFocusLost(evt);
            }
        });
        tfCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(tfCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 540, -1));

        btnGuardarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/nutritionist_128px.png"))); // NOI18N
        btnGuardarUsuario.setToolTipText("Guardar nuevo usuario");
        btnGuardarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarUsuario.setBorderPainted(false);
        btnGuardarUsuario.setContentAreaFilled(false);
        btnGuardarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarUsuario.setFocusPainted(false);
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        labelGuardarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_32px/plus_#64C99E_32px.png"))); // NOI18N
        getContentPane().add(labelGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        labelGuardar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        labelGuardar.setForeground(new java.awt.Color(255, 255, 255));
        labelGuardar.setText("Guardar ");
        getContentPane().add(labelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, -1, -1));

        jpPass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jpPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpPass.setText("kevin");
        jpPass.setToolTipText("Ingresar contraseña del usuario");
        jpPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpPassFocusLost(evt);
            }
        });
        jpPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpPassActionPerformed(evt);
            }
        });
        getContentPane().add(jpPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 200, -1));

        jpPass2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jpPass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpPass2.setText("kevin");
        jpPass2.setToolTipText("Reingresar contraseña del usuario");
        jpPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpPass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpPass2FocusLost(evt);
            }
        });
        getContentPane().add(jpPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 200, -1));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_invertido_1024x720.png"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Mostrar lista de usuarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cerrar ventana");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDomicilioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDomicilioFocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_tfDomicilioFocusGained

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidosFocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_tfApellidosFocusGained

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_tfNombreFocusLost

    private void tfApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidosFocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_tfApellidosFocusLost

    private void tfDomicilioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDomicilioFocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_tfDomicilioFocusLost

    private void tfEstaturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEstaturaFocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_tfEstaturaFocusGained

    private void tfEstaturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEstaturaFocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_tfEstaturaFocusLost

    private void tfNacFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNacFocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_tfNacFocusGained

    private void tfNacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNacFocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_tfNacFocusLost

    private void tfCPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCPFocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_tfCPFocusGained

    private void tfCPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCPFocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_tfCPFocusLost

    private void tfCiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCiudadFocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_tfCiudadFocusGained

    private void tfCiudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCiudadFocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_tfCiudadFocusLost

    private void tfCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCiudadActionPerformed

    private void tfIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIDFocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_tfIDFocusGained

    private void tfIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIDFocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_tfIDFocusLost

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDActionPerformed

    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed
        try {
            // TODO add your handling code here:
            guardar();
            //this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(nuevoUsuarioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    private void jpPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPassFocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_jpPassFocusGained

    private void jpPass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPass2FocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_jpPass2FocusGained

    private void jpPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPassFocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_jpPassFocusLost

    private void jpPass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPass2FocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_jpPass2FocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            // TODO add your handling code here:
            guardar();
        } catch (SQLException ex) {
            Logger.getLogger(nuevoUsuarioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void tfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidosActionPerformed

    private void tfEstaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEstaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEstaturaActionPerformed

    private void tfCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPActionPerformed

    private void jpPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpPassActionPerformed

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
            java.util.logging.Logger.getLogger(nuevoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoUsuarioFrame().setVisible(true);
            }
        });
    }
    /**
     * guardar() recoje todos los datos que existan en el formulario, los analiza y si todos están correcto se guardan
     * @throws java.sql.SQLException
     */
    public void guardar() throws SQLException{
        System.out.println("Clic en guardar");
        if (funcion.comprobarEspaciosVacios(tfNombre.getText()) && funcion.comprobarEspaciosVacios(tfApellidos.getText()) && funcion.comprobarEspaciosVacios((String) cbSexo.getSelectedItem())
                && funcion.comprobarEspaciosVacios(tfNac.getText()) && funcion.comprobarEspaciosVacios(tfEstatura.getText()) && funcion.comprobarEspaciosVacios(tfDomicilio.getText())
                && funcion.comprobarEspaciosVacios(jpPass.getText()) && funcion.comprobarEspaciosVacios(jpPass2.getText()) && funcion.comprobarEspaciosVacios(tfID.getText())
                && funcion.comprobarEspaciosVacios(tfCiudad.getText()) && funcion.comprobarEspaciosVacios(tfCP.getText())) {
            //JOptionPane.showConfirmDialog(null, "¿Éstas seguro de guardar la información del usuario?");
            String nombre = tfNombre.getText(), apellidos = tfApellidos.getText(), sexo = (String) cbSexo.getSelectedItem(), fNac = tfNac.getText(), estatura = tfEstatura.getText(), domicilio = tfDomicilio.getText();
            String pass = jpPass.getText(), pass2 = jpPass2.getText(), id = tfID.getText(), ciudad = tfCiudad.getText(), cp = tfCP.getText();
            int estaturaEntero = 0;
            try {
                estaturaEntero = Integer.parseInt(estatura);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El campo estarura no puede contener caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
                tfEstatura.setText("");
            }
            //Validamos el campo de cófdigo postal
            if (funcion.tipoNumero(cp, 1)) {
                if (funcion.tipoString(nombre) && funcion.tipoString(apellidos)) {
                    System.out.println(nombre + apellidos);
                    if (funcion.tipoNumero(estatura, 2)) {
                        System.out.println(estatura);

                        if (estaturaEntero >= 10 && estaturaEntero <= 300) {
                            if (!sexo.equals("...")) {
                                System.out.println(sexo);
                                if (funcion.tipoDomicilio(domicilio)) {
                                    System.out.println(domicilio);
                                    if (funcion.tipoCiudad(ciudad)) {
                                        System.out.println(ciudad);
                                        if (funcion.tipoNumero(id, 3)) {
                                            if(!pass.equals(pass2)){
                                                JOptionPane.showMessageDialog(null, "Las contraseñas no son identicas, favor de revisar", "Error", JOptionPane.ERROR_MESSAGE);
                                                jpPass.setText("");
                                                jpPass2.setText("");
                                            }else{
                                                //El siguiente JOptionPane regresa 0 si la respuesta es afirmativa y 1 si la respuesta es negativa
                                                int resp = JOptionPane.showConfirmDialog(null, "¿Éstas seguro de guardar la información del usuario?", "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                                if (resp == 0) {
                                                    consultasMysql ingreso = new consultasMysql();
                                                    int b = 0;

                                                    ResultSet rsBU = ingreso.buscarUsuario(id);
                                                    while (rsBU.next()) {
                                                        if (rsBU.getString(1).equals(tfID.getText())) {
                                                            JOptionPane.showMessageDialog(null, "Error al guardar los datos, este ID ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                                                            b = 1;
                                                        }
                                                    }
                                                    if (b == 0) {
                                                        try {
                                                            if (ingreso.insertarNuevoUsuario(id, nombre, apellidos, sexo, fNac, domicilio, cp, ciudad, pass) == 0) {
                                                                JOptionPane.showMessageDialog(null, "Datos guardados exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                                                                this.dispose();
                                                            }
                                                        } catch (SQLException ex) {
                                                            JOptionPane.showMessageDialog(null, "Error al guardar los datos", "Error", JOptionPane.ERROR_MESSAGE);
                                                        }
                                                    }

                                                }
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "El campo ID debe contener 10 dígitos numéricos", "Error", JOptionPane.ERROR_MESSAGE);
                                            tfID.setText("");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El campos \'Ciudad\' no pueden tener caracteres especiales !\"$%&/()=?'¿¡*+", "Error", JOptionPane.ERROR_MESSAGE);
                                        tfCiudad.setText("");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El campos \'Domicilio\' no pueden tener caracteres especiales !\"$%&/()=?'¿¡*+", "Error", JOptionPane.ERROR_MESSAGE);
                                    tfDomicilio.setText("");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Es necesario seleccionar un sexo", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El valor ingresado en estatura no cumple con los valores permitidos", "Error", JOptionPane.ERROR_MESSAGE);
                            tfEstatura.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La estatura debe ser ingresada en \'centimetros\'", "Error", JOptionPane.ERROR_MESSAGE);
                        tfEstatura.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El campos \'Nombre\', \'Apellidos\' no pueden tener caracteres especiales !\"$%&/()=?'¿¡*-+", "Error", JOptionPane.ERROR_MESSAGE);
                    tfNombre.setText("");
                    tfApellidos.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo CP debe contener 5 dígitos numéricos", "Error", JOptionPane.ERROR_MESSAGE);
                tfCP.setText("");
            }

            //System.out.println(resp);
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos, favor de verificar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarUsuario;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPasswordField jpPass;
    private javax.swing.JPasswordField jpPass2;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCP;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelDomicilio;
    private javax.swing.JLabel labelEstatura;
    private javax.swing.JLabel labelFNac;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JLabel labelGuardarUsuario;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelPass2;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCP;
    private javax.swing.JTextField tfCiudad;
    private javax.swing.JTextField tfDomicilio;
    private javax.swing.JTextField tfEstatura;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNac;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
