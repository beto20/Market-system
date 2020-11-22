
package Test;

import Model.Categoria;
import DAO.CategoriaDAOImpl;
import java.util.ArrayList;
import java.util.List;


public class TestCategoria {
    public static void main(String[] args){
        
        //MODELO CATEGORIA
        Categoria c = new Categoria();
        //DAO IMPL DE CATEGORIA
        CategoriaDAOImpl cdaoi = new CategoriaDAOImpl(c);
        
        //METODOS:
//        //LISTA TODA UNA TABLA DE LA BASE DE DATOS
//        List<Categoria> lista = new ArrayList<>();
//        lista = cdaoi.listarCategoria();
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getId()+" "+lista.get(i).getNombre()+" "+lista.get(i).getEstado());
//        }
//        //BUSCA UN REGISTRO DE LA BD POR SU CODIGO
//        System.out.println(cdaoi.buscarCategoria(1));
//        ACTUALIZA UN REGISTRO
//        cdaoi.actualizarCategoria("zzzz",1);
//        //ACTUALIZA EL ESTADO A 'Inactivo'
//        cdaoi.eliminarCategoriaLogico(5);
//        //BORRADO EN LA BASE DE DATOS
//        cdaoi.eliminarCategoriaFisico(5);
        
    }
}
