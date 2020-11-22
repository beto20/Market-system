 
package Service;

import Model.Cliente;
import java.util.List;

 
public interface ClienteService {
    public List<Cliente> listarCliente();
    public boolean agregarCliente(Cliente cliente);
    public boolean actualizarCliente(int id ,String nombre, String apellidos, String correo, String dni, String direccion);
    public Cliente buscarCliente(String id);
    public void eliminarClienteLogico(int id);
    public void eliminarClienteFisico(int id);
    
    
}
