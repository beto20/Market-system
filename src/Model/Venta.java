
package Model;


public class Venta {
    private int id;
    private int id_cliente;
    private int id_modo_pago;
    private double monto;
    private String fecha;
    private String estado;

    public Venta() {
    }

    public Venta(int id_cliente, int id_modo_pago, double monto, String fecha, String estado) {
        this.id_cliente = id_cliente;
        this.id_modo_pago = id_modo_pago;
        this.monto = monto;
        this.fecha = fecha;
        this.estado = estado;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_modo_pago() {
        return id_modo_pago;
    }

    public void setId_modo_pago(int id_modo_pago) {
        this.id_modo_pago = id_modo_pago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", id_cliente=" + id_cliente + ", id_modo_pago=" + id_modo_pago + ", monto=" + monto + ", fecha=" + fecha + ", estado=" + estado + '}';
    }
}
