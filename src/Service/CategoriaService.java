 
package Service;

import Model.Categoria;
import java.util.List;

 
public interface CategoriaService {
    public List<Categoria> listarCategoria();
    public boolean agregarCategoria(Categoria categoria);
    public Categoria buscarCategoria(int id);
    public boolean actualizarCategoria(String nombre, int id);
    public void eliminarCategoriaLogico(int id);
    public void eliminarCategoriaFisico(int id);
}
