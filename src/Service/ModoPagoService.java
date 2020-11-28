
package Service;

import Model.ModoPago;
import java.util.List;


public interface ModoPagoService {
    public List<ModoPago> listarModoPago();
    public boolean agregarModoPago(ModoPago modopago);
    public boolean actualizarModoPago(int id, String nombre, String detalle);
    public ModoPago buscarModoPago(int id);
    public void eliminarModoPagoLogico(int id);
    public void eliminarModoPagoFisico(int id);   
}
