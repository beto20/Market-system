
package Test;

import DAO.ClienteDAOImpl;
import Model.Cliente;


public class TestCliente {
    
    public static void main(String[] arg){
        System.out.print("prueba cliente");
        Cliente c = new Cliente();
        ClienteDAOImpl cdaoi = new ClienteDAOImpl(c);
        System.out.println(cdaoi.buscarCliente("123"));
        
    }
    
}
