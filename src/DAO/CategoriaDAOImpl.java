 
package DAO;

import Beans.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 
public class CategoriaDAOImpl implements CategoriaDAO{
    //string para la consulta
    String sql;
    //ID del modelo 
    Categoria c;
    //clase resultset para recuperar los resultados
    ResultSet rs;
    //clase preparestament para pasar la consulta como argumento y ejecutar consulta
    PreparedStatement ps;
    //clase conexion instanciada
    Conexion conexion = new Conexion();
    //clase Connection
    Connection connection = conexion.conexion();
    //objeto instanciado de la interfaz List, usando ArrayList(); 
    List lista = new ArrayList();
    
    //constructor con el modelo
    public CategoriaDAOImpl(Categoria c) {
        this.c = c;
    }

    @Override
    public List<Categoria> listarCategoria() {
        sql="select * from categoria where estado='Activo'";
        try {
//          connection = conexion.conexion();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                c = new Categoria();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setEstado(rs.getString("estado"));
                lista.add(c);
            } 
//            rs.close();
//            ps.close();
//            connection.close();
            return lista;
        } catch (SQLException e) {
            System.err.println("Error en la lista "+e.getMessage());
            return null;
        }
    }
    


    @Override
    public boolean agregarCategoria(Categoria categoria) {
        sql = "insert into categoria(nombre,estado) values (?, ?)";
        try {
//            c = new Categoria();
            ps = connection.prepareStatement(sql);
            ps.setString(1, categoria.getNombre());
            ps.setString(2, "Activo");
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error agregado"+e.getMessage());
            return false;
        }
    }

    @Override
    public Categoria buscarCategoria(int id) {
        sql =  "select * from categoria where id = ?";
        try {
            ps = connection.prepareCall(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                c.setId(Integer.parseInt(rs.getString(1)));
                c.setNombre(rs.getString(2));
                c.setEstado(rs.getString(3));
            }else{
                return null;
            }
            return c;
        } catch (NumberFormatException | SQLException e) {
            System.err.println("Error al buscar: "+e.getMessage());
            return null;
        }
    }

    @Override
    public boolean actualizarCategoria(String nombre, int id) {
        sql = "update categoria set nombre = ? where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al actualizar: "+e.getMessage());
            return false;
        }
    }

    @Override
    public void eliminarCategoriaLogico(int id) {
        sql = "update categoria set estado = ? where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1,"Inactivo");
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error de borrado logico: "+e.getMessage());
        }
    }
    
    
    @Override
    public void eliminarCategoriaFisico(int id) {
        sql = "delete categoria where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error de borrado fisico: "+e.getMessage());
        }
    }

    
    
}
