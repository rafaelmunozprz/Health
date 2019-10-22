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
