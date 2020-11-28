
package DAO;

import Model.ModoPago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ModoPagoDAOImpl implements ModoPagoDAO{
    String sql;
    ModoPago mp;
    PreparedStatement ps;
    ResultSet rs;
    Conexion conexion = new Conexion();
    Connection connection = conexion.conexion();
    List<ModoPago> lista = new ArrayList<>();

    public ModoPagoDAOImpl(ModoPago mp) {
        this.mp = mp;
    }

    @Override
    public List<ModoPago> listarModoPago() {
        sql = "select * from modo_pago where estado = 'Activo'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                mp = new ModoPago();
                mp.setId(rs.getInt("id"));
                mp.setNombre(rs.getString("nombre"));
                mp.setOtrosDetalles(rs.getString("otros_detalles"));
                mp.setEstado(rs.getString("estado"));
                lista.add(mp);
            }
            return lista;
        } catch (SQLException e) {
            System.err.println("Error al listar Modo de pago "+e.getMessage());
            return null;
        }
    }

    @Override
    public boolean agregarModoPago(ModoPago modopago) {
        sql = "insert into modo_pago(nombre,otros_detalles,estado) values (?, ?, ?);";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, modopago.getNombre());
            ps.setString(2, modopago.getOtrosDetalles());
            ps.setString(3, modopago.getEstado());
            ps.executeUpdate();
            return true; 
        } catch (SQLException e) {
            System.err.println("Error al agregar modo de pago "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean actualizarModoPago(int id, String nombre, String detalle) {
        sql = "update modo_pago set nombre = ?, otros_detalles = ? where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(3, id);
            ps.setString(1, nombre);
            ps.setString(2, detalle);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al actualizar");
            return false;
        }
    }

    @Override
    public ModoPago buscarModoPago(int id) {
        sql = "select * from modo_pago where estado = 'Activo' where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                mp.setId(rs.getInt("id"));
                mp.setNombre(rs.getString("nombre"));
                mp.setOtrosDetalles(rs.getString("otros_detalles"));
                mp.setEstado(rs.getString("estado"));
            }
            return mp;
        } catch (SQLException e) {
            System.err.println("Error al buscar metodo de pago "+e.getMessage());
            return null;
        }
    }

    @Override
    public void eliminarModoPagoLogico(int id) {
        sql = "update modo_pago set estado = 'Inactivo' where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar modo de pago logico "+e.getMessage());
        }
    }

    @Override
    public void eliminarModoPagoFisico(int id) {
        sql = "delete modo_pago where id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar modo de pago fisico "+e.getMessage());
        }
    }
}
