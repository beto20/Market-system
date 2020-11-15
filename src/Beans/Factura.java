
package Beans;


public class Factura {
    private int id;
    private int id_cliente;
    private int id_modo_pago;
    private String fecha;
    private String estado;

    public Factura() {
    }

    public Factura(int id_cliente, int id_modo_pago, String fecha, String estado) {
        this.id_cliente = id_cliente;
        this.id_modo_pago = id_modo_pago;
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

    

    
}
