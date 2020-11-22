 
package Test;

import DAO.ProductoDAOImpl;
import Model.Producto;
import java.util.ArrayList;
import java.util.List;

 
public class TestProducto {
 
    public static void main(String[] args) {
//        Producto p = new Producto();
//        ProductoDAOImpl pdaoi = new ProductoDAOImpl(p);
        
//       List<Producto> lista = new ArrayList<>();
//        lista = pdaoi.listarProducto("aaaa");
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getId()+" "+lista.get(i).getNombre()+" "+lista.get(i).getEstado());
//        }
//        
//        System.out.println("datos: "+pdaoi.buscarProducto(3, "Frutas"));
        
        Producto p1 = new Producto(1, "Aguayu", 2.00, 2, "Activo");
        ProductoDAOImpl pdaoi = new ProductoDAOImpl(p1);
        pdaoi.agregarProducto(p1);
        
    }
    
}
