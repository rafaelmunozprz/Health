/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthfocus;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class nuevoPlanAlimenticioFrame extends javax.swing.JFrame {
    
    selectorTexto seleccionarTexto = new selectorTexto();
    funciones funcion = new funciones();
    consultasMysql cons = new consultasMysql();
    encriptacion encript = new encriptacion();
    public static String idUsuario, idPaciente;

    public static String getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(String idUsuario) {
        nuevoPlanAlimenticioFrame.idUsuario = idUsuario;
    }

    public static String getIdPaciente() {
        return idPaciente;
    }

    public static void setIdPaciente(String idPaciente) {
        nuevoPlanAlimenticioFrame.idPaciente = idPaciente;
    }
    
    /**
     * Creates new form nuevoPlanAlimenticioFrame
     */
    public nuevoPlanAlimenticioFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/icons/headerIcon.png")).getImage());
        accionesFrame af = new accionesFrame();
        idUsuario = af.getCodigoUsuario();
        System.out.println("Usuario nuevo plan: " + idUsuario);
        nuevaConsultaFrame ncf = new nuevaConsultaFrame();
        idPaciente = ncf.getNombre();
        System.out.println("Paciente nuevo plan: " + idPaciente);
        ResultSet rsDP = cons.cargarPacientePlan(idPaciente);
        
        ResultSet rdUC = cons.ultimaConsulta(Integer.parseInt(idPaciente));
        try {
            while(rsDP.next()){
                jlNombre.setText(rsDP.getString(3));
                jlApellidos.setText(rsDP.getString(4));
                jlFNac.setText(rsDP.getString(6));
                jlID.setText(rsDP.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(nuevaConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            while(rdUC.next()){
                jlPeso.setText(encript.desEncriptar(rdUC.getString(4)));
                jlGrasaXC.setText(encript.desEncriptar(rdUC.getString(6)));
                jlAguaXC.setText(encript.desEncriptar(rdUC.getString(8)));
                jlIMC.setText(encript.desEncriptar(rdUC.getString(5)));
                jlPesoGrasa.setText(encript.desEncriptar(rdUC.getString(7)));
                jlPesoAgua.setText(encript.desEncriptar(rdUC.getString(9)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(nuevoPlanAlimenticioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public boolean copyFile(String fromFile, String toFile){
        File origin = new File(fromFile);
        File destination = new File(toFile);
        if (origin.exists()) {
            try {
                InputStream in = new FileInputStream(origin);
                OutputStream out = new FileOutputStream(destination);
                // We use a buffer for the copy (Usamos un buffer para la copia).
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
                return true;
            } catch (IOException ioe) {
                ioe.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
    }
    private String levantarse = "";
    private String desayuno = "";
    private String comida = "";
    private String cena = "";
    private String colacionUno = "";
    private String colacionDos = "";
    private String colacionTres = "";
    private String recomendaciones = "";
    private String horaDesayuno = "";
    private String horaComida = "";
    private String horaCena = "";
    private String horaColacionUno = "";
    private String horaColacionDos = "";
    private String horaColacionTres = "";

    public String getLevantarse() {
        return levantarse;
    }

    public void setLevantarse(String levantarse) {
        this.levantarse = levantarse;
    }

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public String getColacionUno() {
        return colacionUno;
    }

    public void setColacionUno(String colacionUno) {
        this.colacionUno = colacionUno;
    }

    public String getColacionDos() {
        return colacionDos;
    }

    public void setColacionDos(String colacionDos) {
        this.colacionDos = colacionDos;
    }

    public String getColacionTres() {
        return colacionTres;
    }

    public void setColacionTres(String colacionTres) {
        this.colacionTres = colacionTres;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getHoraDesayuno() {
        return horaDesayuno;
    }

    public void setHoraDesayuno(String horaDesayuno) {
        this.horaDesayuno = horaDesayuno;
    }

    public String getHoraComida() {
        return horaComida;
    }

    public void setHoraComida(String horaComida) {
        this.horaComida = horaComida;
    }

    public String getHoraCena() {
        return horaCena;
    }

    public void setHoraCena(String horaCena) {
        this.horaCena = horaCena;
    }

    public String getHoraColacionUno() {
        return horaColacionUno;
    }

    public void setHoraColacionUno(String horaColacionUno) {
        this.horaColacionUno = horaColacionUno;
    }

    public String getHoraColacionDos() {
        return horaColacionDos;
    }

    public void setHoraColacionDos(String horaColacionDos) {
        this.horaColacionDos = horaColacionDos;
    }

    public String getHoraColacionTres() {
        return horaColacionTres;
    }

    public void setHoraColacionTres(String horaColacionTres) {
        this.horaColacionTres = horaColacionTres;
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
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlApellidos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlFNac = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlID = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taLevantarse = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDesayuno = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taComida = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taCena = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taColacionUno = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        taColacionDos = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        taColacionTres = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        taRecomendaciones = new javax.swing.JTextArea();
        jlPeso = new javax.swing.JLabel();
        jlIMC = new javax.swing.JLabel();
        jlGrasaXC = new javax.swing.JLabel();
        jlPesoGrasa = new javax.swing.JLabel();
        jlAguaXC = new javax.swing.JLabel();
        jlPesoAgua = new javax.swing.JLabel();
        btnNuevaConsulta = new javax.swing.JButton();
        cbHoraDesayuno = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        cbMinutoDesayuno = new javax.swing.JComboBox<>();
        cbMinutoComida = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        cbHoraComida = new javax.swing.JComboBox<>();
        cbHoraCena = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        cbMinutoCena = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        cbMinutoColUno = new javax.swing.JComboBox<>();
        cbHoraColUno = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        cbHoraColDos = new javax.swing.JComboBox<>();
        cbMinutoColDos = new javax.swing.JComboBox<>();
        cbMinutoColTres = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        cbHoraColTres = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 217, 234));
        jLabel3.setText("Nombre: ");

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 217, 234));
        jLabel20.setText("name");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 217, 234));
        jLabel9.setText("Apellidos:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 217, 234));
        jLabel10.setText("lastname");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 217, 234));
        jLabel11.setText("Edad: ");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 217, 234));
        jLabel12.setText("age");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 217, 234));
        jLabel13.setText("ID:");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 217, 234));
        jLabel14.setText("id");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HF - Menú de alimentos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 217, 234));
        jLabel1.setText("Nombre: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jlNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlNombre.setText("Leonardo");
        getContentPane().add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 217, 234));
        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 11, -1, -1));

        jlApellidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlApellidos.setText("Vazquez Angulo");
        getContentPane().add(jlApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 217, 234));
        jLabel5.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jlFNac.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlFNac.setText("22");
        getContentPane().add(jlFNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 217, 234));
        jLabel7.setText("ID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        jlID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlID.setText("2356891473");
        getContentPane().add(jlID, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 217, 234));
        jLabel15.setText("Peso:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 217, 234));
        jLabel16.setText("IMC:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 217, 234));
        jLabel17.setText("% de grasa corporal:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 217, 234));
        jLabel18.setText("Peso de grasa corporal:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 87, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 217, 234));
        jLabel21.setText("% de agua corporal:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 217, 234));
        jLabel22.setText("Peso de agua corporal:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 217, 234));
        jLabel23.setText("Al levantarse");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        taLevantarse.setColumns(20);
        taLevantarse.setRows(5);
        taLevantarse.setText("Vaso de agua mas una fruta");
        jScrollPane1.setViewportView(taLevantarse);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, 304, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 217, 234));
        jLabel24.setText("Desayuno:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, -1, -1));

        taDesayuno.setColumns(20);
        taDesayuno.setRows(5);
        taDesayuno.setText("Huevos mas frijoles\nmas  2 tazas de verdura fresca");
        jScrollPane2.setViewportView(taDesayuno);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 291, 304, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 217, 234));
        jLabel25.setText("Comida:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 405, -1, -1));

        taComida.setColumns(20);
        taComida.setRows(5);
        taComida.setText("300 gramos de carne de pollo\n1 taza de frijol\n1 litro de agua natural");
        jScrollPane3.setViewportView(taComida);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 431, 304, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 217, 234));
        jLabel26.setText("Cena:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 545, -1, -1));

        taCena.setColumns(20);
        taCena.setRows(5);
        taCena.setText("1 vaso de leche\n3 tacos de frijol");
        jScrollPane4.setViewportView(taCena);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 571, 304, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 217, 234));
        jLabel27.setText("Colación 1:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 125, -1, -1));

        taColacionUno.setColumns(20);
        taColacionUno.setRows(5);
        taColacionUno.setText("2 naranjas");
        jScrollPane5.setViewportView(taColacionUno);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 151, 304, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 217, 234));
        jLabel28.setText("Colación 2:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 265, -1, -1));

        taColacionDos.setColumns(20);
        taColacionDos.setRows(5);
        taColacionDos.setText("1 platano mas una gelatina");
        jScrollPane6.setViewportView(taColacionDos);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 291, 304, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Colación 3:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 405, -1, -1));

        taColacionTres.setColumns(20);
        taColacionTres.setRows(5);
        taColacionTres.setText("15 cacahuates\n1 pepino sin cascara");
        jScrollPane7.setViewportView(taColacionTres);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 431, 304, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Recomendaciones:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 545, -1, -1));

        taRecomendaciones.setColumns(20);
        taRecomendaciones.setRows(5);
        taRecomendaciones.setText("Dos vasos de agua en cada comida\nEjersicio por 30 minutos");
        jScrollPane8.setViewportView(taRecomendaciones);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 571, 304, -1));

        jlPeso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPeso.setText("85 kg");
        getContentPane().add(jlPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 49, -1, -1));

        jlIMC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlIMC.setText("27.75");
        getContentPane().add(jlIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 87, -1, -1));

        jlGrasaXC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlGrasaXC.setText("26 %");
        getContentPane().add(jlGrasaXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jlPesoGrasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPesoGrasa.setText("21 kg");
        getContentPane().add(jlPesoGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 87, -1, -1));

        jlAguaXC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAguaXC.setText("56 %");
        getContentPane().add(jlAguaXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));

        jlPesoAgua.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPesoAgua.setText("65 kg");
        getContentPane().add(jlPesoAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

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
        getContentPane().add(btnNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, -1));

        cbHoraDesayuno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraDesayuno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbHoraDesayuno.setSelectedIndex(9);
        cbHoraDesayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHoraDesayunoActionPerformed(evt);
            }
        });
        getContentPane().add(cbHoraDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel38.setText(":");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        cbMinutoDesayuno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoDesayuno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cbMinutoDesayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinutoDesayunoActionPerformed(evt);
            }
        });
        getContentPane().add(cbMinutoDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        cbMinutoComida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cbMinutoComida.setSelectedIndex(15);
        cbMinutoComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinutoComidaActionPerformed(evt);
            }
        });
        getContentPane().add(cbMinutoComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel39.setText(":");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        cbHoraComida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbHoraComida.setSelectedIndex(14);
        getContentPane().add(cbHoraComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        cbHoraCena.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraCena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbHoraCena.setSelectedIndex(21);
        getContentPane().add(cbHoraCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel40.setText(":");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        cbMinutoCena.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoCena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cbMinutoCena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinutoCenaActionPerformed(evt);
            }
        });
        getContentPane().add(cbMinutoCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel41.setText(":");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        cbMinutoColUno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoColUno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cbMinutoColUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinutoColUnoActionPerformed(evt);
            }
        });
        getContentPane().add(cbMinutoColUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        cbHoraColUno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraColUno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbHoraColUno.setSelectedIndex(12);
        getContentPane().add(cbHoraColUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel42.setText(":");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        cbHoraColDos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraColDos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbHoraColDos.setSelectedIndex(17);
        getContentPane().add(cbHoraColDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        cbMinutoColDos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoColDos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cbMinutoColDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinutoColDosActionPerformed(evt);
            }
        });
        getContentPane().add(cbMinutoColDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        cbMinutoColTres.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoColTres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cbMinutoColTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinutoColTresActionPerformed(evt);
            }
        });
        getContentPane().add(cbMinutoColTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel43.setText(":");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        cbHoraColTres.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraColTres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbHoraColTres.setSelectedIndex(19);
        getContentPane().add(cbHoraColTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_invertido_1024x720.png"))); // NOI18N
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConsultaActionPerformed
        // TODO add your handling code here:
        int bandera = 0;
        /**
         * Levantarse
         */
        if(!taLevantarse.getText().equals("")){
            if(funcion.tipoString(taLevantarse.getText())){
                setLevantarse(taLevantarse.getText());
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null,"No se pueden ingresar caracteres espciales en el campo Levantarse","Error", JOptionPane.ERROR_MESSAGE);
                taLevantarse.setText("");
            }
        }else{
            setLevantarse("Sin alimentos");
        }
        /**
         * Desayuno
         */
        if(!taDesayuno.getText().equals("")){
            if(funcion.tipoString(taDesayuno.getText())){
                setDesayuno(taDesayuno.getText());
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null,"No se pueden ingresar caracteres espciales en el campo Desayuno","Error", JOptionPane.ERROR_MESSAGE);
                taDesayuno.setText("");
            }
        }else{
            setLevantarse("Sin alimentos");
        }
        /**
         * Cena
         */
        if(!taCena.getText().equals("")){
            if(funcion.tipoString(taCena.getText())){
                setCena(taCena.getText());
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null,"No se pueden ingresar caracteres espciales en el campo Cena","Error", JOptionPane.ERROR_MESSAGE);
                taCena.setText("");
            }
        }else{
            setLevantarse("Sin alimentos");
        }
        /**
         * Colacion uno
         */
        if(!taColacionUno.getText().equals("")){
            if(funcion.tipoString(taColacionUno.getText())){
                setColacionUno(taColacionUno.getText());
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null,"No se pueden ingresar caracteres espciales en el campo Colación Uno","Error", JOptionPane.ERROR_MESSAGE);
                taColacionUno.setText("");
            }
        }else{
            setLevantarse("Sin alimentos");
        }
        /**
         * Colacion Dos
         */
        if(!taColacionDos.getText().equals("")){
            if(funcion.tipoString(taColacionDos.getText())){
                setColacionDos(taColacionDos.getText());
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null,"No se pueden ingresar caracteres espciales en el campo Colación Dos","Error", JOptionPane.ERROR_MESSAGE);
                taColacionDos.setText("");
            }
        }else{
            setLevantarse("Sin alimentos");
        }
        /**
         * Colación tres
         */
        if(!taColacionTres.getText().equals("")){
            if(funcion.tipoString(taColacionTres.getText())){
                setColacionDos(taColacionTres.getText());
            }else{
                bandera = bandera + 1;
                JOptionPane.showMessageDialog(null,"No se pueden ingresar caracteres espciales en el campo Colación Tres","Error", JOptionPane.ERROR_MESSAGE);
                taColacionTres.setText("");
            }
        }else{
            setLevantarse("Sin alimentos");
        }
        
        
        
        
        /**
         * Hora desayuno
         */
        String hDesayuno = (String) cbHoraDesayuno.getSelectedItem();
        String mDesayuno = (String) cbMinutoDesayuno.getSelectedItem();
        String horaFinalDesayuno = hDesayuno+mDesayuno;
        int horaFinalDesayunoNum = Integer.parseInt(horaFinalDesayuno);
        System.out.println(horaFinalDesayuno);
        /**
         * Hora comida
         */
        String hComida = (String) cbHoraComida.getSelectedItem();
        String mComida = (String) cbMinutoComida.getSelectedItem();
        String horaFinalComida = hComida+mComida;
        int horaFinalComidaNum = Integer.parseInt(horaFinalComida);
        System.out.println(horaFinalComidaNum);
        /**
         * Hora Cena
         */
        String hCena = (String) cbHoraCena.getSelectedItem();
        String mCena = (String) cbMinutoCena.getSelectedItem();
        String horaFinalCena = hCena+mCena;
        int horaFinalCenaNum = Integer.parseInt(horaFinalCena);
        System.out.println(horaFinalCenaNum);
        if(horaFinalComidaNum>horaFinalDesayunoNum&&horaFinalCenaNum>horaFinalComidaNum){
            setDesayuno(horaFinalDesayuno);
            setComida(horaFinalComida);
            setCena(horaFinalCena);
        }else{
            bandera = bandera + 1;
            JOptionPane.showMessageDialog(null,"Conflicto de horarios favor de revisar","Error", JOptionPane.ERROR_MESSAGE);
        }
        
        /**
         * Colaciones uno
         */
        String hColUno = (String) cbHoraColUno.getSelectedItem();
        String mColUno = (String) cbMinutoColUno.getSelectedItem();
        String horaFinalColUno = hColUno+mColUno;
        int horaFinalColUnoNum = Integer.parseInt(horaFinalColUno);
        System.out.println(horaFinalColUnoNum);
        /**
         * Colacion dos
         */
        String hColDos = (String) cbHoraColDos.getSelectedItem();
        String mColDos = (String) cbMinutoColDos.getSelectedItem();
        String horaFinalColDos = hColDos+mColDos;
        int horaFinalColDosNum = Integer.parseInt(horaFinalColDos);
        System.out.println(horaFinalColDosNum);
        /**
         * Colacion tres
         */
        String hColTres = (String) cbHoraColTres.getSelectedItem();
        String mColTres = (String) cbMinutoColTres.getSelectedItem();
        String horaFinalColTres = hColTres+mColTres;
        int horaFinalColTresNum = Integer.parseInt(horaFinalColTres);
        System.out.println(horaFinalColTresNum);
        
        if(horaFinalColDosNum>horaFinalColUnoNum && horaFinalColTresNum>horaFinalColDosNum){
            setHoraColacionUno(horaFinalColUno);
            setHoraColacionDos(horaFinalColDos);
            setHoraColacionTres(horaFinalColTres);
        }else{
            bandera = bandera + 1;
            JOptionPane.showMessageDialog(null,"Conflicto de horarios favor de revisar","Error", JOptionPane.ERROR_MESSAGE);
        }
        if(bandera == 0){
            int respvag = JOptionPane.showConfirmDialog(null, "¿Éstas seguro de guardar el plan de alimentos", "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(respvag==0){
                try {
                    cons.guardarPlan(Integer.parseInt(idUsuario), Integer.parseInt(idPaciente), encript.encriptarPlan(getLevantarse()), encript.encriptarPlan(getDesayuno()), encript.encriptarPlan(getComida()), encript.encriptarPlan(getCena()), encript.encriptarPlan(getColacionUno()), 
                            encript.encriptarPlan(getColacionDos()), encript.encriptarPlan(getColacionTres()), encript.encriptarPlan(getRecomendaciones()), encript.encriptar(getHoraDesayuno()), encript.encriptar(getHoraComida()), 
                            encript.encriptar(getHoraCena()), encript.encriptar(getHoraColacionUno()), encript.encriptar(getHoraColacionDos()), encript.encriptar(getHoraColacionTres()));
                    JFileChooser dlg=new JFileChooser();
                    int option = dlg.showSaveDialog(this);
                    if(option == JFileChooser.APPROVE_OPTION){
                        File f = dlg.getSelectedFile();
                        f.toString();
                        System.out.println(f);
                        String ruta = f.toString();
                        String contenido =  "Datos del paciente\n Nombre: "+jlNombre.getText()+" Apellidos: "+jlApellidos.getText()+" \nFecha nacimiento: "+jlFNac.getText()+" \nID: "+jlID.getText()+"\n Peso: "+jlPeso.getText()+
                                            " Kg\nPorcentaje de grasa: "+jlGrasaXC.getText()+"\nPorcentaje de Agua corporal: "+jlAguaXC.getText()+" \nIMC: "+jlIMC.getText()+" \nPeso grasa: "+jlPesoGrasa.getText()+" \nPeso agua: "+jlPesoAgua.getText()+" \n"+
                                            "\n\nAl levantarse: " + taLevantarse.getText() + "\n\nHora Desayuno: "+hDesayuno+":"+mDesayuno+" horas\nDesayuno: " + taDesayuno.getText() + "\n\n"
                                            + "Hora colación uno: "+hColUno+":"+mColUno+" horas \nColacion Uno: "+taColacionUno.getText()+"\n\nHora comida: "+hComida+":"+mComida+" horas\nComida: "+taComida.getText()+"\n\nHora colación dos: "+hColDos+":"+mColDos+" horas\n"
                                            + "Colacion Dos: "+taColacionDos.getText()+"\n\nHora cena: "+hCena+":"+mCena+" horas\nCena: "+taCena.getText();
                        nuevoPlanAlimenticioFrame javaIOUtils = new nuevoPlanAlimenticioFrame();
                        String[] imc = jlIMC.getText().split(" ");
                        System.out.println(imc[0]);
                        String fromFile="";
                        String toFile="";
                        if(Double.valueOf(imc[0])<=20){
                            fromFile = "C:\\Users\\Rafael\\Documents\\NetBeansProjects\\HealthFocus\\desnutricion.pdf";
                            toFile = "C:\\Users\\Rafael\\Documents\\desnutricion.pdf";
                        }else if(Double.valueOf(imc[0])>=20&&Double.valueOf(imc[0])<=25){
                             fromFile = "C:\\Users\\Rafael\\Documents\\NetBeansProjects\\HealthFocus\\normopeso.pdf";
                             toFile = "C:\\Users\\Rafael\\Documents\\normopeso.pdf";
                        }else{
                             fromFile = "C:\\Users\\Rafael\\Documents\\NetBeansProjects\\HealthFocus\\sobrepeso.pdf";
                             toFile = "C:\\Users\\Rafael\\Documents\\sobrepeso.pdf";
                        }                        
                        boolean result = javaIOUtils.copyFile(fromFile, toFile);
                        System.out.println(result
                                ? "Success! File copying (Éxito! Fichero copiado)"
                                : "Error! Failed to copy the file (Error! No se ha podido copiar el fichero)");
                        /*try {
                            FileOutputStream archivo = new FileOutputStream(f+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();
                            doc.add(new Paragraph(contenido));
                            doc.close();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(nuevoPlanAlimenticioFrame.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (DocumentException ex) {
                            Logger.getLogger(nuevoPlanAlimenticioFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }*/
                        generarPDF g = new generarPDF();
                        g.generarPDF("Health Focus", contenido, "Health Focus", "C:\\Users\\Rafael\\Documents\\NetBeansProjects\\HealthFocus\\headerIcon.png", ruta+".pdf");
                        this.dispose();
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(nuevoPlanAlimenticioFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Existen campos sin seleccionar, favor de verificar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNuevaConsultaActionPerformed

    private void cbMinutoDesayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinutoDesayunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMinutoDesayunoActionPerformed

    private void cbMinutoComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinutoComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMinutoComidaActionPerformed

    private void cbMinutoCenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinutoCenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMinutoCenaActionPerformed

    private void cbMinutoColUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinutoColUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMinutoColUnoActionPerformed

    private void cbMinutoColDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinutoColDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMinutoColDosActionPerformed

    private void cbMinutoColTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinutoColTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMinutoColTresActionPerformed

    private void cbHoraDesayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHoraDesayunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHoraDesayunoActionPerformed

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
            java.util.logging.Logger.getLogger(nuevoPlanAlimenticioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoPlanAlimenticioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoPlanAlimenticioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoPlanAlimenticioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoPlanAlimenticioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaConsulta;
    private javax.swing.JComboBox<String> cbHoraCena;
    private javax.swing.JComboBox<String> cbHoraColDos;
    private javax.swing.JComboBox<String> cbHoraColTres;
    private javax.swing.JComboBox<String> cbHoraColUno;
    private javax.swing.JComboBox<String> cbHoraComida;
    private javax.swing.JComboBox<String> cbHoraDesayuno;
    private javax.swing.JComboBox<String> cbMinutoCena;
    private javax.swing.JComboBox<String> cbMinutoColDos;
    private javax.swing.JComboBox<String> cbMinutoColTres;
    private javax.swing.JComboBox<String> cbMinutoColUno;
    private javax.swing.JComboBox<String> cbMinutoComida;
    private javax.swing.JComboBox<String> cbMinutoDesayuno;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel jlAguaXC;
    private javax.swing.JLabel jlApellidos;
    private javax.swing.JLabel jlFNac;
    private javax.swing.JLabel jlGrasaXC;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlIMC;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPeso;
    private javax.swing.JLabel jlPesoAgua;
    private javax.swing.JLabel jlPesoGrasa;
    private javax.swing.JTextArea taCena;
    private javax.swing.JTextArea taColacionDos;
    private javax.swing.JTextArea taColacionTres;
    private javax.swing.JTextArea taColacionUno;
    private javax.swing.JTextArea taComida;
    private javax.swing.JTextArea taDesayuno;
    private javax.swing.JTextArea taLevantarse;
    private javax.swing.JTextArea taRecomendaciones;
    // End of variables declaration//GEN-END:variables
}
