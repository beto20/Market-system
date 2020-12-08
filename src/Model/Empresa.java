
package Model;

public class Empresa {
    private int id;
    private String nombre;
    private String razon;
    private String ruc;
    private String telefono;
    private String lugar;
    private String correo;

    public Empresa(String nombre, String razon, String ruc, String telefono, String lugar, String correo) {
        this.nombre = nombre;
        this.razon = razon;
        this.ruc = ruc;
        this.telefono = telefono;
        this.lugar = lugar;
        this.correo = correo;
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

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + ", razon=" + razon + ", ruc=" + ruc + ", telefono=" + telefono + ", lugar=" + lugar + ", correo=" + correo + '}';
    }
}
