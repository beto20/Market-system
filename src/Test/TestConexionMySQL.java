
package Test;

import DAO.ConexionMySQL;


public class TestConexionMySQL {


    public static void main(String[] args) {
        

        ConexionMySQL c = new ConexionMySQL();
        if (c.conexion() != null) {
            System.out.println("Correcto MySQL");
        }else{
            System.out.println("Error MySQL");
        }
    }
}
