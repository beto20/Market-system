 
package Test;

import DAO.Conexion;

 
public class TestConexionSQLServer {

 
    public static void main(String[] args) {
        Conexion c = new Conexion();
        if (c.conexion() != null) {
            System.out.println("Correcto SQL SSERVER");
        }else{
            System.out.println("Error SQL SERVER");
        }
    }
    
}
