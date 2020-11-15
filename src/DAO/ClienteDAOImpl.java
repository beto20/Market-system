 
package DAO;

import Beans.Categoria;
import Beans.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

 
public class ClienteDAOImpl implements ClienteDAO{
    Cliente c;
    String sql;
    ResultSet rs;
    PreparedStatement ps;
    Conexion conexion = new Conexion();
    Connection connection = conexion.conexion();
    List<Cliente> lista = new ArrayList<>();

    public ClienteDAOImpl(Cliente c) {
        this.c = c;
    }
    
    @Override
    public List<Categoria> listar() {
        sql = "select * from ";
        try {
            
            
            
            return lista;
        } catch (Exception e) {
            System.out.println("Error al listar: "+e.getMessage());
            return null;
        }
    }

    @Override
    public boolean agregar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(String nombre, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarLogico(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarFisico(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
