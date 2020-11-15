 
package Beans;

 
public class Producto {
    
    private int id;
    private int id_categoria;
    private String nombre;
    private double precio;
    private int stock;
    private String estado;

    public Producto() {
    }

    public Producto(int id_categoria, String nombre, double precio, int stock, String estado) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }


    
    
    
    
}
