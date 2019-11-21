/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthfocus;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin
 */
public class consultasMysql {
    String[] dato = new String[4];
    public int guardarPlan(int idPersona,int idPaciente,String levantarse,String desayuno,String comida,String cena,String colacionUno,String colacionDos, String colacionTres,String recomendaciones, 
                            String horaDesayuno,String horaComida,String horaCena,String horaColacionUno,String horaColacionDos,String horaColacionTres) throws SQLException{
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        try {
            st.executeUpdate("INSERT INTO planesalimenticios ( idPersona, idPaciente, levantarse, desayuno, comida, cena, colacionUno, colacionDos,  colacionTres, recomendaciones," +
"                             horaDesayuno, horaComida, horaCena, horaColacionUno, horaColacionDos, horaColacionTres) VALUES ("+idPersona+","+idPaciente+",\""+levantarse+"\",\""+desayuno+"\",\""+comida+"\",\""+cena+"\""
                            + ",\""+colacionUno+"\",\""+colacionDos+"\",\""+colacionTres+"\",\""+recomendaciones+"\",\""+horaDesayuno+"\",\""+horaComida+"\",\""+horaCena+"\",\""+horaColacionUno+"\",\""+horaColacionDos+"\",\""+horaColacionTres+"\")");
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        int contador = 0;
        
        return contador;
    }
    public ResultSet buscarUsuario(String id){    
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM datospersonales WHERE idPersona = "+id+"";
        Statement st;
        ResultSet resultado = null ;
        try {
            st = conexion.getConnection().createStatement();
            resultado = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    
    }
    public int insertarNuevoUsuario(    String id       , String nombre,    String apellidos,   String sexo,    String fechaNacimiento,     String domicilio,   String cp,
                                        String ciudad   ,  String contrasena) throws SQLException {
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        Date fnac = Date.valueOf(fechaNacimiento);
        try {
            st.executeUpdate("INSERT INTO datospersonales (idPersona, codigo, nombre, apellidos, sexo, fechaNacimiento, domicilio, cp, ciudad, rol, contrasena) "
                    +"VALUES ("+id+","+id+", \""+nombre+"\", \""+apellidos+"\", '"+sexo+"', '"+fnac+"', '"+domicilio+"', "+cp+", '"+ciudad+"', 'nutriologo', '"+contrasena+"')");
            return contador;
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
            return contador;
        }        
    }
    public int insertarNuevoPaciente(String dpID, String nombre, String apellidos, String sexo, String nac, String edad,String domicilio, String cp, String ciudad, String escolaridad, String estadoC, String telefono, String email, String cNutri) throws SQLException{
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        try {
            st.executeUpdate("INSERT INTO datospersonales (idPersona, codigo, nombre, apellidos, sexo, fechaNacimiento, domicilio, cp, ciudad, roll ,idNutriologo) "
                    +"VALUES ("+dpID+","+dpID+", '"+nombre+"', '"+apellidos+"', '"+sexo+"', \""+nac+"\", \""+domicilio+"\", "+cp+", \""+ciudad+"\",  'paciente',"+cNutri+")");
            return contador;
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
            return contador;
        }    
    }
    public int ingresoUsuario(String usuario, String pass) throws SQLException{
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM usuarios WHERE idUsuario="+usuario;
        // create the java statement
        Statement st = conexion.getConnection().createStatement();
        ResultSet rs = st.executeQuery(query);
        if(rs != null){
            while (rs.next()){
                int id = rs.getInt("idUsuario");
                System.out.format("%s\n", id);
                contador++;
            }
            return contador;
        }else{
            return contador;
        }
        
    }
    public int antecedentes(String diarrea, String estrenimiento, String gastritis, String ulceras, String nauseas, String pirosis, String vomitos, String colitis, String dentadura, String otrosAntecedentes,
            String observacionesAntecedentes, String enfermedadDiagnosticada, String cualDiagnosticada, String enfermedadImportante, String cualImportante, String medicamento, String cualMedicamento,
            String dosisMedicamento, String tiempoMedicamento, String laxantes, String diureticos, String antiacidos, String analgesicos, String cirugia, String cualCirugia, int idPersona, int idPaciente) throws SQLException {

        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();

        try {
            st.executeUpdate("INSERT INTO antecedentes ( diarrea, estrenimiento, gastritis, ulceras, nauseas, pirosis, vomitos, colitis, dentadura, otrosAntecedentes, "
                    + "observacionesAntecedentes, enfermedadDiagnosticada, cualDiagnosticada, enfermedadImportante, cualImportante, medicamento, cualMedicamento, "
                    + "dosisMedicamento, tiempoMedicamento, laxantes, diureticos, antiacidos, analgesicos, cirugia, cualCirugia,  idPersona, idPaciente) VALUES (\"" + diarrea + "\",\"" + estrenimiento + "\",\"" + gastritis + "\",\"" + ulceras + "\""
                    + ",\"" + nauseas + "\",\"" + pirosis + "\",\"" + vomitos + "\",\"" + colitis + "\",\"" + dentadura + "\",\"" + otrosAntecedentes + "\",\"" + observacionesAntecedentes + "\",\"" + enfermedadDiagnosticada + "\",\"" + cualDiagnosticada + "\""
                    + ",\"" + enfermedadImportante + "\",\"" + cualImportante + "\",\"" + medicamento + "\",\"" + cualMedicamento + "\",\"" + dosisMedicamento + "\",\"" + tiempoMedicamento + "\",\"" + laxantes + "\",\"" + diureticos + "\",\"" + antiacidos + "\""
                    + ",\"" + analgesicos + "\",\"" + cirugia + "\",\"" + cualCirugia + "\"," + idPersona + "," + idPaciente + ")");
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contador;
    }
    public int aspectosGinecologicos(int idPersona,int idPaciente,String embarazoActual,String semanasGestacion,String anticonceptivosOrales,String cualAnticonceptivo,String dosisAnticonceptivo, 
            String tiempoAnticonceptivo,String climaterio,String terapiaHormonal,String cualTerapia,String dosisTerapia,String tiempoTerapia) throws SQLException{
        int contador = 0;
        conexionMysql conexion=new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        try {
            st.executeUpdate("  INSERT INTO aspectosginecologicos ( idPersona, idPaciente, embarazoActual, semanasGestacion, anticonceptivosOrales, cualAnticonceptivo, dosisAnticonceptivo," +
                                "tiempoAnticonceptivo, climaterio, terapiaHormonal, cualTerapia, dosisTerapia, tiempoTerapia) VALUES ("+idPersona+","+idPaciente+", \""+embarazoActual+"\" , \""+semanasGestacion+"\" , \""+anticonceptivosOrales+"\" "
                              + ", \""+cualAnticonceptivo+"\" , \""+dosisAnticonceptivo+"\" , \""+tiempoAnticonceptivo+"\" , \""+climaterio+"\" , \""+terapiaHormonal+"\" , \""+cualTerapia+"\" , \""+dosisTerapia+"\" , \""+tiempoTerapia+"\" )");
            return contador;
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contador;
    }
    public int diarioActvidades(int idPersona,int idPaciente,String horaDespertarse,String horaDesayuno,String horaComida,String horaCena, String horaDormir, String aspectoGeneral,String tipoEjercicio,String duracionEjercicio,String frecuenciaEjercicio, 
                                   String tabaco,String cafe,String alcohol,String presionArterial,String cualPresion,String horaPresion,String comidaDespertarse,String comidaDesayuno,String comidaComida,String comidaCena,String comidaDormir) throws SQLException{
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        try {
            st.executeUpdate("INSERT INTO diarioactividades (idPersona,idPaciente,horaDespertarse,horaDesayuno, horaComida, horaCena,  horaDormir,  aspectoGeneral, tipoEjercicio, duracionEjercicio, frecuenciaEjercicio," +
"                                    tabaco, cafe, alcohol, presionArterial, cualPresion, horaPresion, comidaDespertarse, comidaDesayuno, comidaComida, comidaCena, comidaDormir) VALUES ("+idPersona+","+idPaciente+",'"+horaDespertarse+"','"+horaDesayuno+"'"
                                    + ",'"+horaComida+"','"+horaCena+"','"+horaDormir+"',\""+aspectoGeneral+"\",\""+tipoEjercicio+"\",\""+duracionEjercicio+"\",\""+frecuenciaEjercicio+"\",\""+tabaco+"\",\""+cafe+"\",\""+alcohol+"\",\""+presionArterial+"\","
                                    + "\""+cualPresion+"\",\""+horaPresion+"\",\""+comidaDespertarse+"\",\""+comidaDesayuno+"\",\""+comidaComida+"\",\""+comidaCena+"\",\""+comidaDormir+"\")");
            return contador;
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
            return contador;
        }
    }
    public int insertarConsulta(int idPersona,int idPaciente,String peso,String imc,String grasaXC,String pesoGrasa,String aguaXC,String pesoAgua) throws SQLException{
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        
        try {
            st.executeUpdate("INSERT INTO consultas ( idPersona, idPaciente, peso, imc, grasaXC, pesoGrasa, aguaXC, pesoAgua) VALUES ("+idPersona+","+idPaciente+",\""+peso+"\",\""+imc+"\",\""+grasaXC+"\",\""+pesoGrasa+"\",\""+aguaXC+"\",\""+pesoAgua+"\")");
            return contador;
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contador;
    }
    public int indicadoresDieteticos(int idPersona, int idPaciente,String cuantasComidasDia,String quienPreparaAlimentos,String entreComidas,String queEntreComidas, String comidasCasaSemana,String comidasCasaFin, 
                                    String comidasFueraSemana, String comidasFueraFin,String modificacionAlimentosSeisMeses,String razonModificacion,String apetito,String horaMasHambre,String alimentosPreferidos,String alimentosNoPreferidos,
                                    String alimentosMalestar,String alimentosAlergico,String cualesAlimentosAlergico,String alimentacionTristeNerviosoAnsioso,String comoAlimentacionTNA,String agregarSal,String grasaCasa,String dietaEspecial,String cuantasDietas,
                                    String haceCuantoDieta,String cuantoTiempoDieta,String razonDietaEspecial,String apegoDietaEspecial,String resultadosDietaEspecial,String medicamentosBajarPeso,String cualesMedicamentos,String otroGrasa) throws SQLException{
        
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        try{
            st.executeUpdate("INSERT INTO indicadoresdieteticos( idPersona, idPaciente, cuantasComidasDia, quienPreparaAlimentos, entreComidas, queEntreComidas, comidasCasaSemana, "
                    + "comidasCasaFin, comidasFueraSemana, comidasFueraFin, modificacionAlimentosSeisMeses, razonModificacion, apetito, horaMasHambre, alimentosPreferidos, "
                    + "alimentosNoPreferidos, alimentosMalestar, alimentosAlergico, cualesAlimentosAlergico, alimentacionTristeNerviosoAnsioso, comoAlimentacionTNA, agregarSal, grasaCasa, dietaEspecial, "
                    + "cuantasDietas, haceCuantoDieta, cuantoTiempoDieta, razonDietaEspecial, apegoDietaEspecial, resultadosDietaEspecial, medicamentosBajarPeso, cualesMedicamentos, otroGrasa)"
                                    + " VALUES ("+idPersona+","+idPaciente+",\""+cuantasComidasDia+"\",'"+quienPreparaAlimentos+"','"+entreComidas+"',\""+queEntreComidas+"\",'"+comidasCasaSemana+"','"+comidasCasaFin+"','"+
                                                comidasFueraSemana+"','"+comidasFueraFin+"','"+modificacionAlimentosSeisMeses+"',\""+razonModificacion+"\",'"+apetito+"','"+horaMasHambre+"','"+alimentosPreferidos+"','"+
                                                alimentosNoPreferidos+"','"+alimentosMalestar+"',\""+alimentosAlergico+"\",\""+cualesAlimentosAlergico+"\",'"+alimentacionTristeNerviosoAnsioso+"',\""+comoAlimentacionTNA+"\",'"+
                                                agregarSal+"',\""+grasaCasa+"\",'"+dietaEspecial+"',\""+cuantasDietas+"\",\""+haceCuantoDieta+"\",\""+cuantoTiempoDieta+"\",\""+razonDietaEspecial+"\",'"+apegoDietaEspecial+"','"+resultadosDietaEspecial+"','"+
                                                medicamentosBajarPeso+"',\""+cualesMedicamentos+"\",\""+otroGrasa+"\")");
            
            return contador;
        }catch(SQLException e){
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, e);
            return contador;
        }
        
        
    }
    public int indicadoresAntropometicos(   int idNutri, int idPaciente, String pesoActual, String pesoHabitual, String estatura, String pcTricipital, String pcBicipital, String pcSubescapular, String pcSuprailiaco
                                            ,String cBrazo, String cCintura, String cCadera, String cAbdominal, String complexion, String pesoTeorico, String pesoTeoricoXC, String pesoHabitualXC, String IMC, String minimoIMC
                                            ,String maximoIMC, String grasaCorporal, String grasaCorporalTotal, String mlGrasa, String difGrasa, String mmTotal, String inCinCad, String aMuscularBrazo, String AguaCorporalTotal) throws SQLException{
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        try{
            st.executeUpdate("INSERT INTO indicadoresantropometicos (idNutri, idPaciente, pesoActual, pesoHabitual, estatura, pcTricipital, pcBicipital, pcSubescapular, "
                    + "pcSuprailiaco, cBrazo, cCintura, cCadera, cAbdominal, complexion, pesoTeorico, pesoTeoricoXC, pesoHabitualXC, IMC, pesoMinimoIMC, pesoMaximoIMC, grasaCorporal, "
                    + "GrasaCorporalTotal, mlGrasa, dierenciaGrasa, mmTotal, iCintutaCadera, aMuscularBrazo, AguaCorporalTotal) VALUES ("+idNutri+","+idPaciente+",'"+pesoActual+"','"+pesoHabitual+"','"+estatura+"','"+pcTricipital+"','"+pcBicipital+"'"
                            + ",'"+pcSubescapular+"','"+pcSuprailiaco+"','"+cBrazo+"','"+cCintura+"','"+cCadera+"','"+cAbdominal+"','"+complexion+"','"+pesoTeorico+"','"+pesoTeoricoXC+"','"+pesoHabitualXC+"','"+IMC+"'"
                                    + ",'"+minimoIMC+"','"+maximoIMC+"','"+grasaCorporal+"','"+grasaCorporalTotal+"','"+mlGrasa+"','"+difGrasa+"','"+mmTotal+"','"+inCinCad+"','"+aMuscularBrazo+"','"+AguaCorporalTotal+"');");
            return contador;
        }catch(SQLException e){
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, e);
            return contador;
        }
    }
    
    public int comprobarUsuario(String usuario, String pass) throws SQLException{
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM datosPersonales WHERE idPersona = "+usuario;
        Statement st = conexion.getConnection().createStatement();
        ResultSet rs = st.executeQuery(query);
        if(rs != null){
            while (rs.next()){
                int id = rs.getInt("idPersona");
                String password = rs.getString("contrasena");
                String nombre = rs.getString("nombre");
                String id2 = Integer.toString(id);
                if(id2.equals(usuario) && password.equals(pass)){
                    System.out.format("%s\n", nombre);
                    contador++;
                }                
            }
            return contador;
        }else{
            return contador;
        }
    }
    public ResultSet ultimaConsulta(int idPaciente){
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM consultas WHERE idPaciente = "+idPaciente+" ORDER BY fechaConsulta DESC LIMIT 1";
        Statement st;
        ResultSet resultado = null ;
        try {
            st = conexion.getConnection().createStatement();
            resultado = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ResultSet cargarPacientesTabla(int idNutriologo){
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM datospersonales WHERE idNutriologo="+idNutriologo+"";
        Statement st;
        ResultSet resultado = null ;
        try {
            st = conexion.getConnection().createStatement();
            resultado = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ResultSet cargarconsultas(String idPaciente){
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM consultas WHERE idPaciente="+idPaciente+"";
        Statement st;
        ResultSet resultado = null ;
        try {
            st = conexion.getConnection().createStatement();
            resultado = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ResultSet cargarPacientePlan(String idPaciente){
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM datospersonales WHERE codigo="+idPaciente+"";
        Statement st;
        ResultSet resultado = null ;
        try {
            st = conexion.getConnection().createStatement();
            resultado = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ResultSet cargarDatosAntecedentesSalud(String idNutri, String idPaciente){
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM antecedentes WHERE idPersona = "+idNutri+" AND idPaciente = "+idPaciente+"";
        Statement st;
        ResultSet resultado = null;
        try {
            st = conexion.getConnection().createStatement();
            resultado = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public ResultSet cargarDatosGinecologicos(String idNutri, String idPaciente){
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM aspectosginecologicos WHERE idPersona = "+idNutri+" AND idPaciente = "+idPaciente+"";
        Statement st;
        ResultSet resultado = null;
        try {
            st = conexion.getConnection().createStatement();
            resultado = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ResultSet cargarActividades(String idNutri, String idPaciente){
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM diarioactividades WHERE idPersona = "+idNutri+" AND idPaciente = "+idPaciente+"";
        Statement st;
        ResultSet resultado = null;
        try {
            st = conexion.getConnection().createStatement();
            resultado = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public ResultSet indicadoresDieta(String idNutri, String idPaciente){
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM indicadoresdieteticos WHERE idPersona = "+idNutri+" AND idPaciente = "+idPaciente+"";
        Statement st;
        ResultSet resultado = null;
        try {
            st = conexion.getConnection().createStatement();
            resultado = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public ResultSet indicadoresAntro(String idNutri, String idPaciente){
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM indicadoresantropometicos WHERE idNutri = "+idNutri+" AND idPaciente = "+idPaciente+"";
        Statement st;
        ResultSet resultado = null;
        try {
            st = conexion.getConnection().createStatement();
            resultado = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
