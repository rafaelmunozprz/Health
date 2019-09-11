/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthfocus;

import javax.swing.ImageIcon;

/**
 *
 * @author Kevin
 */
public class accionesFrame extends javax.swing.JFrame {

    /**
     * Creates new form accionesFrame
     */
    public accionesFrame() {
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

        jMenu1 = new javax.swing.JMenu();
        btnNuevoUsuario = new javax.swing.JButton();
        labelPlusNuevoUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNuevoPaciente = new javax.swing.JButton();
        labelPlusNuevoPaciente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNuevaConsulta = new javax.swing.JButton();
        labelPlusNuevaConsulta = new javax.swing.JLabel();
        labelNuevaConsulta = new javax.swing.JLabel();
        labelConsultaConsulta = new javax.swing.JLabel();
        labelBody = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        miNuevoUsuario = new javax.swing.JMenuItem();
        miNuevoPaciente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administracion general");
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setPreferredSize(new java.awt.Dimension(1024, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/nutritionist_128px.png"))); // NOI18N
        btnNuevoUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoUsuario.setBorderPainted(false);
        btnNuevoUsuario.setContentAreaFilled(false);
        btnNuevoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoUsuario.setFocusPainted(false);
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        labelPlusNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_32px/plus_#64C99E_32px.png"))); // NOI18N
        labelPlusNuevoUsuario.setLabelFor(btnNuevoUsuario);
        labelPlusNuevoUsuario.setNextFocusableComponent(btnNuevoUsuario);
        getContentPane().add(labelPlusNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setText("Nuevo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setText("usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        btnNuevoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/newPacient_128px.png"))); // NOI18N
        btnNuevoPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoPaciente.setBorderPainted(false);
        btnNuevoPaciente.setContentAreaFilled(false);
        btnNuevoPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoPaciente.setFocusPainted(false);
        btnNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        labelPlusNuevoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_32px/plus_#64C99E_32px.png"))); // NOI18N
        getContentPane().add(labelPlusNuevoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setText("paciente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 335, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setText("Nuevo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        btnNuevaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/notepad_128px.png"))); // NOI18N
        btnNuevaConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevaConsulta.setBorderPainted(false);
        btnNuevaConsulta.setContentAreaFilled(false);
        btnNuevaConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaConsulta.setFocusPainted(false);
        btnNuevaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        labelPlusNuevaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_32px/plus_#64C99E_32px.png"))); // NOI18N
        labelPlusNuevaConsulta.setLabelFor(btnNuevoUsuario);
        labelPlusNuevaConsulta.setNextFocusableComponent(btnNuevoUsuario);
        getContentPane().add(labelPlusNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 475, -1, -1));

        labelNuevaConsulta.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        labelNuevaConsulta.setText("Nueva");
        getContentPane().add(labelNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 60, 30));

        labelConsultaConsulta.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        labelConsultaConsulta.setText("consulta");
        getContentPane().add(labelConsultaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 90, 60));

        labelBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_512px/acupuncture_512px.png"))); // NOI18N
        getContentPane().add(labelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_1024x720.png"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1110, 700));

        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        miNuevoUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miNuevoUsuario.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        miNuevoUsuario.setText("Nuevo usuario");
        miNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNuevoUsuarioActionPerformed(evt);
            }
        });
        menuArchivo.add(miNuevoUsuario);

        miNuevoPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miNuevoPaciente.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        miNuevoPaciente.setText("Nuevo paciente");
        menuArchivo.add(miNuevoPaciente);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jMenuItem1.setText("Nueva consulta");
        menuArchivo.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuArchivo.add(jMenuItem2);

        barraMenu.add(menuArchivo);

        menuEditar.setText("Editar");
        menuEditar.setFocusable(false);
        menuEditar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        barraMenu.add(menuEditar);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miNuevoUsuarioActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        // TODO add your handling code here:
        System.out.println("Clic en nuevo usuario");
        nuevoUsuarioFrame nuevoUsuario = new nuevoUsuarioFrame();
        nuevoUsuario.setVisible(true);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPacienteActionPerformed
        // TODO add your handling code here:
        nuevoPacienteFrame nuevoPaciente = new nuevoPacienteFrame();
        nuevoPaciente.setVisible(true);
    }//GEN-LAST:event_btnNuevoPacienteActionPerformed

    private void btnNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConsultaActionPerformed
        // TODO add your handling code here:
        nuevaConsultaFrame nuevaConsulta = new nuevaConsultaFrame();
        nuevaConsulta.setVisible(true);
    }//GEN-LAST:event_btnNuevaConsultaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(accionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accionesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnNuevaConsulta;
    private javax.swing.JButton btnNuevoPaciente;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel labelBody;
    private javax.swing.JLabel labelConsultaConsulta;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNuevaConsulta;
    private javax.swing.JLabel labelPlusNuevaConsulta;
    private javax.swing.JLabel labelPlusNuevoPaciente;
    private javax.swing.JLabel labelPlusNuevoUsuario;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem miNuevoPaciente;
    private javax.swing.JMenuItem miNuevoUsuario;
    // End of variables declaration//GEN-END:variables
}
