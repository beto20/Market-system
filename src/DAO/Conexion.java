 
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Conexion {
    private final String usuario = "albertoVS";
    private final String pssw = "123";
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=DBTIENDA";
    private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    private boolean cargarDriver(){
        try {
            Class.forName(driver);
            System.out.println("Driver correcto de SQL SERVER");
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
            System.out.println("Conexion exitosa de SQL SERVER");
            return connection;
        } catch (SQLException e) {
            System.err.println("Error de conexion");
            return null;
        }
    }
    
}
