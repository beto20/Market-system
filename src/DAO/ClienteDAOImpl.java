 
package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    public List<Cliente> listarCliente() {
        sql = "select * from cliente where estado = 'Activo'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setApellidos(rs.getString("apellidos"));
                c.setCorreo(rs.getString("correo"));
                c.setDni(rs.getString("dni"));
                c.setDireccion(rs.getString("direccion"));
                c.setEstado(rs.getString("estado"));
                lista.add(c);
            }
            return lista;
        } catch (SQLException e) {
            System.err.println("Error listar clientes: "+e.getMessage());
            return null;
        }
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        sql = "insert into cliente(nombre,apellidos,correo,dni,direccion,estado) values(?,?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getDni());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getEstado());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error agregar cliente: "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean actualizarCliente(int id ,String nombre, String apellidos, String correo, String dni, String direccion) {
        sql = "update cliente set nombre = ?, apellidos = ?, correo = ?, dni = ?, direccion = ? where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(6, id);
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3, correo);
            ps.setString(4, dni);
            ps.setString(5, direccion);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error actualizar cliente: "+e.getMessage());
            return false;
        }
    }

    @Override
    public Cliente buscarCliente(String dni) {
        sql = "select * from cliente where dni = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery(); 
            if (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setApellidos(rs.getString("apellidos"));
                c.setCorreo(rs.getString("correo"));
                c.setDni(rs.getString("dni"));
                c.setDireccion(rs.getString("direccion"));
                c.setEstado(rs.getString("estado"));
                return c;
            }else{
                return null;
            }   
        } catch (SQLException e) {
            System.err.println("Error al buscar cliente: "+e.getMessage());
            return null;
        }
    }

    @Override
    public void eliminarClienteLogico(int id) {
        sql = "update cliente set estado = ? where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, "Inactivo");
            ps.setInt(2, id);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Error al borrar cliente logico: "+e.getMessage());
        }
    }

    @Override
    public void eliminarClienteFisico(int id) {
        sql = "delete from cliente where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error borrar cliente fisico: "+e.getMessage());
        }
    }
}
