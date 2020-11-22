
package Service;

import Model.Producto;
import java.util.List;


public interface ProductoService {
    public List<Producto> listarProducto(String categoria);
    public boolean agregarProducto(Producto producto);
    public boolean actualizarProducto(int id, String nombre, Double precio, int stock);
    public Producto buscarProducto(int id, String categoria);
    public void eliminarProductoLogico(int id);
    public void eliminarProductoFisico(int id);
    
}
