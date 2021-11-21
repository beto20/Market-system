
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionMySQL {
    private final String usuario = "root";
    private final String pssw = "";
    private final String url = "jdbc:mysql://localhost:3306/dbtienda";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    private boolean cargarDriver(){
        try {
            Class.forName(driver);
            System.out.println("Driver correcto de MySQL");
            return true;
        } catch (ClassNotFoundException e) {
            System.err.println("Error, al cargar el driver "+e.getMessage());
            return false;
        }
    }
    
    public final Connection conexion(){
        if (!cargarDriver()) {
            return null;
        }
        try {
            Connection connection = DriverManager.getConnection(url, usuario, pssw);
            System.out.println("Conexion exitosa de MySQL");
            return connection;
        } catch (SQLException e) {
            System.err.println("Error de conexion");
            return null;
        }
    }
    
    
//     // Librería de MySQL
//    public String driver = "com.mysql.jdbc.Driver";
//
//    // Nombre de la base de datos
//    public String database = "databasemovies";
//
//    // Host
//    public String hostname = "localhost";
//
//    // Puerto
//    public String port = "3306";
//
//    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
//    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
//
//    // Nombre de usuario
//    public String username = "root";
//
//    // Clave de usuario
//    public String password = "123456789";
//
//    public Connection conectarMySQL() {
//        Connection conn = null;
//
//        try {
//            Class.forName(driver);
//            conn = DriverManager.getConnection(url, username, password);
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//
//        return conn;
//    }
//    
    
}
