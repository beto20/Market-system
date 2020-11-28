
package DAO;

import Model.Detalle;
import Model.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;


public class VentaDAOImpl implements VentaDAO{

    String sql;
    Venta v;
    PreparedStatement ps;
    ResultSet rs;
    Conexion conexion = new Conexion();
    Connection connection = conexion.conexion();
    List<Venta> lista = new ArrayList<>();
    
    public VentaDAOImpl(Venta v) {
        this.v = v;
    }
    
    public void metodosPago(JComboBox cmbModoPago){
        sql = "select nombre from modo_pago where estado='Activo'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            cmbModoPago.addItem("Seleccione un modo de pago");
            while (rs.next()) {                
                cmbModoPago.addItem(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.err.println("Error "+e.getMessage());
        }
    }    
    
    @Override
    public String IdVentas() {
        sql = "select MAX(id) from factura where estado = 'Activo'";
        String idv = "";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                idv = rs.getString(1);
            }
            return idv;
        } catch (SQLException e) {
            System.err.println("Error de listado "+e.getMessage());
            return null;
        }
    }

    @Override
    public boolean guardarVentas(Venta venta) {
        sql = "insert into factura(id_cliente,id_modo_pago,monto,fecha,estado) values (?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, venta.getId_cliente());
            ps.setInt(2, venta.getId_modo_pago());
            ps.setDouble(3, venta.getMonto());
            ps.setString(4, venta.getFecha());
            ps.setString(5, venta.getEstado());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al agregar venta "+e.getMessage());
            return false;
        }
    }
}
