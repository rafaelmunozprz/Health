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
public class nuevaConsulta extends javax.swing.JFrame {
    
    String idUsuario="", idPaciente="";
    consultasMysql consultas = new consultasMysql();
    funciones funcion=new funciones();
    encriptacion encript=new encriptacion();
    /**
     * Creates new form nuevaConsulta
     */
    public nuevaConsulta() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/icons/headerIcon.png")).getImage());
        
        //idPaciente= nfc.nombre;
        accionesFrame af = new accionesFrame();
        nuevaConsultaFrame nfc=new nuevaConsultaFrame();
        idPaciente = nuevaConsultaFrame.nombre;
        idUsuario = af.getCodigoUsuario();
        System.out.println("Código usuario nueva consulta: " + idUsuario);
        System.out.println("Código paciente nueva consulta: " + idPaciente);
        ResultSet rsDP = consultas.cargarPacientePlan(idPaciente);
        try {
            while(rsDP.next()){
                jLabel19.setText(rsDP.getString(3));
                jLabel4.setText(rsDP.getString(4));
                jLabel6.setText(rsDP.getString(6));
                jLabel8.setText(rsDP.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(nuevaConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }
    public static String peso, imc, grasaXC, pesoGrasa, aguaXC, pesoAgua;

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    public String getGrasaXC() {
        return grasaXC;
    }

    public void setGrasaXC(String grasaXC) {
        this.grasaXC = grasaXC;
    }

    public String getPesoGrasa() {
        return pesoGrasa;
    }

    public void setPesoGrasa(String pesoGrasa) {
        this.pesoGrasa = pesoGrasa;
    }

    public String getAguaXC() {
        return aguaXC;
    }

    public void setAguaXC(String aguaXC) {
        this.aguaXC = aguaXC;
    }

    public String getPesoAgua() {
        return pesoAgua;
    }

    public void setPesoAgua(String pesoAgua) {
        this.pesoAgua = pesoAgua;
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfGrasa = new javax.swing.JTextField();
        tfAguaXC = new javax.swing.JTextField();
        tfAgua = new javax.swing.JTextField();
        tfGrasaXC = new javax.swing.JTextField();
        tfIMC = new javax.swing.JTextField();
        tfPeso = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnNuevaConsulta = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setPreferredSize(new java.awt.Dimension(1024, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Nombre: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mantente Saludable");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("lastname");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Fecha nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("ID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("id");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Peso:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("% de grasa corporal:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("IMC:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("Peso de grasa corporal:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("% de agua corporal:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setText("Peso de agua corporal:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        tfGrasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfGrasa.setText("27");
        getContentPane().add(tfGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 205, -1));

        tfAguaXC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfAguaXC.setText("64");
        getContentPane().add(tfAguaXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 205, -1));

        tfAgua.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfAgua.setText("54");
        getContentPane().add(tfAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 205, -1));

        tfGrasaXC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfGrasaXC.setText("28.3");
        getContentPane().add(tfGrasaXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 205, -1));

        tfIMC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfIMC.setText("26.9");
        getContentPane().add(tfIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 205, -1));

        tfPeso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfPeso.setText("90");
        tfPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesoActionPerformed(evt);
            }
        });
        getContentPane().add(tfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 205, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_64px/forward_64px.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_256px/trainer_woman.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_256px/trainer_man.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setText("name");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 11, -1, -1));

        btnNuevaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/save_128px.png"))); // NOI18N
        btnNuevaConsulta.setToolTipText("Guardar y pasar al plan de alimentos");
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
        getContentPane().add(btnNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_invertido_1024x720.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesoActionPerformed

    private void btnNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConsultaActionPerformed
        // TODO add your handling code here:
        /**
         * Peso
         */
        int bandera = 0;
        if(!tfPeso.getText().equals("")){
            if(funcion.tipoString(tfPeso.getText())){
                setPeso(tfPeso.getText());
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null, "Es espacio peso no admite caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
                tfPeso.setText("");
            }
        }else{
            bandera = bandera + 1;
            JOptionPane.showMessageDialog(null, "Es necesario ingresar el peso", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * imc
         */
        if(!tfIMC.getText().equals("")){
            if(funcion.tipoString(tfIMC.getText())){
                setImc(tfIMC.getText()+ " Kg/m^2");
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null, "Es espacio IMC no admite caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
                tfIMC.setText("");
            }
        }else{
            bandera = bandera + 1;
            JOptionPane.showMessageDialog(null, "Es necesario ingresar el IMC", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * grasa %
         */
        if(!tfGrasaXC.getText().equals("")){
            if(funcion.tipoString(tfGrasaXC.getText())){
                setGrasaXC(tfGrasaXC.getText()+ " %");
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null, "Es espacio Grasa % no admite caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
                tfGrasaXC.setText("");
            }
        }else{
            bandera = bandera + 1;
            JOptionPane.showMessageDialog(null, "Es necesario ingresar el % de Grasa", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * grasa peso
         */
        if(!tfGrasa.getText().equals("")){
            if(funcion.tipoString(tfGrasa.getText())){
                setPesoGrasa(tfGrasa.getText()+ " Kg");
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null, "Es espacio Grasa  no admite caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
                tfGrasa.setText("");
            }
        }else{
            bandera = bandera + 1;
            JOptionPane.showMessageDialog(null, "Es necesario ingresar el peso de la Grasa", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Agua %
         */
        if(!tfAguaXC.getText().equals("")){
            if(funcion.tipoString(tfAguaXC.getText())){
                setAguaXC(tfAguaXC.getText()+ " %");
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null, "Es espacio % de Agua  no admite caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
                tfAguaXC.setText("");
            }
        }else{
            bandera = bandera + 1;
            JOptionPane.showMessageDialog(null, "Es necesario ingresar el % de Agua", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Agua peso
         */
        if(!tfAgua.getText().equals("")){
            if(funcion.tipoString(tfAgua.getText())){
                setPesoAgua(tfAgua.getText()+ " Kg");
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null, "Es espacio  Agua  no admite caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
                tfAgua.setText("");
            }
        }else{
            bandera = bandera + 1;
            JOptionPane.showMessageDialog(null, "Es necesario ingresar el peso de Agua", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(bandera == 0){
            int resp = JOptionPane.showConfirmDialog(null, "¿Éstas seguro de guardar la información de la consulta?", "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(resp == 0){
                
                try {
                    consultas.insertarConsulta(Integer.parseInt(getIdUsuario()), Integer.parseInt(getIdPaciente()), encript.encriptar(getPeso()), encript.encriptar(getImc()), encript.encriptar(getGrasaXC()), encript.encriptar(getPesoGrasa()), 
                            encript.encriptar(getAguaXC()), encript.encriptar(getPesoAgua()));
                } catch (SQLException ex) {
                    Logger.getLogger(nuevaConsulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Hay valores no validos en los campos favor de corregir", "Error", JOptionPane.ERROR_MESSAGE);
        }
        nuevoPlanAlimenticioFrame npaf=new nuevoPlanAlimenticioFrame();
        npaf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNuevaConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(nuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfAgua;
    private javax.swing.JTextField tfAguaXC;
    private javax.swing.JTextField tfGrasa;
    private javax.swing.JTextField tfGrasaXC;
    private javax.swing.JTextField tfIMC;
    private javax.swing.JTextField tfPeso;
    // End of variables declaration//GEN-END:variables
}
