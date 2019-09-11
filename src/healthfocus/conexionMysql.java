package healthfocus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kevin
 */
public class conexionMysql {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "data1122";
    private static final String url = "jdbc:mysql://localhost:3306/healthfocus";

    public conexionMysql() {
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            if(conn != null){
                System.out.println("Estas conectado.");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexion " + e + ".");
        }
    }
    
    //Este método retorna la conexion
    public Connection getConnection(){
        return conn;
    }
    
    //Este método nos desconecta de la base de datos
    public void desconectar(){
        conn = null;
        if(conn == null){
            System.out.println("Conexion terminada.");
        }
    }
}
