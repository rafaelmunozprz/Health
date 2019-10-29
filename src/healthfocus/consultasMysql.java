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
    
    public int insertarNuevoUsuario(    String id       , String nombre,    String apellidos,   String sexo,    String fechaNacimiento,     String domicilio,   String cp,
                                        String ciudad   , String estatura,  String contrasena) throws SQLException {
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        Date fnac = Date.valueOf(fechaNacimiento);
        try {
            st.executeUpdate("INSERT INTO datospersonales (codigo, nombre, apellidos, sexo, fechaNacimiento, domicilio, cp, ciudad, estatura, rol, contrasena) "
                    +"VALUES ("+id+", '"+nombre+"', '"+apellidos+"', '"+sexo+"', '"+fnac+"', '"+domicilio+"', "+cp+", '"+ciudad+"', "+estatura+", 'nutriologo', '"+contrasena+"')");
            return contador;
        } catch (SQLException ex) {
            Logger.getLogger(consultasMysql.class.getName()).log(Level.SEVERE, null, ex);
            return contador;
        }        
    }
    public int insertarNuevoPaciente(String dpID, String nombre, String apellidos, String sexo, String nac, String edad,String domicilio, String cp, String ciudad, String escolaridad, String estadoC, String telefono, String email) throws SQLException{
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        Date nacimiento = Date.valueOf(nac);
        try {
            st.executeUpdate("INSERT INTO datospersonales (codigo, nombre, apellidos, sexo, fechaNacimiento, domicilio, cp, ciudad, , rol, ) "
                    +"VALUES ("+dpID+", '"+nombre+"', '"+apellidos+"', '"+sexo+"', '"+nacimiento+"', '"+domicilio+"', "+cp+", '"+ciudad+"',  'nutriologo')");
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
    public int indicadoresDieteticos(int idPersona, int idPaciente,String cuantasComidasDia,String quienPreparaAlimentos,String entreComidas,String queEntreComidas, String comidasCasaSemana,String comidasCasaFin, 
                                    String comidasFueraSemana, String comidasFueraFin,String modificacionAlimentosSeisMeses,String razonModificacion,String apetito,String horaMasHambre,String alimentosPreferidos,String alimentosNoPreferidos,
                                    String alimentosMalestar,String alimentosAlergico,String cualesAlimentosAlergico,String alimentacionTristeNerviosoAnsioso,String comoAlimentacionTNA,String agregarSal,String grasaCasa,String dietaEspecial,String cuantasDietas,
                                    String haceCuantoDieta,String cuantoTiempoDieta,String razonDietaEspecial,String apegoDietaEspecial,String resultadosDietaEspecial,String medicamentosBajarPeso,String cualesMedicamentos,String otroGrasa) throws SQLException{
        System.out.println("idPersona: " + idPersona);
        System.out.println("idPaciente: " + idPaciente);
        System.out.println("quienPreparaAlimento: " + quienPreparaAlimentos);
        System.out.println("entreComidas: " + entreComidas);
        System.out.println("queEntreComidas: " + queEntreComidas);
        System.out.println("comidasCasaSemana: " + comidasCasaSemana);
        System.out.println("comidasCasaFin: " + comidasCasaFin);
        System.out.println("comidasFueraSemana: " + comidasFueraSemana);
        System.out.println("comidasFueraFin: " + comidasFueraFin);
        System.out.println("modificacionAlimentosSeisMeses:" + modificacionAlimentosSeisMeses);
        System.out.println("razonModificacion: " + razonModificacion);
        System.out.println("apetito: " + apetito);
        System.out.println("horaMasHambre: " + horaMasHambre);
        System.out.println("alimentosPreferidos: " + alimentosPreferidos);
        System.out.println("alimentosNoPreferidos: " +alimentosNoPreferidos);
        System.out.println("alimentosMalestar: " + alimentosMalestar);
        System.out.println("alimentosAlergico: " + alimentosAlergico);
        System.out.println("cualesAlimentosAlergico: " + cualesAlimentosAlergico);
        System.out.println("alimentacionTristeNerviosoAnsioso: " + alimentacionTristeNerviosoAnsioso);
        System.out.println("comoAlimentacionTNA: " + comoAlimentacionTNA);
        System.out.println("agregarSal: " + agregarSal);
        System.out.println("grasaCasa: " + grasaCasa);
        System.out.println("dietaEspecial: " + dietaEspecial);
        System.out.println("cuantasDietas: " + cuantasDietas);
        System.out.println("haceCuantoDieta: " + haceCuantoDieta);
        System.out.println("cuantoTiempoDieta: " + cuantoTiempoDieta);
        System.out.println("razonDietaEspecial: " + razonDietaEspecial);
        System.out.println("apegoDietaEspecial: " + apegoDietaEspecial);
        System.out.println("resultadosDietaEspecial: " + resultadosDietaEspecial);
        System.out.println("medicamentosBajarPeso: " + medicamentosBajarPeso);
        System.out.println("cualesMedicamentos: " + cualesMedicamentos);
        System.out.println("otroGrasa: " + otroGrasa);
        int contador = 0;
        conexionMysql conexion = new conexionMysql();
        Statement st = conexion.getConnection().createStatement();
        try{
            st.executeUpdate("INSERT INTO indicadoresdieteticos( idPersona, idPaciente, cuantasComidasDia, quienPreparaAlimentos, entreComidas, queEntreComidas, comidasCasaSemana, "
                    + "comidasCasaFin, comidasFueraSemana, comidasFueraFin, modificacionAlimentosSeisMeses, razonModificacion, apetito, horaMasHambre, alimentosPreferidos, "
                    + "alimentosNoPreferidos, alimentosMalestar, alimentosAlergico, cualesAlimentosAlergico, alimentacionTristeNerviosoAnsioso, comoAlimentacionTNA, agregarSal, grasaCasa, dietaEspecial, "
                    + "cuantasDietas, haceCuantoDieta, cuantoTiempoDieta, razonDietaEspecial, apegoDietaEspecial, resultadosDietaEspecial, medicamentosBajarPeso, cualesMedicamentos, otroGrasa)"
                                    + " VALUES ("+idPersona+","+idPaciente+","+cuantasComidasDia+",'"+quienPreparaAlimentos+"','"+entreComidas+"',\""+queEntreComidas+"\",'"+comidasCasaSemana+"','"+comidasCasaFin+"','"+
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
    
    public ResultSet cargarPacientesTabla(){
        conexionMysql conexion = new conexionMysql();
        String query = "SELECT * FROM datospersonales";
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

}
