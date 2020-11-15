 
package Test;

import DAO.Conexion;

 
public class TestConexion {

 
    public static void main(String[] args) {
        Conexion c = new Conexion();
        if (c.conexion() != null) {
            System.out.println("Correcto");
        }else{
            System.out.println("Error");
        }
    }
    
}
