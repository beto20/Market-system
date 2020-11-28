 
package Model;

 
public class Detalle {
    private int id;
    private int id_producto;
    private int id_factura;
    private int cantidad;
    private double precio;
    private String estado;

    public Detalle() {
    }

    public Detalle(int id_producto, int id_factura, int cantidad, double precio, String estado) {
        this.id_producto = id_producto;
        this.id_factura = id_factura;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Detalle{" + "id=" + id + ", id_producto=" + id_producto + ", id_factura=" + id_factura + ", cantidad=" + cantidad + ", precio=" + precio + ", estado=" + estado + '}';
    }
}
