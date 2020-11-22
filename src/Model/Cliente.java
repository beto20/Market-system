 
package Model;

 
public class Cliente {
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String dni;
    private String direccion;
    private String estado;

    public Cliente() {
    }

    public Cliente(String nombre, String correo, String dni, String direccion, String estado) {
        this.nombre = nombre;
        this.correo = correo;
        this.dni = dni;
        this.direccion = direccion;
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

    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", dni=" + dni + ", direccion=" + direccion + ", estado=" + estado + '}';
    }
    
    
    
    
}
