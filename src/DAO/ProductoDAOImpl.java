
package DAO;

import Model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class ProductoDAOImpl implements ProductoDAO {

    String sql;
    Producto p;
    PreparedStatement ps;
    ResultSet rs;
    Conexion conexion = new Conexion();
    Connection connection = conexion.conexion();
    List<Producto> lista = new ArrayList<>();
    

    public ProductoDAOImpl(Producto p) {
        this.p = p;
    }
    
    public void consultarCategorias(JComboBox cmbCat){
        sql = "select nombre from categoria where estado='Activo'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            cmbCat.addItem("Seleccione una categoria");
            while (rs.next()) {                
                cmbCat.addItem(rs.getString("nombre"));
            }
            
        } catch (SQLException e) {
            System.err.println("Error "+e.getMessage());
        }
    }
    
    public Producto listaProductoId(int id){
         sql = "Select * from producto where id = ? and estado = 'Activo'";
        
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                return p;
            }else{
                return null;
            }
            
            
        } catch (SQLException e) {
            System.err.println("Error al buscar producto "+e.getMessage());
            return null;
        }
    }
    
    
    @Override
    public List<Producto> listarProducto(String categoria) {
        sql = "select p.id , p.nombre, p.precio, p.stock, p.estado from producto as p \n" +
                "inner join categoria as c on p.id_categoria = c.id\n" +
                "where c.estado = 'Activo' and p.estado = 'Activo' and c.nombre = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, categoria);
            rs = ps.executeQuery();
            while (rs.next()) {                
                p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
                lista.add(p);
            }
            return lista;
            
            
        } catch (SQLException e) {
            System.err.println("Error al listar"+e.getMessage());
            return null;
        }
        
    }

    @Override
    public boolean agregarProducto(Producto producto) {
        sql = "insert into producto(id_categoria,nombre,precio,stock,estado) values (?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, producto.getId_categoria());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setString(5, producto.getEstado());
            ps.executeUpdate();    
            return true;
        } catch (SQLException e) {
            System.err.println("Error al agregar producto "+e.getMessage());
            return false;
        }
        
    }

    @Override
    public boolean actualizarProducto(int id, String nombre, Double precio, int stock) {
        sql = "update producto set nombre = ?, precio = ?, stock = ? where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(4, id);
            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.setInt(3, stock);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al actualizar producto "+e.getMessage());
            return false;
        }
    }

    @Override
    public Producto buscarProducto(int id, String categoria) {
        sql = "select p.id , p.nombre, p.precio, p.stock, p.estado from producto as p \n" +
                "inner join categoria as c on p.id_categoria = c.id\n" +
                "where c.estado = 'Activo' and p.estado = 'Activo' and c.nombre =? and p.id =?";
        
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(2, id);
            ps.setString(1, categoria);
            rs = ps.executeQuery();
            if (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
                return p;
            }else{
                return null;
            }
            
            
        } catch (SQLException e) {
            System.err.println("Error al buscar producto "+e.getMessage());
            return null;
        }
    }

    @Override
    public void eliminarProductoLogico(int id) {
        sql = "update producto set estado = ? where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, "Inactivo");
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar producto logico"+e.getMessage());
        }

    }

    @Override
    public void eliminarProductoFisico(int id) {
        sql = "delete producto where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar producto fisico"+e.getMessage());
        }
    }
    
}
