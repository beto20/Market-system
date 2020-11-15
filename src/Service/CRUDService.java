 
package Service;

import Beans.Categoria;
import java.util.List;

 
public interface CRUDService {
    public List<Categoria> listar();
    public boolean agregar(Object object);
    public Categoria buscar(int id);
    public boolean actualizar(String nombre, int id);
    public void eliminarLogico(int id);
    public void eliminarFisico(int id);
}
