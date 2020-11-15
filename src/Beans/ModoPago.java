 
package Beans;

 
public class ModoPago {
    
    private int id;
    private String nombre;
    private String otrosDetalles;
    private String estado;

    public ModoPago() {
    }

    public ModoPago(String nombre, String otrosDetalles, String estado) {
        this.nombre = nombre;
        this.otrosDetalles = otrosDetalles;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOtrosDetalles() {
        return otrosDetalles;
    }

    public void setOtrosDetalles(String otrosDetalles) {
        this.otrosDetalles = otrosDetalles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
