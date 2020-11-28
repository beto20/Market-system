
package DAO;

import Model.Detalle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DetalleDAOImpl implements DetalleDAO{
    Detalle d;
    String sql;
    PreparedStatement ps;
    Conexion conexion = new Conexion();
    Connection connection = conexion.conexion();
    
    public DetalleDAOImpl(Detalle d){
        this.d = d;
    }
    
    @Override
    public boolean guardarDetalleVenta(Detalle detalle) {
        sql = "insert into detalle(id_factura,id_producto,cantidad,precio,estado) values (?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, detalle.getId_factura());
            ps.setInt(2, detalle.getId_producto());
            ps.setInt(3, detalle.getCantidad());
            ps.setDouble(4, detalle.getPrecio());
            ps.setString(5, detalle.getEstado());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al agregar detalle "+e.getMessage());
            return false;
        }
    }
}
